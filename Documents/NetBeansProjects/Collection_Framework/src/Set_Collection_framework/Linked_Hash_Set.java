/*
*Linked_HashSet is a class which extends the HashSet class and the HashSet class implements the Set interface.
*Both HashSet and LinkedHashSet does not contains the duplicate element.
*The only difference between HashSet and Linked_HashSet is HashSet does not maintain insertion order where as teh Linked_HashSet maintains the insertion order.
 */
package Set_Collection_framework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Linked_Hash_Set {
    
    public static void main(String[] args) {
        
    LinkedHashSet l = new LinkedHashSet();
    
    l.add("a");
    l.add("b");
    l.add("c");
    l.add("d");
    l.add("e");
    System.out.println(l);
  
    HashSet h = new HashSet();
    h.add(100);
    h.add(200);
    h.add(300);
    h.add(400);
    h.add(500);
    
    System.out.println(h);
    
}

}