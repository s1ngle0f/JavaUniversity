package task9_10;

public interface EmployeePosition {
    default String getJobTitle(){
        return getClass().getSimpleName();
    }
    double calcSalary();
}
