package exercise;

import java.util.*;

/*Exercise 4: (3) Create a generator class that produces character names (as String
objects) from your favorite movie (you can use Snow White or Star Wars as a fallback) each
time you call next( ), and loops around to the beginning of the character list when it runs out
of names. Use this generator to fill an array, an ArrayList, a LinkedList, a HashSet, a
LinkedHashSet, and a TreeSet, then print each container*/
public class Exercise {
    private List<String> characterNames;
    private int index;

    public Exercise() {
        characterNames = Arrays.asList("Luke Skywalker", "Leia Organa", "Han Solo", "Chewbacca", "Obi-Wan Kenobi", "R2-D2", "C-3PO", "Darth Vader", "Yoda", "Boba Fett");
        int index = 0;
    }

    public String next() {
        String name = characterNames.get(index);
        index = (index + 1) % characterNames.size();
        return name;
    }

    public static void main(String[] args) {
        Exercise exercise = new Exercise();

        //  fill an array
        String[] array = new String[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = exercise.next();
        }
        System.out.println("Array: " + Arrays.toString(array));

        //  fill an ArrayList
        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(exercise.next());
        }
        System.out.println("ArrayList: " + arrayList);

        //  fill a LinkedList
        List<String> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(exercise.next());
        }

        //  fill a hashset
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            hashSet.add(exercise.next());
        }
        System.out.println("HashSet: " + hashSet);

        //  fill a LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        for (int i = 0; i < 10; i++) {
            linkedHashSet.add(exercise.next());
        }
        System.out.println("LinkedHashSet: " + linkedHashSet);

        //  fill a TreeSet
        TreeSet<String> treeSet = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            treeSet.add(exercise.next());
        }
        System.out.println("TreeSet: " + treeSet);
    }
}
