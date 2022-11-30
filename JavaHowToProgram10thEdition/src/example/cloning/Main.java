package example.cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human jakup = new Human(22, "Jakup Sinani");
        //  Human jakup1=new Human(jakup);

        Human twin = (Human) jakup.clone();
        System.out.println(twin.age + " " + twin.name);
    }
}
