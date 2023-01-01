package collections.maps;

import java.util.HashMap;
import java.util.Map;

public class MapProgramming {
    public static void main(String[] args) {
        //java.util.Map<String,String>languages=new HashMap<>();
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", " a compiled high level, object-oriented, platform independent language");
        languages.put("Python", " an interpretedm object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", " an algorithmic language");
        languages.put("BASIC ", " Begginners All Purposes Symbolic Instructron Code");
        languages.put("Lisp", " There in lies madness");

        System.out.println(languages.get("Java"));
        languages.putIfAbsent("Java", " this course is about Java");
        System.out.println(languages.get("Java"));


        System.out.println("=========================================================================================");

        //  languages.remove("Lisp");

        if (languages.remove("Algol", " an algorithmic language")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }
        //System.out.println(languages.replace("Lisp"," a functional programming language with imperative features")); ----->>> there in lies madness
        if (languages.replace("Lisp", " There in lies madness", " a functional programming language with imperative features")) {
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp was not replaced");
        }
        // System.out.println(languages.replace("Scala"," this will not be added"));
        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }

}
