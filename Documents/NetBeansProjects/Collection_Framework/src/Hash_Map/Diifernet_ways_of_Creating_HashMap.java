
package Hash_Map;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.lang.*;


public class Diifernet_ways_of_Creating_HashMap {
    
    //Created static HashMap for 2nd Method. Written before bcuz static block executes before main() method.
    public static HashMap<String, Integer> marksMap;
    
    static {  
        marksMap= new HashMap<>();
        marksMap.put("Ajit", 1);
        marksMap.put("Sumit", 2);
        
    }
    
    public static void main(String[] args) {
        
        // 1. Using simple approach by Using HashMap class
        
        HashMap<String,String> hs1 = new HashMap<String,String>();
        //HashMap<String,String> hs1 = new HashMap<>();
        
        Map<String,Integer> mp1 = new HashMap<String,Integer>();
        //Map<String,Integer> mp1 = new HashMap<>();
        
      
        // 2. Using Static way :static HashMap (We generally avoid using this method for initializing HashMap)
        
        System.out.println(Diifernet_ways_of_Creating_HashMap.marksMap.get("Ajit"));
        System.out.println(Diifernet_ways_of_Creating_HashMap.marksMap.get("Sumit"));
        
        
        // 3. Craeting SingletonMap using singletonMap() method of Collections class . 
        //imutableMap with only one single entry: (Interview Question) 
        Map<String, Integer> map4 = Collections.singletonMap("Maa", 11);
        System.out.println(map4.get("Maa"));
       // map4.put("Ajit", 2); // --> it will not allowed to add any other entry to the map4 
                                      //as we have make it as singleton Map which means it will contains only one Hashmap entry.
                                      // gives error : java.lang.UnsupportedOperationException  
                                      
       
// 4. Craeting one 2D Array  of Strings using Stream and collecting in the form of Map. (Interview Question)
       
       Map<String, String> map5 = Stream.of(new String [][]{
        
        {"Ajit","Maa"},
        {"Bunty", "Sweta"}
        
    }).collect(Collectors.toMap(data -> data[0], data -> data[1]));
                   
        System.out.println(map5.get("Ajit"));
        map5.put("Om", "Infinite");
        System.out.println(map5.get("Om"));
       
        
   // 5. Using Stream.of() method --> Creating AbstractMap Using SimpleEntry
   
  Map<String,String> map6 = Stream.of(
   
           new AbstractMap.SimpleEntry<>("Naveen","Java"),
           new AbstractMap.SimpleEntry<>("Hi","Hello")
           
           ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
           
        System.out.println(map6.get("Naveen"));
        System.out.println(map6.get("Hi"));
   
        
     
     //JDK 1.9
    // 6. craeting an empty Map  using Map.of() method.
    Map<String,Integer> emptymap = Map.of();
    
   //  emptymap.put("Hola", 1); // it will throw an error  java.lang.UnsupportedOperationException
   //  System.out.println(emptymap.get("Hola")); //bcuz this we have created an empty map which wont allow to add objects.
    
   //7. creating SingletonMap using Map.of() method of Map interface.
   Map<String,Integer> map7 = Map.of("Ajit", 1);
        System.out.println(map7.get("Ajit"));
        
  //  map7.put("Sumit", 2);   // error: java.lang.UnsupportedOperationException
   // System.out.println(map7.get("Sumit")); // it will not allowed to add the object as we make it singletonMap using Map.of() method.
   
   
   //8. Creating MultiMap using Map.of() method. --> // Max 10 pairs can be stored.
   Map<String,Integer> map8 = Map.of("Maa", 1, "Sumit", 2, "Sweta", 3, "Ajit", 4);
        System.out.println(map8.get("Maa"));
   
    
   // 9.Using  Map.ofEntries() --> craeting AbstractMap using SimpleEntry (no limitation on pairs of key and value)
   // this also be an immutable map. i.e post the entries we cant add others object into it.
   Map<String,Integer> map9 = Map.ofEntries(
   
           new AbstractMap.SimpleEntry<>("A",100),
           new AbstractMap.SimpleEntry<>("B",200),
           new AbstractMap.SimpleEntry<>("C",300)
           
   );
   
        System.out.println(map9.get("A"));
        
        
   // 10. creating Maps using Gauva(Google API) --> This is an ImmutableMap
   
     //  Map<String,String> map11= ImmutableMap.of("Goole","GoogleIndia", "Amazon","AmazonIndia");
      //  System.out.println(map11.get("Amazon"));
    }
    
}
