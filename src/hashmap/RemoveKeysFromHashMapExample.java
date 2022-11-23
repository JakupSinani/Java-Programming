package hashmap;

import java.util.HashMap;
import java.util.Map;

public class RemoveKeysFromHashMapExample {
    public static void main(String[] args) {
        Map<String, String> husbandWifeMapping = new HashMap<>();
        husbandWifeMapping.put("Jack", "Marie");
        husbandWifeMapping.put("Chris", "Lisa");
        husbandWifeMapping.put("Steve", "Jennifer");

        System.out.println("Husband-Wife Mapping: " + husbandWifeMapping);

        //  remove a key from the hashmap
        //  chris got divorced. let's remove him from the mapping
        String husband = "Chris";
        String wife = husbandWifeMapping.remove(husband);

        System.out.println("Couple (" + husband + " ==> " + wife + ") got divorced!");
        System.out.println("New Mapping: " + husbandWifeMapping);

        //  remove a key from the hashmap only if it is mapped to the given value
        //   divorce "Jack" only if he is married to "Linda"
        boolean isRemoved = husbandWifeMapping.remove("Jack", "Linda");
        System.out.println("Did Jack get removed from the mapping? " + isRemoved);

        //  remove() returns null if the mapping wwas not found for the supplied key
        wife = husbandWifeMapping.remove("David");
        if (wife == null) {
            System.out.println("look like david is not married yet");
        } else {
            System.out.println("Removed David and his wife from the mapping");
        }
    }
}
