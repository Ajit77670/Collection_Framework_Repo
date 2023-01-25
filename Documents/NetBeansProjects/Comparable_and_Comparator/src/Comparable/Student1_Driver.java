
package Comparable;

import Comparator.Student1;
import Comparator.marks_1;
import Comparator.roll_no;
import Comparator.sub_name;
import java.util.ArrayList;
import java.util.Collections;


public class Student1_Driver {
    
    public static void main(String[] args) {
        
        
     ArrayList<Student1> al1 = new ArrayList<Student1>();
    
     al1.add(new Student1(1,"DSA",100));
     al1.add(new Student1(2,"SSD",70));
     al1.add(new Student1(4,"HSD",50));
     al1.add(new Student1(3,"SQL",80));
     
     System.out.println("Sorted by marks");
     marks_1 mk = new marks_1();
     Collections.sort(al1, mk);
     for(Student1 s : al1){
     System.out.println(s.getMarks()+" " +s.getRoll_no()+" "+s.getSubject());
     
     
     System.out.println("Sorted by subject name");
     sub_name sb = new sub_name();
     Collections.sort(al1, mk);
     for(Student1 x : al1){
     System.out.println(x.getSubject()+ " " +x.getMarks()+ " "+x.getRoll_no());
     
     
     
     System.out.println("Sorted by roll no");
     roll_no rr = new roll_no();
     Collections.sort(al1, mk);
     for(Student1 z : al1){
     System.out.println(z.getRoll_no()+" " +z.getMarks()+" "+z.getSubject());
     }
   
    }
    
    }

    }}
