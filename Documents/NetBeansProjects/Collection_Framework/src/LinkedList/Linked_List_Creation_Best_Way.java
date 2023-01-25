
package LinkedList;

import java.util.Scanner;

public class Linked_List_Creation_Best_Way {


    static class Node{  // This Node class is the structure of Node.
    
       
    int data;  // Node consist of data , declaring it as variable data of int type(we can declare any data type to it) 
    Node next; // next contains the address of next node, so decalring its type as Node.
    
     public Node(int data){ // Craete constructor which help while intializing the objects of Node class.
        
        this.data=data;
        this.next=null;
     }
    }

    Node head=null; // head is pointer which contains the address of the Node, 
    //initially we deaclare it as null(it means that it is no pinitining to any Node initially)
  
    public void LL_creation(){
        
        
        int data,n; // This we take for scanner purpose to store the int value.(data for do k liye and n for while k liye)
        Scanner sc = new Scanner(System.in);
        
        do{
        
         System.out.println("Enter the data");
         data= sc.nextInt();
            
       Node new_node = new Node(data);  // Craeted the new node by craeting the object of Node class(give its name as new_node)
       if(head==null){  // chking condition if the the linkedlist exist or not(this can be check by head==null)
                        // head==null ka matlab hain ki head have no connection to any node so no linkedlist exist now.
           
        head=new_node; // head will contain the adress of new_node now
       }
       else{
        
        new_node.next=head; //new_node created in that next (sub part of Node) will add the address of head.
                            // we are doing this to establish the link b/w head and new_node
        head=new_node; // and head will strore the address of new_node now.
     
       }
       
        System.out.println("Do you want to add more data, if yes, press 1");
        
         n=sc.nextInt(); // using scanner next.int to ask user if they want to add more data.
        }
        while(n==1); // will keep adding data if user press 1.
       
        }
    
    public void traverse(){
        
    Node temp = head; // will craete a tem pointer which stores the head value and it will traverse the linkedlist.
  // head is at fixed positin at start so we need extra pointer to traverse the linked list so created the temp pointer.
  
  if(head==null){  // Again before traversing will chk if the linkedlist exist or not
        
       System.out.println("Linked list not exist");  // if not will print no linkedlist exist
    }
  else{ // if linkedlist exist the tem will traverse
      
      while(temp!=null){ // the temp will traverse untill it found the last node next address as null.
          System.out.println(temp.data); // temp.data means temp pointer will acess the data for next node.
          temp=temp.next; // temp.next means the temp pointer will access the next address of node.
      }
  }
  
    }
      
    public static void main(String[] args) {
        
        Linked_List_Creation_Best_Way ll = new Linked_List_Creation_Best_Way();
        
        ll.LL_creation();
        ll.traverse();
        
    }
}    


        


    
    
        
        
    
    

