/**
 * Important: EnumSet is an class which implements set interface.
 * Import: enum is a class having private constructor.
 * Important: we cant create the object of enum as it have private constructor.
 */
package Enum_Set;
import java.util.EnumSet;
import java.util.Iterator;


enum Family{
    
    PAPA(1),MUMMY(2),BUNTY(3),AJIT(4),SWETA(5); 
    // iw we are assigning value to the enum then we must create its private constructor.
    //Inmportant-->Always remember enum has private constructor and so we cant create objects for the enum.
                                                                              
   private int value;
   
   private Family(int value){
       
       this.value=value;
       
   }
}


public class Enum_Set_Example_1 {
    
    public static void main(String[] args) {
        
        EnumSet<Family> fm = EnumSet.allOf(Family.class); // print all the memebers of Enum(Family) class.
        System.out.println(fm);
       
        System.out.println(Family.valueOf("PAPA").ordinal()); // This will give the index of Family enum constants.
        
        
        Family fms[]=Family.values();  // To print all element using values() method which store enum in Array[]
        for(Family x : fms){
            System.out.println(x);
        }
        
        // EnumSet.range() method gives the range b/w the constants.
        EnumSet<Family> fm1 = EnumSet.range(Family.MUMMY,Family.SWETA); 
        System.out.println(fm1);
        
        
        // Empty enum set creation:
       //we are Wriitng Family.class bcux enum is a class having private constructor so we cant create its object.
        // So to use eneum class(Family) in EnumSet we are using methods of EnumSet
       EnumSet<Family> empty = EnumSet.noneOf(Family.class); 
        System.out.println(empty);
        
        //add and addAll() Methods of EnumSet
        EnumSet<Family> fm3 = EnumSet.allOf(Family.class);
        EnumSet<Family> fm4 = EnumSet.noneOf(Family.class);
        fm4.add(Family.PAPA);
        fm4.addAll(fm3);
        System.out.println(fm3);
        
        // How to iterate EnumSet: iterator
        
        EnumSet<Family> fm6 = EnumSet.allOf(Family.class);
        Iterator<Family> it = fm6.iterator();
        while(it.hasNext()){
            
            System.out.println(it.next());
        }
        
        // remove() and removeAll() method of EnumSet
        
        EnumSet<Family> fm7 = EnumSet.allOf(Family.class);
        System.out.println(fm7);
        
        boolean b =fm7.remove(Family.PAPA); //remove() method.
        System.out.println(b);
        
        boolean b1=fm7.removeAll(fm7); // removeAll() method
        System.out.println(b1);
        System.out.println(fm7);
        
    }
    
}
