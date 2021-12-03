package task9_10;

public class Employee {
    protected String firstName, secondName;
    protected double fixedSalary;

    public Employee(String firstName, String secondName, double fixedSalary) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.fixedSalary = fixedSalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", fixedSalary=" + fixedSalary +
                '}';
    }
}
