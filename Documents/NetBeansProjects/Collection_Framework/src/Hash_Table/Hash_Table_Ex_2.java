/*HashTable is a class which implements Map interface in collection Framework in Java.
* Hastable is Synchronized.
*HashTable does not main insertion order.
*Hashtable stores the elements/object in key ,value format.
*Hashtable does not support null for both key and values.
*The initial capacity of Hashtable is 11 and the load factor is 0.75.
*HashTable supports Heterogeneous data types.

*Constructors: Hashtable<K, V> ht = new Hashtable<K, V>(int initialCapacity);

*Hashtable(int initialCapacity): This creates a hash table that has an initial size specified by 
initialCapacity and the default load factor is 0.75.

 */
package Hash_Table;
import java.io.*;
import java.util.*;

public class Hash_Table_Ex_2 {
    
    public static void main(String args[])
    {
        
        Hashtable<Integer, String> ht1 = new Hashtable<>(4);
  
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");
       
        // ht1.put(null, "Zero"); // Not allow null key : NullPointerException
       // ht1.put(4, null);      //Not allow null values : NullPointerException
        
        System.out.println("Mappings of ht1 : " + ht1);
        System.out.println(ht1.get(1));
        
        Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>(2);
        
        ht2.put(4, "four");
        ht2.put(5, "five");
        ht2.put(6, "six");
       
        System.out.println("Mappings of ht2 : " + ht2);
    }
}
    

