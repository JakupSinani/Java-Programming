package example;

public class Tree {
    private int height;

    public Tree() {
        System.out.println("Planting a seedling");
        this.height = 0;
    }

    public Tree(int height) {
        this.height = height;
        System.out.println("Creating new Tree that is " + this.height + " feet tall");
    }

    public void info() {
        System.out.println("Tree is " + height + " feet tall");
    }

    public void info(String s) {
        System.out.println(s + " Tree is " + height + " feet tall");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree tree = new Tree(i);
            tree.info();
            tree.info("overloaded method");
        }

    }
}
