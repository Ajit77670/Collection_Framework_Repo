
package Array_List;
import java.util.*;

public class Two_ArrayList_Comaparision {
    
    public static void main(String[] args) {
        
  ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(10,20,30,44,11,12,13));
  
  ArrayList<Integer> al2 = new ArrayList<Integer>(Arrays.asList(10,20,30,45,11,14,17));
  
  
  //Sorting the ArrayList using Collections class sort methods then use equals() method.
  Collections.sort(al);
  Collections.sort(al2);
  
  // using equals() method comparing two ArraysList.
  System.out.println(al.equals(al2));
  System.out.println(al2.equals(al));
  
  
   //Compare two ArrayList and find the uncommon elements. 
  ArrayList<String> al6 = new ArrayList<String>(Arrays.asList("Papa","Maa","Ajit","Bunty","Sweta"));
  
  ArrayList<String> al7 = new ArrayList<String>(Arrays.asList("Maa","Ajit","Bunty","Sweta"));
  
        al6.removeAll(al7);
        System.out.println(al6);
        
        al7.removeAll(al6);
        System.out.println(al7);
        
        
    // find out the missing elements 
    
    ArrayList<String> al8 = new ArrayList<String>(Arrays.asList("Papa","Maa","Ajit","Bunty","Sweta"));
  
    ArrayList<String> al9 = new ArrayList<String>(Arrays.asList("Maa","Ajit","Bunty","Sweta"));

        al8.removeAll(al9);
        System.out.println(al8);
        
   //find out the common elements
   
   ArrayList<String> al01 = new ArrayList<String>(Arrays.asList("Papa","Maa","Ajit","Bunty","Sweta"));
  
   ArrayList<String> al02 = new ArrayList<String>(Arrays.asList("Maa","Ajit","Bunty","Sweta"));
   
   al01.retainAll(al02);
   System.out.println(al01);
   
   
  
  
    }
    
}
