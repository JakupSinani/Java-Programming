package chapter10.exercise_10_02;

public class Employee extends Person{
    private  int office;
    private double salary;
    private MyDate dataHired;

    public Employee(int office, double salary) {
        this.office = office;
        this.salary = salary;
    }

    public Employee(String name, String address, String phoneNumber, String eMailAddress, int office, double salary) {
        super(name, address, phoneNumber, eMailAddress);
        this.office = office;
        this.salary = salary;
        this.dataHired=new MyDate();
    }
    public int getOffice(){
        return office;
    }
    public String getSalary(){
        return String.format("%.2f",salary);
    }
    public String getDataHired(){
        return dataHired.getMonth()+"/"+dataHired.getDay()+"/"+dataHired.getYear();
    }

    public void setOffice(int office) {
        this.office = office;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDataHired() {
        this.dataHired=new MyDate();
    }

    @Override
    public String toString() {
        return super.toString()+"\nOffice: "+office+"\nSalary: $"+getSalary()+"\nData hired: "+getDataHired();
    }
}
