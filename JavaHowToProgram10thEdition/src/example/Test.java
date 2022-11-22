package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        /*HashMap<String,String>countries=new HashMap<>();
        //  add a key and value
        countries.put("USA","Washington DC");
        countries.put("India","New Delhi");
        countries.put("Russia","Moscow");
        countries.put("China","Beijing");

        countries.remove("USA");
        System.out.println(countries);
*/

        List<String> states = new ArrayList<>();
        states.add("Macedonia");
        states.add("Kosovo");
        states.add("Albania");
        states.add("italy");
        HashMap<String, List<String>> countries = new HashMap<>();
        countries.put("PSPS", states);
        System.out.println("Fds");
        System.out.println(states.contains("Macedonia"));
        System.out.println(countries.containsValue(states.contains("Macedonia")));
        System.out.println(countries.containsKey("PSPS"));
       /* countries.put("USA", Arrays.asList("California","Alabama","New Jersey","North Carolina"));
        countries.put("Europe",Arrays.asList("Austria","Belgium","Italy","Germany"));
        countries.put("Asia",Arrays.asList("Palestina","Indonesia","Iraq","Iran"));
        System.out.println(countries);
        countries.replace("Asia",Arrays.asList("Palestina","Iraq","Iran","Indonesia"));
        System.out.println(countries);

        System.out.println(countries.containsKey("Asia"));
        System.out.println(countries.containsValue("Belgium"));

        System.out.println(countries.size());*/
        //System.out.println(countries);
    }
}
