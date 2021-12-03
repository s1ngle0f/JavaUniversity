package task9_10;

import java.util.List;

public class TopManager extends Employee implements EmployeePosition{

    private List<EmployeePosition> slaves;
    private double salaryOfSlaves;

    public TopManager(String firstName, String secondName, double fixedSalary, List<EmployeePosition> slaves) {
        super(firstName, secondName, fixedSalary);
        this.slaves = slaves;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double calcSalary() {
        salaryOfSlaves = 0;
        for (EmployeePosition i : slaves)
        {
            salaryOfSlaves += i.calcSalary();
        }
        if(salaryOfSlaves >= 10000000)
            return fixedSalary*2.5;
        return fixedSalary;
    }

    @Override
    public String toString() {
        return "TopManager{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", fixedSalary=" + fixedSalary +
                '}';
    }
}
