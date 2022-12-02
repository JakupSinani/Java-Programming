public class Cat {
    private String name = "nameless cat";

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("charlie");
        System.out.println(cat.name);
    }
}
