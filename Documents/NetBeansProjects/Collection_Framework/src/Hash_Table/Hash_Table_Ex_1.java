/**
*HashTable is a class which implements Map interface in collection Framework in Java.
*HasTable is Synchronized
* HashTable does not maintain insertion order.
*HashTable stores the elements/object in key ,value format.
*HashTable does not support null for both key and values.
* HashTable support Heterogeneous data types.
*The initial capacity of HashTable is 11 and the load factor is 0.75.
 * Constructors: HashTable<K, V> ht = new HashTable<K, V>();
 * 1. HashTable(): This creates an empty hashTable with the default load factor of 0.75 and an initial capacity is 11. 
 */
package Hash_Table;
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Hash_Table_Ex_1 {
    
    public static void main(String args[])
    {
        
        Hashtable ht1 = new Hashtable();
  
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");
        ht1.put(4, 100);
       // ht1.put(null, "Zero"); // Not allow null key : NullPointerException
       // ht1.put(4, null);      //Not allow null values : NullPointerException
        System.out.println("Mappings of ht1 : " + ht1);
        
        System.out.println(ht1.get(1)); // get the value at specified index.
        
        System.out.println(ht1.remove(1));
        System.out.println(ht1);
        System.out.println(ht1.contains("two")); // contains() here check for value given.
        System.out.println(ht1.containsKey(4));  // contains() here check for key given.
        System.out.println(ht1.isEmpty()); // checks if Hashtable is empty or not.
        
        System.out.println(ht1.keySet()); //gives all the key present of HashTable
        System.out.println(ht1.values()); // gives all the values of HashTable
        
        for(Object x : ht1.keySet()){  // using this for-each loop technique we can fetch key along with its values.
            System.out.println(x+ " "+ht1.get(x));
        }
        
        Hashtable<Integer, String> ht2= new Hashtable<Integer, String>();
  
        ht2.put(4, "four");
        ht2.put(5, "five");
        ht2.put(6, "six");
       
       System.out.println("Mappings of ht2 : " + ht2);
       
       for(int k : ht2.keySet()){  // using this for-each loop technique we will get key along with its values.
           
        System.out.println(k+ " " +ht2.get(k));
       }
       
       for(Map.Entry entry:ht2.entrySet())  // using this for each loop we will get key along with its values.
       {
           System.out.println(entry.getKey()+ " "+entry.getValue());
       }
        
       System.out.println("-----------");
       

    //using iterator
       
     Set s=  ht2.entrySet();
     
     Iterator it1= s.iterator();
     while(it1.hasNext()){
     Map.Entry entry1=(Entry)it1.next();
         System.out.println(entry1.getKey() + "  " +entry1.getValue());
     
     }
    
    }
}
    

