/**
 * LinkedList is a Data-Structure which follow LIFO mechanism.
 * LinkedList is a class which used in Collection Framework  and implements List-interface as well De-Queue interface.
 * LinkedList most of the time use as stack(FILO/LIFO) and queue(FIFO).
 * LinkedList have Node structure which store the objects/element in Node form. All other object/element connected by the next node address.
 * LinkedList are of two types: 1)Singly-linkedList 2)Doubly-Linked-List
 * 1)Singly Linked list have two parts one is data part and another is next part which contains the address of next node.
 * 2)Doubly Linked List have three parts , first having previous data address , second contains value and third part contains next node address.
 * LinkedList allows heterogeneous data types i.e if we not specifying Generic type then it can store Object class of all data type.
 * LinkedList duplicate element can store and insertion order is preserved.
 * LinkedList is preferred to use when we have more insertion/deletion operations to perform.
 * LinkedList is not preferred for retrieval because LinkedList random access is not possible, In Linked List there is a header pointer which have the first node address, by using header we can traverse and retrieve the Element/objects.
 * When we do insertion/deletion in the LinkedList , the LinkedList does not perform shifting operations which is a important feature of LinkedList.
 * 
 * LinkedList some common methods having same functionality.
 
 * 1)add() & offer() methods, both used to add elements/object into the LinkedList
    // In case if the LinkeList is empty add() method will throw Exception(NoSuchElementFount Exception)
    // Where as offer() returns (null), it wont throw exception
 
 * 2)remove(),pop() & poll(), all these methods used to remove the element/object from LinkedList.
 // In case if the LinkeList is empty remove() & pop() method will throw Exception(NoSuchElementFount Exception)
 // Where as poll() returns (null), it wont throw exception
 
 // remove() method delete the element but not return the value deleted, but pop() method delete the element and returns the value.
 
 * 3)peek() method --> used to fetch the first element of the LinkedList.
 */
package LinkedList;
import java.util.*;

public class LinkedList_Ex_2 {
    
    public static void main(String args[])
    {
        // Creating object of the class linked list
        
       System.out.println("--------------LL1 Output--------------\n");   
        
       LinkedList<String> ll1 = new LinkedList<>();
        
        ll1.add("A");
        ll1.add("B");
        ll1.add("C");
        ll1.add("C");
        ll1.add(null);  // null values allowed in LinkedList to add.
       
       ll1.offer("D");
       System.out.println(ll1);
        
       System.out.println( ll1.peek());
       System.out.println(ll1);
       
        
       System.out.println(ll1.pop());
       System.out.println(ll1);
      
       ll1.addFirst("Ajit");
       System.out.println(ll1);
       
       ll1.addLast("Sumit");
       System.out.println(ll1);
       
       System.out.println(ll1.remove());
       System.out.println(ll1);
       
       System.out.println(ll1.remove());
       System.out.println(ll1);
       
       System.out.println(ll1.poll());
       System.out.println(ll1);
        
      System.out.println("--------------LL Output--------------\n");   
        
       LinkedList ll = new LinkedList();
  
        // Adding elements to the linked list
        ll.add("A");
        ll.add("B");
        
        ll.addLast("C");
        ll.addFirst("D");
        
        ll.add(2, "E");
        ll.add(100);
        ll.add(1, 200);
        
        ll.offer(300);
        ll.offer("HAHAHA");
        
        ll.pollFirst();
        ll.pollLast();
        
        ll.peek();  
        ll.peekFirst();
        ll.peekLast();
           
        System.out.println(ll.size()); // Gives the total size of the LinkedList(total element/object present in LinkedList)
        
        System.out.println(ll.get(0)); // Gives the object/index value at specified index.
        
        System.out.println(ll.set(0, "Oyeeee")); // Set the new value at specified index.
        
        System.out.println(ll.contains("Oyeeee")); // check if the object/elemnt value contails in the LinkedList or not, it will return boolean value.
        
        System.out.println(ll.isEmpty()); // checks if the LinkedList is empty or not. it will return the boolean value.
        
        // Reading elemnts using for loop:
        for(int i =0;i<ll.size();i++){
            System.out.println(ll.get(i));  // can use for loop to iterate the object/elemnts from LinkedList.
        }
        
        // Reading elemnt using foreach loop:
        for(Object x : ll ){
            System.out.println(x);
        }
        
        // iterator Method:
        Iterator it = ll.iterator();
        while(it.hasNext()){
            
            System.out.println(it.next());
        }
        
       System.out.println(ll);
     
       
       
    }
}
    

