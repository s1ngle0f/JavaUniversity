package task9_10;

public class Main {
    public static void main(String[] args)
    {
        Company company = new Company(180, 80, 10);
        System.out.println("TOP:");
        company.print(company.getTopSalaryStaff(5), 1);
        System.out.println("LOWEST:");
        company.print(company.getLowestSalaryStaff(10), 1);
        company.fire((company.getSubordinates().size() + company.getTopManagers().size()) - 30);
        System.out.println("TOP:");
        company.print(company.getTopSalaryStaff(5), 1);
        System.out.println("LOWEST:");
        company.print(company.getLowestSalaryStaff(10), 1);
    }
}
