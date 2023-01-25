/**
 * HashSet is the class which implements the set interface.
 * HasSet does not allow to store the duplicate elements. This is the property of Set interface.
 */
package Set_Collection_framework;

import java.util.HashSet;
import java.util.Set;
import java.util.*;
import java.util.Arrays;

public class HashSet_in_Set {
    
    public static void main(String[] args) {
        
       // Passing object as Integer
       HashSet<Integer> hs = new HashSet<Integer>();
       // or create like this aa well -> Set<Integer> hs = new HashSet<Integer>();
       
       hs.add(1);
       hs.add(2);
       hs.add(3);
       hs.add(4);
       hs.add(3);
       hs.add(5);
       hs.add(2);
       
      System.out.println(hs);
      
      // using Iterator fetching the objects
      Iterator<Integer> it = hs.iterator();
      while(it.hasNext()){
          
          System.out.println(it.next()); 
      }
        
      
      // Passing objects as String
      HashSet<String> first = new HashSet<>(Arrays.asList("Ajit","Bunty","Ajit","Maa"));
      
      System.out.println(first); 
      
      
      // get the union of two sets. -->union means common elements of both the sets.
      
      HashSet<Integer> first1 = new HashSet<Integer>(Arrays.asList(11,12,13,14,15,16));
      
      HashSet<Integer> second = new HashSet<Integer>(Arrays.asList(11,13,14,15,19,20));
      
        HashSet<Integer> union = new HashSet<Integer>(first1);
     
        union.addAll(second);
        System.out.println(union);
        
     
    //get the intersection
     
     HashSet<Integer> first11 = new HashSet<Integer>(Arrays.asList(1,2,3,4,5,16));
      
      HashSet<Integer> second11 = new HashSet<Integer>(Arrays.asList(1,3,4,5,19,20));
      
       HashSet<Integer> intersection = new HashSet<Integer>(first11);
       
       intersection.retainAll(second11);
        System.out.println(intersection);
        
     //get the differnece b/w to set   
     
     HashSet<Integer> first0 = new HashSet<Integer>(Arrays.asList(1,2,3,4,5,16));
      
      HashSet<Integer> second0 = new HashSet<Integer>(Arrays.asList(1,3,4,5,19,20));
      
       HashSet<Integer> diff = new HashSet<Integer>(first11);
       
       diff.removeAll(second0);
       
        System.out.println(diff);
      
     
        
    }
    
}
 