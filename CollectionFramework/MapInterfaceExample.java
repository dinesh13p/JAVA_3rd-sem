// Store elements in key-value pairs
// Key must be unique
// Values can duplicated

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceExample {

    public static void main(String[] args) {
        Map<Integer, String> mapExample = new HashMap<>();
        mapExample.put(1, "Apple");
        mapExample.put(2, "Banana");
        mapExample.put(3, "Mango");

        System.out.println(mapExample);        
    }
    
}
