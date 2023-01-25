
package Array_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


public class SynchronizedArrayList {
    
    public static void main(String[] args) {
        
        // 1st Method: Using Collections.synchronizedList() method.
        
        List<String> name = Collections.synchronizedList(new ArrayList<String>());
        
        name.add("Java");
        name.add("Python");
        name.add("JavaScript");
        
        // Use Synchronize keyword expicitly for fetching the elements
        
        synchronized(name){
            
            Iterator<String> it = name.listIterator();
            
            while(it.hasNext()){
                
                System.out.println(it.next());
            }
        }
     
        System.out.println("------------------------------------------------");   
        
        
        // 2nd Method: Using CopyOnWriteArrayList class.
        
        CopyOnWriteArrayList<String> cw = new CopyOnWriteArrayList<String>();
        
        cw.add("Ajit");
        cw.add("Bunty");
        cw.add("Sweta");
        
        Iterator<String> it1 = cw.listIterator();
            
            while(it1.hasNext()){
                
                System.out.println(it1.next());
            }
        
    }
    
}
