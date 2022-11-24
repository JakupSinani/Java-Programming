package hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterateOverHashSetExample {
    public static void main(String[] args) {
        //  create a HashSet
        Set<String> programmingLanguages = new HashSet<>();
        programmingLanguages.add("JAVA");
        programmingLanguages.add("PYTHON");
        programmingLanguages.add("PHP");
        programmingLanguages.add("C");
        programmingLanguages.add("C#");
        programmingLanguages.add("C++");

        System.out.println("== Iterate over a HashSet using forEach and lambda");
        programmingLanguages.forEach(programmingLanguage -> {
            System.out.println(programmingLanguage);
        });

        System.out.println("==  Iterate over HashSet using iterator()55555555");
        Iterator<String> programmingLanguageIterator = programmingLanguages.iterator();
        while (programmingLanguageIterator.hasNext()) {
            String programmingLanguage = programmingLanguageIterator.next();
            System.out.println(programmingLanguageIterator.next());
            System.out.println(programmingLanguage);
        }

        System.out.println("==  Iterate over a HashSet using iterator() and forEachRemaining() method");
        programmingLanguageIterator = programmingLanguages.iterator();
        programmingLanguageIterator.forEachRemaining(programmingLanguage -> {
            System.out.println(programmingLanguage);
        });

        System.out.println("==  Iterate over a HashSet using simple for-each loop");
        for (String programmingLanguage : programmingLanguages) {
            System.out.println(programmingLanguage);
        }
    }
}
