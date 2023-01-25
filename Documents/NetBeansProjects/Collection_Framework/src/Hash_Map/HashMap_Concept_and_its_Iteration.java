
package Hash_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;


public class HashMap_Concept_and_its_Iteration {
    
    public static void main(String[] args) {
        
        HashMap<String,String> capital = new HashMap<String,String> ();
        
        capital.put("India", "New Delhi");
        capital.put("Bihar", "Patna");
        capital.put("Karnataka", "Bangalore");
        capital.put("UP", "Lucknow");
        capital.put("Jharkhand", "Ranchi");
        capital.put("MP", "Bhopal");
       
        
        // using System.out.println
        System.out.println(capital);
        
        System.out.println("------------------");
        
        //iterator: over the keys: by using KeySet()
        Iterator<String> it =capital.keySet().iterator();
        while(it.hasNext()){
            
            String key =it.next();
            String value =capital.get(key);
            
            System.out.println("Key = " + key + "," + " value = " + value);
        }
        
        System.out.println("------------------------");
       
      
      //iterator : over set(pair): by using entryset
      
      Iterator<Entry<String,String>> it1 =capital.entrySet().iterator();
      
      while(it1.hasNext()){
          
         Entry<String,String> entry =it1.next();
          System.out.println("key = " + entry.getKey() + " and value = " +entry.getValue());
      }
      
        System.out.println("----------------------------");
        
      //iterate hashmap  : using Java 8 forEach() method  and  Lambda Expression
      
    capital.forEach((k,v)-> System.out.println("key = " +k+ "and value is =" +v));
    
      
        
        
              
        
    }
    
}
