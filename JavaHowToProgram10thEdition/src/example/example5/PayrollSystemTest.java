package example.example5;

public class PayrollSystemTest {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployed = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
        CommisionEmployee commisionEmployee = new CommisionEmployee("Sue", "Jones", "333-33-3333", 10000, .06);
        BasePlusCommisionEmployee basePlusCommisionEmployee = new BasePlusCommisionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300);

        System.out.println("Employees procesed individually: ");
        System.out.printf("%n%s%n%s: $%,.2f%n%n", salariedEmployed, "earned", salariedEmployed.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n", hourlyEmployee, "earned", hourlyEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n", commisionEmployee, "earned", commisionEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n", basePlusCommisionEmployee, "earned", basePlusCommisionEmployee.earnings());

        Employee[] employees = new Employee[4];
        employees[0] = salariedEmployed;
        employees[1] = hourlyEmployee;
        employees[2] = commisionEmployee;
        employees[3] = basePlusCommisionEmployee;

        System.out.printf("Employees processed polymorphically:%n%n");

        for (Employee currentEmploye : employees) {
            if (currentEmploye instanceof BasePlusCommisionEmployee) {
                BasePlusCommisionEmployee employee = (BasePlusCommisionEmployee) currentEmploye;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf("new base salary with 10%% increase is: $%,.2f%n", employee.getBaseSalary());
            }
            System.out.printf("earned $%,.2f%n%n", currentEmploye.earnings());
        }
        for (int j = 0; j < employees.length; j++) {
            System.out.printf("Employee %d is a %s%n", j, employees[j].getClass().getName());
        }


    }
}
