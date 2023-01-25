
package Array_List;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;


public class RemoveDuplicateElements_From_ArrayList {
    
    public static void main(String[] args) {
        
    ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(10,10,12,13,13,14,15,13,16,17,18)); 
    
  // 1st Method :Using LinkedHasSet we can remove duplicate elements as Set family doent contains duplicate element.
  
  LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>(al);
 
  ArrayList<Integer> al1 = new ArrayList<Integer>(lhs);
  
        System.out.println(al1);
    
    
   //2nd Method : Using JDK8 stream
   
   ArrayList<Integer> marks = new ArrayList<Integer>(Arrays.asList(10,10,12,13,13,14,15,13,16,17,18)); 
    
  List<Integer> unique = marks.stream().distinct().collect(Collectors.toList());
  
        System.out.println(unique);
   
    }
    
}
