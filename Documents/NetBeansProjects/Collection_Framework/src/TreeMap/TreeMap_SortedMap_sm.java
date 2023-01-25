/*
Constructor 4: TreeMap(SortedMap sm)
This constructor is used to initialize a TreeMap with the entries from the given sorted map which will be
stored in the same order as the given sorted map.
 */
package TreeMap;
import java.util.*;
import java.util.concurrent.*;

public class TreeMap_SortedMap_sm {
    
    static void Example4thConstructor()
    {
        // Creating a SortedMap
        SortedMap<Integer, String> sorted_map
            = new ConcurrentSkipListMap<Integer, String>();
  
        // Mapping string values to int keys
        // using put() method
        sorted_map.put(10, "Geeks");
        sorted_map.put(15, "4");
        sorted_map.put(20, "Geeks");
        sorted_map.put(25, "Welcomes");
        sorted_map.put(30, "You");
  
        // Creating the TreeMap using the SortedMap
        TreeMap<Integer, String> tree_map
            = new TreeMap<Integer, String>(sorted_map);
  
        // Printing the elements of TreeMap
        System.out.println("TreeMap: " + tree_map);
    }
  
    // Method 2
    // Main driver method
    public static void main(String[] args)
    {
  
        System.out.println("TreeMap using "
                           + "TreeMap(SortedMap)"
                           + " constructor:\n");
  
        Example4thConstructor();
    }
}
    

