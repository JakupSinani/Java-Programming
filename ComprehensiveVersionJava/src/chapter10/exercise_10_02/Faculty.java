package chapter10.exercise_10_02;

public class Faculty extends Employee{
    private String officeHours;
    private String rank;

    public Faculty(int office, double salary, String officeHours, String rank) {
        super(office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public Faculty(String name, String address, String phoneNumber, String eMailAddress, int office, double salary, String officeHours, String rank) {
        super(name, address, phoneNumber, eMailAddress, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString()+"\nOffice hours: "+officeHours+"\nRank: "+rank;
    }
}
