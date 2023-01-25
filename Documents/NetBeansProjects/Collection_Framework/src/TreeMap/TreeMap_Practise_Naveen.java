
package TreeMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;
import java.util.Comparator;

public class TreeMap_Practise_Naveen {
    
    public static void main(String[] args) {
        
        TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>();
        
        System.out.println("Natural sorting of Tree map based on its Keys\n");
        
        tree_map.put(10, "Geeks");
        tree_map.put(15, "4");
        tree_map.put(20, "Geeks");
        tree_map.put(25, "Welcomes");
        tree_map.put(30, "You");
        
        System.out.println(tree_map);
        
        tree_map.forEach((k,v)-> System.out.println("key = " +k +"value = " +v));
        
        System.out.println(tree_map.lastKey());// lastKey() method of Tree map gives the last entry of the key in the tree map.
        
        System.out.println(tree_map.firstKey());//firstKey() method of Tree map gives the first entry of the key in the tree map.
        
        System.out.println(tree_map.headMap(20).keySet());//headMap() method takes the particular keys  and show all the key entries before that.
        
        System.out.println(tree_map.tailMap(15).keySet());//tailMap() method takes the particular keys  and show all the key below that.
        
        
        System.out.println("------------------------------------------");
        
        
        TreeMap<Integer, String> map1= new TreeMap<Integer, String>(Comparator.reverseOrder());
        
        System.out.println("Sorting of Tree map in reverse order using Comparator.reverseorder() Method\n");
        
        map1.put(100, "Tom");
        map1.put(150, "Harry");
        map1.put(201, "Stan");
        map1.put(251, "Zyan");
        map1.put(301, "Charlie");
        
        System.out.println(map1);
    }
    
}
