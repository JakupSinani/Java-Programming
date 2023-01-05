package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Recruitment {
    private String companyName;
    private String designation;
    private String employeeName;
    private double salary;
    private boolean status;

    public Recruitment() {
    }

    public Recruitment(String companyName, String designation, String employeeName, double salary, boolean status) {
        this.companyName = companyName;
        this.designation = designation;
        this.employeeName = employeeName;
        this.salary = salary;
        this.status = status;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return this.companyName + " " + this.employeeName + " " + this.designation + " " + this.salary + " " + this.status;
    }

    public static void main(String[] args) {
        //  creating an ArrayList of Student type
        ArrayList<Recruitment> list = new ArrayList<>();

        //  adding entries in above list
        //  using add() method
        list.add(new Recruitment("abc consultant", "Veton", "Ismaili", 100000, true));
        list.add(new Recruitment("nyc consultant", "Rilind", "Limani", 90000, true));
        list.add(new Recruitment("abscc consultant", "Armin", "Sinani", 70000, true));
        list.add(new Recruitment("nj consultant", "Armin", "Alili", 200000, false));
        list.add(new Recruitment("xyz consultant", "Ardit", "Ismaili", 150000, true));
        list.add(new Recruitment("akl consultant", "Jakup", "Sinani", 810000, false));

        //  message on console for better readability
        System.out.println("Unsorted order of the details");

        //  iterationg over entries to print them
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //  sorting the entries by company name
        Collections.sort(list, new GetDataByCompanyName());
        System.out.println("\nSorted by CompanyName");

        //  we will get the sorted order now by company name
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //Sorting the entrie by salary
        Collections.sort(list, new GetDataBySalary());
        System.out.println("\nSorted by salary");

        //  we will get the sorted order now by salary
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //  Sorting the entries by designation
        Collections.sort(list, new GetDataByDesignation());
        System.out.println("\nSorted by designation");

        //  we will get the sorted order now by designation
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //  sorting the entries by designation and salary
        Collections.sort(list, new GetDataByDesignationAndSalary());
        System.out.println("\nSorted by designation and salary");

        //  we will get the sorted order now by salary
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}

