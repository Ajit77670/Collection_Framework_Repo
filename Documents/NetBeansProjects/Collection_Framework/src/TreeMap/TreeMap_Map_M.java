/*
Constructor 3: TreeMap(Map M)
This constructor is used to initialize a TreeMap with the entries from the given map M which will be 
sorted by using the natural order of the keys.
 */

package TreeMap;
import java.util.*;
import java.util.concurrent.*;


public class TreeMap_Map_M {
    
static void Example3rdConstructor()
    {
        // Creating an empty HashMap
        Map<Integer, String> hash_map
            = new HashMap<Integer, String>();
  
        // Mapping string values to int keys
        // using put() method
        hash_map.put(10, "Geeks");
        hash_map.put(15, "4");
        hash_map.put(20, "Geeks");
        hash_map.put(25, "Welcomes");
        hash_map.put(30, "You");
  
        // Creating the TreeMap using the Map
        TreeMap<Integer, String> tree_map
            = new TreeMap<Integer, String>(hash_map);
  
        // Printing the elements of TreeMap
        System.out.println("TreeMap: " + tree_map);
    }
  
    // Method 2
    // Main driver method
    public static void main(String[] args)
    {
  
        System.out.println("TreeMap using "
                           + "TreeMap(Map)"
                           + " constructor:\n");
  
        Example3rdConstructor();
    }
}
