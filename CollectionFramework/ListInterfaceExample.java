// An ordered collection that allows to store duplicate elements.
// Elements can be accessed by index.
// Common Implementations
    // Arraylist: Dynamic array, fast access
    // Linkedlist: Doubly linked list better for insert/delete.

import java.util.ArrayList;
import java.util.List; 

public class ListInterfaceExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("BCA");
        names.add("CSIT");
        names.add("BIT");
        names.add("CSIT"); //Duplicate Element

        System.out.println(names);
        System.out.println(names.get(1));
    }
    
}
