package mosh.oop;

public class Main {
    public static void main(String[] args) {
        /*var textBox=new TextBox();
        textBox.setText("Box 1");
        var textBox1=textBox;
        System.out.println(textBox1.text.toUpperCase());*/

        /*var employee=new EMployee();
        employee.setBaseSalary(50_000);
        employee.setHourlyRate(20);
        int vage=employee.calculateWage(10);
        System.out.println(vage);*/

        var box1 = new TextBox();
        var box2 = new TextBox();

        System.out.println(box1.equals(box2));
        System.out.println(box2.hashCode());
    }
}
