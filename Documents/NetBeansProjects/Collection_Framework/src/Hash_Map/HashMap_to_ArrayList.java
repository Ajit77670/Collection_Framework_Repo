
package Hash_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class HashMap_to_ArrayList {
    
    public static void main(String[] args) {
        
        HashMap<String,Integer> hm = new  HashMap<>();
        
        hm.put("Google", 1);
        hm.put("Apple", 2);
        hm.put("Amazon", 3);
        hm.put("Microsoft", 4);
        hm.put("Meta", 5);
        
        // 1. exaples for iterations of HashMap.
        
        //a) Using System.out.println --> simple method
        System.out.println(hm);
        
        //b) USing forEach() method using Lambda Expression.
        
        hm.forEach((K,V)-> System.out.println("key = " + K + "value = " +V));
        
        System.out.println("--------------------------------------------");
        
        
        //c) Using Iterator 
        Iterator it = hm.entrySet().iterator(); // Here we dint specified the Iterator . This also we can do without specifying the type. 
        while(it.hasNext()){
            
        Map.Entry pairs = (Map.Entry)it.next();  // Map.Entry< K, V> will ask Key and value , but we have taken both in a referce variable as (pairs). 
          
        System.out.println(pairs.getKey() + " = " + pairs.getValue()); // using this refrence variable pairs (for key and value) ,wiil fetching the key and value using get() method.
        }
        
        System.out.println("----------------------------");
        
        
      // 2. Converting HashMap Keys into Arraylist. 
      
      List<String> lk = new ArrayList<>(hm.keySet());
       
      System.out.println(lk); // This will gives the  key and corresponding value together.
      
      for( String x : lk){  // This for each loop gives the keys of Hashmap(hm) only.
      System.out.println(x);
      }
          
     // 3. Converting HashMap Values into ArrayList.   
     
      List<Integer> lk1 = new ArrayList<>(hm.values());
      
       System.out.println(lk1); // This will gives the value of the keys.
       
      for( Integer y : lk1){  // This for each loop gives the Values of Hashmap(hm) only.
      System.out.println(y);
      }
              
              
     
    }
    
}
