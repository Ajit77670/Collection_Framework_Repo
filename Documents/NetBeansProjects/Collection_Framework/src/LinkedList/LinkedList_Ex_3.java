
package LinkedList;

import java.util.LinkedList;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;


public class LinkedList_Ex_3 {
    
    public static void main(String[] args) {
        
        LinkedList l = new LinkedList(Arrays.asList('x','f','g','b','c','a'));
        
        System.out.println(l);
        
        Collections.sort(l);  // Sort the LinkedList using Collection class Sort() method.
        System.out.println(l);   
        
        Collections.reverseOrder(); // Using Collections class reverse order we can reverse the LinkedList also.
        System.out.println(l);
        
        //Shuffle the elements of LinkedList using Collections class shuffle() method.
        System.out.println("----");
        Collections.shuffle(l);
        System.out.println(l);
        System.out.println("-----");
        
        
       //Copy the one LinkedList to another LinkedList 
       LinkedList l_1 = new LinkedList ();
       l_1.addAll(l);
       System.out.println(l_1);
       
       //Sorting the elements using Collection Class sort method
        
       Collections.sort(l_1);
       System.out.println(l_1);
       
       Collections.reverse(l_1);
       System.out.println(l_1);
       
       
    }
    
}
