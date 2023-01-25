/**
 * This is the demonstration how we can create the LinkedList. 
 * LinkedList are of two types, 1) Singly Linked-list 2)Doubly Linked-list.
 * LinkedList consist of Nodes: having data section and address section.
 */
package LinkedList;


public class LinkList_Creation {
    
    Node head;    // declare head with class Node reference
    
    class Node{  
        
        
        int data;     // declare data as integer variable which gets store inside the Node.
        Node next;    // Decalare the next variable with Node calass reference ,which used to print to the next node.
     
        Node(int data){    // Create Constructor for Node class
        this.data=data;  
        next = null;        // next= null because once the node gets over in the linked list it will return null.
       }
        
    }     
      public void LinkedListDisplay(){
          
          Node temp = head;  // storing head position in variable temp.(temp is a pointer we created to traverse)
          while(temp!=null){     // temp will traverse till  it found null value.
              System.out.println(temp.data); // print the elements/objects i.e data from the Linkedlist
              temp=temp.next; // Store the next variable in temp. 
              
          }
       } 
   
    
    
    public static void main(String[] args) {
        
    LinkList_Creation lc = new LinkList_Creation();
        
      Node first = lc.new Node(10);
      lc.head = first;
      
      Node second = lc.new Node (20);
      first.next=second;
      
      Node third = lc.new Node(30);
      second.next=third;
        
      lc.LinkedListDisplay();
      
    }
    
}
