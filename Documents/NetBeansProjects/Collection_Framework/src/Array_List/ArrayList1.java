
package Array_List;
import java.util.*;

public class ArrayList1 {
    
    public static void main(String[] args) {
        
        // ArrayList Creation :
        
        ArrayList<Integer> al = new ArrayList<>(); //Created ArrayList of Integer Type object
        ArrayList<Integer> al2 = new ArrayList<>(List.of(20,30,40,50)); // Created another ArrayList of Integer Type object
                                                   // (List.of) method of List Interfact allows to add as many elment object. 
        
         // Adding elements object to the ArrayList :                                        
        al.add(1); // adding element to the ArrayList al.
        al.add(2); // adding element to the ArrayList al.
        al.add(0, 5); // Adding object elemet at index 0.
        
        //al.addAll(al2); // adding other collection
        al.addAll(0, al2); //from index 0 adding other collection (ArrayList al2)
        al.add(2, 22); // inserting elemnt in between
        
        // Printing Array elemnts using system.out.println method.
        //System.out.println(al);  
        //System.out.println(al.contains(20)); // checking if object elemnt 20 is present in the ArrayList
        
        //Iteration
        
        //---------------------------------------------//
        
        /*First method using : simple traditional for loop to print ArrayList elements objects
            
        for (int i=0;i<al.size();i++){
            
            System.out.println(al.get(i));   // In ArrayList we need to use get method to print the object eleemnts.
        }                                   //Here we cant pass as al[i], we need to use (get) method.
       */ 
        
        //---------------------------------------------//
        
        /* Second method : using for each loop to print ArrayList elements objects
        for (Integer x :al){
        System.out.println(x);
        }
         */
        
        //--------------------------------------------//
        
        /* Third method : using For each loop with (var) functionality instead specifiying Object data type.
        
        for (var x :al){
        System.out.println(x);
        }
         */ 
        
        //-------------------------------------------//
        
        /* Fourth method : using for loop with Iterator we can print the ArrayList elements Object
        for (Iterator<Integer> it = al.iterator(); it.hasNext();) 
        {
        Integer x = it.next();
        System.out.println(x);
        }
         */
        
        //---------------------------------------------//
        
        // Fifth method :  Lambda expression using the (foreach loop ) we can Print the ArrayList elements objects
        
        /*
        al.forEach(x -> {
            System.out.println(x);
        });
        
       */
        
        // Sixth method : using Iterator
        
        Iterator<Integer> it = al.iterator();
        
        while(it.hasNext()){    
            
            System.out.println(it.next());
        }
    }   
        /*Seventh Method :Creating show method and calling ArrayList (al) object by Lambda Expression
        
        al.forEach(n->show(n));
        
    
    
         static void show(int n){
        
        if(n>20){
            
            System.out.println(n);
        }
        
    }
    */
}
    