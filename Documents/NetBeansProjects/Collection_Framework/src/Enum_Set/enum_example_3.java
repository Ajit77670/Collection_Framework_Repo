
package Enum_Set;


public class enum_example_3 {
    
    public enum Month{
        
        JAN, FEB,MARCH
    }
    
    public static void main(String[] args) {
        
        //printing all enum using for each loop and using enum values() method.
        for(Month x : Month.values()){
            
            System.out.println(x);
        }
        
         System.out.println("Value of  JAN is :" +Month.valueOf("JAN"));
         System.out.println("Value of  JAN is :" +Month.valueOf("JAN").ordinal());//index
         
         System.out.println("Value of  FEB is :" +Month.valueOf("FEB"));
         System.out.println("Value of  FEB is :" +Month.valueOf("FEB").ordinal());//index
         
         System.out.println("Value of  FEB is :" +Month.valueOf("MARCH"));
         System.out.println("Value of  FEB is :" +Month.valueOf("MARCH").ordinal());//index

    }
}
