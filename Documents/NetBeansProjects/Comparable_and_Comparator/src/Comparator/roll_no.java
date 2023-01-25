
package Comparator;

import java.util.Comparator;


public class roll_no implements Comparator<Student1>{

   
    @Override
    public int compare(Student1 S1, Student1 S2) {
        
        return S1.getRoll_no()-S2.getRoll_no();
        
        
    }
    
    
    
}
