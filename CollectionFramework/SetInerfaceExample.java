// Collection of elements that doesnot allow duplicate elements
// No index-bases access

import java.util.HashSet;
import java.util.Set;

public class SetInerfaceExample {

    public static void main(String[] args) {
        Set<String> setExample = new HashSet<>();
        setExample.add("CSIT");
        setExample.add("BCA");
        setExample.add("CSIT"); // Duplicate element

        System.out.println(setExample);
    }
    
}
