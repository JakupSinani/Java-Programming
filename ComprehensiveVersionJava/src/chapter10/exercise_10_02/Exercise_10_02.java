package chapter10.exercise_10_02;

public class Exercise_10_02 {
    public static void main(String[] args) {
        Person person=new Person("John","12 Bell Street","3473333","john12@gmail.com");
        Student student=new Student("Mary","100 Town Ave","164891668","mary@gmail.com",Student.FRESHMAN);
        Employee employee=new Employee("MIke","34 West Street","46489651","mike@gmail.com",910,6000);
        Faculty faculty=new Faculty("SUE","28 Well Street","25649489","sue@aol.com",101,50000,"4pm to 6pm","Professor");
        Staff staff=new Staff("Tom","90 Country road","203000515","tom@gmail.com",12,65000,"Executive Assistant");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}
