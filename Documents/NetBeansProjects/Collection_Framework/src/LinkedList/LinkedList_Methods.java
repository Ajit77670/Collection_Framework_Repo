/**
 * LinkedList is ad default class in Java so we should not import this remember. 
 *  LinkedList have all the common method of List Interface and some extra methods as well, because its an order based list the objects.
 * LinkedList class  implements List interface as well ass Queue and De-queue interface 
 * Linked list re of two types: 1)Singly LinkedList and 2)Doubly LinkedList , but java supports doubly linked list.
*/


package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;


public class LinkedList_Methods {
    
    public static void main(String[] args) {
        
        LinkedList<String> ls = new LinkedList<String>();
        
        ls.add("Maa");
        ls.add("Ajit");
        ls.add("Sumit");
        ls.add("Sweta");
        ls.add("Papa");
        
        
        System.out.println(ls.size()); //Gives the size of Linkedlist
        
        System.out.println(ls); // Gives the object of LinkedList with sout method.
        
        
        Iterator<String> it = ls.iterator();  // using iterartor we can fetach the list objects.
        
        while(it.hasNext()){
            
            System.out.println(it.next());
        }
        
        LinkedList<String> ls1 = new LinkedList<String>();
        
        ls1.add("Maa");
        ls1.add("Ajit");
        ls1.add("Sumit");
        ls1.add("Sweta");
        ls1.add("Papa");
        
        Iterator<String> it1 = ls1.descendingIterator();  // using descendingIterator () method we can reverse the LinkedList.
        while(it1.hasNext()){
            
            System.out.println(it1.next());   
        }
        
    }
 
    
}
