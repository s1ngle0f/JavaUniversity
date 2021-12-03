package task9_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Company {
    private List<EmployeePosition> subordinates, topManagers;

    public Company(int countOfOperators, int countOfManagers, int countOfTopManagers){
        subordinates = new ArrayList<>();
        topManagers = new ArrayList<>();
        hireAll(0, countOfOperators);
        hireAll(1, countOfManagers);
        hireAll(2, countOfTopManagers);
    }

    public List<EmployeePosition> getSubordinates() {
        return subordinates;
    }

    public List<EmployeePosition> getTopManagers() {
        return topManagers;
    }

    public void hire(int r){
            switch (r){
                case 0:
                    subordinates.add(new Operator("Name" + subordinates.size(), "Familiya" + subordinates.size(),
                            (int)(70000 + Math.random() * 10000 )));
                    break;
                case 1:
                    subordinates.add(new Manager("Name" + subordinates.size(), "Familiya" + subordinates.size(),
                            (int)(100000 + Math.random() * 25000 )));
                    break;
                case 2:
                    topManagers.add(new TopManager("Name" + topManagers.size(), "Familiya" + topManagers.size(),
                            (int)(300000 + Math.random() * 50000 ), subordinates));
                    break;
        }
    }

    public void hireAll(int r, int size){
        int counter = 0;
        while ( counter < size ){
            switch (r){
                case 0:
                    subordinates.add(new Operator("Name" + subordinates.size(), "Familiya" + subordinates.size(),
                            (int)(70000 + Math.random() * 10000 )));
                    break;
                case 1:
                    subordinates.add(new Manager("Name" + subordinates.size(), "Familiya" + subordinates.size(),
                            (int)(100000 + Math.random() * 25000 )));
                    break;
                case 2:
                    topManagers.add(new TopManager("Name" + topManagers.size(), "Familiya" + topManagers.size(),
                            (int)(300000 + Math.random() * 50000 ), subordinates));
                    break;
            }
            counter++;
        }
    }

    public void fire(int count){
        int counter = 0;
        while (counter < count) {
            int deleteItem = (int) (Math.random() * subordinates.size());
            subordinates.remove(deleteItem);
            counter++;
        }
    }

    public double getIncome(){
        double salaryOfSlaves = 0;
        for (EmployeePosition i : subordinates)
        {
            salaryOfSlaves += i.calcSalary();
        }
        for (EmployeePosition i : topManagers)
        {
            salaryOfSlaves += i.calcSalary();
        }
        return salaryOfSlaves;
    }

    public List<EmployeePosition> getLowestSalaryStaff(int count){
        if(count > subordinates.size())
            count = subordinates.size();
        List<EmployeePosition> localArr = new ArrayList<>();
        localArr.addAll(topManagers);
        localArr.addAll(subordinates);
        Collections.sort(localArr, new Comparator<EmployeePosition>() {
            public int compare(EmployeePosition o1, EmployeePosition o2) {
                return Double.compare(o1.calcSalary(), o2.calcSalary());
            }
        });
        return localArr.subList(0, count);
    }

    public List<EmployeePosition> getTopSalaryStaff(int count){
        if(count > subordinates.size())
            count = subordinates.size();
        List<EmployeePosition> localArr = new ArrayList<>();
        localArr.addAll(topManagers);
        localArr.addAll(subordinates);
        Collections.sort(localArr, new Comparator<EmployeePosition>() {
            public int compare(EmployeePosition o1, EmployeePosition o2) {
                return Double.compare(o1.calcSalary(), o2.calcSalary());
            }
        });
        return localArr.subList(localArr.size()-count, localArr.size());
    }

    public void print(List<EmployeePosition> list, int r){
        switch (r) {
            case 0:
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i).toString());
                }
            case 1:
                for (int i = list.size() - 1; i >= 0; i--) {
                    System.out.println(list.get(i).toString());
                }
        }
    }
}
