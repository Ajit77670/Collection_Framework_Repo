
package Comparator;

import java.util.Comparator;


public class sub_name implements Comparator<Student1>{
    
     @Override
     public int compare(Student1 S1, Student1 S2) {
         
          return S1.getSubject().compareTo(S2.getSubject());
     }
    
}
