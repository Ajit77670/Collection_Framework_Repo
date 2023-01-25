/*
 * Stack implementtaion using Array[].(Static Array which have fixed size).
 * Functions/Methods() used in Stack--> push,pop,peek,isEmpty,IsFull.
 * Variable used in stack implementation --> int arr[], int size, int top.
 */
package Stack_Implemenetation;


 class Driver {
    
    int arr[];
    int size;
    int top;
    
Driver(int size){
    
    this.size=size;
    this.top=-1;
    this.arr= new int[size];
}

public boolean isEmpty(){

    return top ==-1;

}

public boolean isFull(){
    
    return (size-1 == top);
}

public int peek(){
    
    if(!this.isEmpty()){
        
        return arr[top];
        
    }
    else{
        
        System.out.println("stack is empty");
       
    }
     return -1;
}

public void push (int elements){
    
    if(!this.isFull()){
        
        top++;
        arr[top]=elements;
       System.out.println(elements);
       }
    else{
        System.out.println("stack is Full");
    }
    
}

public int pop(){
    
    if(!this.isFull()){
        
         int returntop=top;
        top--;
       
        System.out.println("elemnt removed" +arr[returntop]);
    }
    else{
    System.out.println("stack is empty");
    
    }
    return -1;

}

    
}
 public class Stack_Array {
    
    public static void main(String[] args) {
        
        Driver st = new Driver(10);
        st.push(11);
        st.push(12);
        st.push(13);
        st.push(14);
        st.push(15);
        
       st.pop();
       st.pop();
        
        System.out.println(st.peek());
        
       
       } 
       
    }
    


