
package LinkedList;

import java.util.Scanner;

public class LinkedList_Deletion_of_Nodes_Start_end_Specific_location {
    
    class Node{
    
    int data;
    Node next;
    
    public Node(int data){
        
        this.data=data;
        this.next=null;
    }
    }
    Node head=null;

    
    public void Creation(){
        
        int m,n;
        Scanner sc=  new Scanner (System.in);
        do
        {
        System.out.println("Enter the data");
         n=sc.nextInt();
        
        Node new_node = new Node(n);
        if(head==null){
            
         head=new_node;   
        }
        
        else{
            
            new_node.next=head;
            head=new_node;
          }
        
        System.out.println("Do you want to add more data, iy yes press 1");
        m=sc.nextInt();
        }
        while(n==1);
        
    }
    
    public void deletion(){
        
        
        int n = 0,o,option = 0,v,q = 0,w;
        Scanner sc = new Scanner (System.in);
        
        do{
            
        
        if(head==null)
        {
            
            System.out.println("Linked List is empty");
        }
        else{
        System.out.println("Enter 1 for deleting element from begining , enter 2 for end , enter 3 from specific location");
        o=sc.nextInt();
        
        switch(option)
        {
            case 1:
                
            Node temp = head;
            temp= temp.next;
            head=temp;
            break;
            
            case 2:
                
             Node temp1=head;
             Node ptr = temp1.next;
             while(ptr.next!=null){
                 
               temp1=ptr;
                ptr= ptr.next;
             }
            temp1.next=null;
            break;
            
            case 3:
                
                System.out.println("Enter the position of node to be delete");   
                v=sc.nextInt();
                
                Node temp2= head;
                Node ptr2=temp2.next;
                for(int i=0;i<q-2;i++)
                {
                temp2=ptr2;
                ptr2=ptr2.next;
                
            }
             temp2.next=ptr2.next;   
                break;
            
        }
        
        }
            System.out.println("Do you want to delete more element,press 1");
            w=sc.nextInt();
        }  
        while(n==1);
    }
    
    public void traverse(){
        
        Node temp = head;
        if(head==null){
            
            System.out.println("Linked list does not exist");
        }
        else{
            while(temp!=null){
                
                System.out.println(temp.data);
                temp=temp.next;
            }
            
        }
    }
    
    public static void main(String[] args) {
        
        LinkedList_Deletion_of_Nodes_Start_end_Specific_location LL = new LinkedList_Deletion_of_Nodes_Start_end_Specific_location();
        
        LL.Creation();
        LL.traverse();
        LL.deletion();
        
    }
    
}
