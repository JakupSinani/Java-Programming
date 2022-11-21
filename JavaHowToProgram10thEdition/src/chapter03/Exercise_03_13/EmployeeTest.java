package chapter03.Exercise_03_13;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee joe = new Employee("Joe", "Rogan", 5656);
        Employee tod = new Employee("Tod", "Howard", 8595);
        System.out.println(joe);
        System.out.println(tod);

        joe.setMonthlySalary(joe.getMonthlySalary() * 1.1);
        tod.setMonthlySalary(tod.getMonthlySalary() * 1.1);
        System.out.println("Salary after 10% boost");
        System.out.println(joe.getMonthlySalary());
        System.out.println(tod.getMonthlySalary());
    }
}
