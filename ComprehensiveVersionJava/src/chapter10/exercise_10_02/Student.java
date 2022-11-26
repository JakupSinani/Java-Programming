package chapter10.exercise_10_02;

public class Student extends Person{
    private int status;
    public final static int FRESHMAN=1;
    public final static int JUNIOR=2;
    public final static int SPHOMORE=3;
    public final static int SENIOR=4;

    public Student(int status) {
        this.status = status;
    }

    public Student(String name, String address, String phoneNumber, String eMailAddress, int status) {
        super(name, address, phoneNumber, eMailAddress);
        this.status = status;
    }

    public String getStatus() {
        switch (status){
            case 1:return "Freshman";
            case 2:return "Junior";
            case 3:return "Sophomore";
            case 4:return "Senior";
            default:return "Unknown";
        }
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
