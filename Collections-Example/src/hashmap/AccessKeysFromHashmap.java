package hashmap;

import java.util.HashMap;
import java.util.Map;

/*
* Program Description
The AccessKeysFromHashmap class contains a main method that demonstrates how to use the HashMap class to store and retrieve key-value pairs.
*  The program creates a HashMap object called userCityMapping and adds three key-value pairs to it.
* The program then checks if the userCityMapping map is empty, prints the number of key-value pairs in the map, and retrieves a value from the map using a key.
The program also demonstrates how to check if a HashMap contains a particular key or value, and how to update the value associated with a key.
*  The program updates the value associated with the "Steve" key and prints the updated userCityMapping map.
* Finally, the program retrieves the value associated with a non-existent key and prints the result.*/
public class AccessKeysFromHashmap {
    public static void main(String[] args) {
        Map<String, String> userCityMapping = new HashMap<>();

        System.out.println("Is userCityMapping empty? " + userCityMapping.isEmpty());

        userCityMapping.put("John", "New York");
        userCityMapping.put("Jane", "London");
        userCityMapping.put("James", "Philadelphia");

        System.out.println("userCityMapping Hashmap: " + userCityMapping);

        System.out.println("We have the city information of " + userCityMapping.size() + " users");

        String userName = "Steve";

        if (userCityMapping.containsKey(userName)) {
            String city = userCityMapping.get(userName);
            System.out.println(userName + " lives in " + city);
        } else {
            System.out.println("City details not found for user " + userName);
        }

        if (userCityMapping.containsValue("New York")) {

            System.out.println("There is a user in the ucerCityMapping who lives in New York");
        } else {
            System.out.println("There is not user in the ucerCityMapping who lives in New York");
        }

        userCityMapping.put(userName, "California");
        System.out.println(userName + " moved to a new city " + userCityMapping.get(userName) + ", New userCityMapping: " + userCityMapping);


        System.out.println("Lisa's city: " + userCityMapping.get("Lisa"));
    }
}
