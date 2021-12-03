package task9_10;

public class Manager extends Employee implements EmployeePosition{

    private double bonus;
    public Manager(String firstName, String secondName, double fixedSalary) {
        super(firstName, secondName, fixedSalary);
        this.bonus = ( 115000 + Math.random() * 25000 ) * 0.05;
    }

    @Override
    public double calcSalary() {
        return fixedSalary + bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", fixedSalary=" + fixedSalary +
                '}';
    }
}
