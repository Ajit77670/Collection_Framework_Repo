
package Hash_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class HashMap_Comparisions {
    
    public static void main(String[] args) {
        
        HashMap<Integer,String> map1 = new  HashMap<Integer,String>();
        
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");
        
        
        HashMap<Integer,String> map2 = new  HashMap<Integer,String>();
        
        map2.put(3, "C");
        map2.put(1, "A");
        map2.put(2, "B");
        
       
        HashMap<Integer,String> map3 = new  HashMap<Integer,String>();
        
        map3.put(1, "A");
        map3.put(2, "B");
        map3.put(3, "C");
        map3.put(3, "D");
        
        //comparing hashmap using equals() method : on the basis of keys and values.
        
        System.out.println(map1.equals(map2));  //true
        System.out.println(map1.equals(map3)); //false
        
       //comparing hashmap using equals method() : on basis of Keyset().
       
        System.out.println(map1.keySet().equals(map2.keySet()));// true
        System.out.println(map1.keySet().equals(map3.keySet()));//true
        
        System.out.println("----------------------------------------");
        
       //find out the extra keys
       
       HashMap<Integer,String> map4 = new  HashMap<Integer,String>();
        
        map3.put(1, "A");
        map3.put(2, "B");
        map3.put(3, "C");
        map3.put(4, "D");
        
        HashSet<Integer> hset = new HashSet<>(map1.keySet());
        
         hset.addAll(map3.keySet());
         hset.removeAll(map1.keySet());
         System.out.println(hset);
         
         System.out.println("----------------------------");
         
         
        // compare maps by values :
        
        HashMap<Integer,String> map6 = new  HashMap<Integer,String>();
        
        map6.put(1, "A");
        map6.put(2, "B");
        map6.put(3, "C");
        
        
        HashMap<Integer,String> map7 = new  HashMap<Integer,String>();
        
        map7.put(3, "C");
        map7.put(1, "A");
        map7.put(2, "B");
        
       
        HashMap<Integer,String> map8 = new  HashMap<Integer,String>();
        
        map8.put(1, "A");
        map8.put(2, "B");
        map8.put(3, "C");
        map8.put(4, "C");
        
        
        //duplicates are not allowed (used ArrayList bcuz ArrayList can have duplicate objects/elements)
        System.out.println(map6.values().equals(map8.values())); //false
        System.out.println(new ArrayList<>(map7.values()).equals(new ArrayList<>(map6.values())));//true
        System.out.println(new ArrayList<>(map7.values()).equals(new ArrayList<>(map8.values())));//false
     
        //duplicate elemnts are allowed
        
        System.out.println(new HashSet<>(map7.values()).equals(new HashSet<>(map6.values())));//true
        System.out.println(new HashSet<>(map6.values()).equals(new HashSet<>(map8.values())));//true
        
        System.out.println(new HashSet<>(map8.values()));
        
    }
}
