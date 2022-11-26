package chapter10.exercise_10_02;

public class Staff extends Employee{
    private String title;

    public Staff(int office, double salary, String title) {
        super(office, salary);
        this.title = title;
    }

    public Staff(String name, String address, String phoneNumber, String eMailAddress, int office, double salary, String title) {
        super(name, address, phoneNumber, eMailAddress, office, salary);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString()+"\nTitle: "+title;
    }
}
