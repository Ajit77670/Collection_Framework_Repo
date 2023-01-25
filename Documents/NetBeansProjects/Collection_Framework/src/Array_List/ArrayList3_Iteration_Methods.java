
package Array_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayList3_Iteration_Methods {
    
    public static void main(String[] args) {
        
        ArrayList<String> str = new ArrayList<String>();
        
        str.add("Java");
        str.add("Python");
        str.add("JS");
        str.add("Navven");
        
        //Typical for loop  --> iteration.
        
        for(int i=0;i<str.size();i++){
            
            System.out.println(str.get(i));
        }
        
        // fro each loop --> iteration.
        
        ArrayList<String> str1 = new ArrayList<String>();
        
        str1.add("Papa");
        str1.add("Maa");
        str1.add("Bhaiya");
        str1.add("Ajit");
        str1.add("Sweta");
        
        for (String x : str1)
           
          System.out.println(x);
        
        // Using iterator
        
        ArrayList<Integer> str3 = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
        
        Iterator<Integer> it = str3.iterator();
        while(it.hasNext()){
            
            System.out.println(it.next());
        }
        
        //using forEach method and use it in form of Lambda Expression
        
         ArrayList<Integer> str4 = new ArrayList<Integer>(Arrays.asList(111,210,310,410,510));
        
         str4.forEach(no->System.out.println(no));
            
            }
}

    

