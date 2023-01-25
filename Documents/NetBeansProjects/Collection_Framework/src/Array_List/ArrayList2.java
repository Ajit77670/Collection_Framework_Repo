
package Array_List;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class ArrayList2 {
    
    public static void main(String[] args) {
        
        ArrayList<String> al = new   ArrayList<String>();
        
        al.add("Hello");
        al.add("Hi");
        al.add("Bye");
        al.add("Bye");
        
        ArrayList<String> al2 =  new ArrayList<String>();
        
        al2.add("Java");
        al2.add("Python");
        al2.add("JS");
        
        //1. addAll() Method:
        // al.addAll(al2);
        //System.out.println(al);
        
        //2. addAll() Method:
        al.addAll(1, al2);
        //System.out.println(al);
        
        //3. clear() Method
       // al.clear(); --> it is void type ,it will just clear ,empty the arraylist
       // System.out.println(al);
        
        //4. clone() Method
        //al.clone();--> its return type is object but we need it in form of ArrayList.
       ArrayList<String> as= (ArrayList<String>)al.clone();
        //System.out.println(as);
        
        
        //5.Contains() Method.
        System.out.println(al.contains("Hello"));
        
        //6. indexof() Method.
        System.out.println(al.indexOf("Hello"));
        System.out.println(al.lastIndexOf("Bye"));
        
        //7.remove() Method.
       // System.out.println(al.remove(1));
        System.out.println(al.remove("Java"));
        
       
        //8. removeif() Method.
        ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(10,25,37,41,50,60));
        number.removeIf(num -> num%2==0);
        System.out.println(number);
    
    //9.retainAll() Method.    
     ArrayList<String> name1 = new ArrayList<String>(Arrays.asList("Appa","Amma","Kappa","Tappa","Appa"));
        name1.retainAll(Collections.singleton("Appa"));
        System.out.println(name1);
       
        
    //10.sublist() Method.    
    
     ArrayList<Integer> number1 = new ArrayList<Integer>(Arrays.asList(11,22,13,14,15,16));
     ArrayList<Integer> sublist = new ArrayList<Integer>(number1.subList(1, 3));
     System.out.println(sublist);
     
     
     //11. forEach() Method used to traverse/iterate the object/elements of all the Arraylist.
     ArrayList<Integer> number3 = new ArrayList<Integer>(Arrays.asList(10,25,37,41,50,60));
     number3.forEach((num) -> System.out.println(num));
     
     //12. toString() Method()
     ArrayList<Integer> number4 = new ArrayList<Integer>(Arrays.asList(12,25,37,41,50,60));
        System.out.println(number4.toString());
        
        //13. toArray() Method()
        ArrayList<Integer> number5 = new ArrayList<Integer>(Arrays.asList(12,25,37,41,50,60));
        Integer[] ar7= new Integer[number5.size()];
        ar7=number5.toArray(ar7);
      
        for(Integer x : ar7)
        System.out.println(x);
    }       
        
    }
    

