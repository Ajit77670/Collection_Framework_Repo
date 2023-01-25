
package LinkedList;

import java.util.Scanner;

public class LinkedList_Node_Inserion_start_end_specific_location {
    
    static class Node{
        
        int data;
        Node next;
        
        public Node(int data){
            
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    
    public void creation(){
        
        int data,m,n,p;
        Scanner sc = new Scanner(System.in);
        
        do{
            
        
        System.out.println("Enter the data");
        data=sc.nextInt();
        Node new_node = new Node(data);
        if(head==null){
            
            head=new_node;
        }
        else{
            System.out.println("Enter 1 to insert data at begining , 2 to insert item at end , 3 to insert data at specific location");
            
            m=sc.nextInt();
            
            switch(m){
                
                case 1:
                  new_node.next=head;
                  head=new_node;
                  break;
                  
                case 2:
                 Node temp=head;
                 while(temp.next!=null){
                     
                    temp= temp.next;
                 }
                 temp.next=new_node;
                 break;
                 
                case 3:
                   
                   System.out.println("Enter position of node to be inserted"); 
                   p=sc.nextInt();
                   Node temp1 = head;
                   for(int i=0;i<(p-1);i++){
                      
                      temp1= temp1.next;
                   }
                   new_node.next=temp1.next;
                 
                   temp1.next=new_node;
                   break;
              }
        }
        
        System.out.println("Do you want to add more data, if yes, press 1");
        
         n=sc.nextInt(); // using scanner next.int to ask user if they want to add more data.
        }
        while(n==1); // will keep adding data if user press 1.
       
        }
   
    
    public void traverse(){
       
    Node temp = head; 
  // will craete a temp pointer which stores the head value and it will traverse the linkedlist.
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
        
        LinkedList_Node_Inserion_start_end_specific_location  ll = new LinkedList_Node_Inserion_start_end_specific_location ();
        
        ll.creation();
        ll.traverse();
        
    }
}      
    
    
    


