package mosh.linkedlist;

public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println(list.getClass().getSuperclass().getName());
    }
}
