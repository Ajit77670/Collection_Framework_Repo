
package Comparator;

import java.util.Comparator;

    
    public class marks_1 implements Comparator<Student1>{
        
        
    @Override
    public int compare(Student1 S1, Student1 S2) {
         
         if( S1.getMarks() >S2.getMarks())return 1;
        
           if( S1.getMarks() <S2.getMarks())return -1;
        
           else
              return 0;
           }
        
        
    }
     
         
        



