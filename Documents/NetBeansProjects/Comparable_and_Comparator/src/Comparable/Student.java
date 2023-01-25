
package Comparable;
import java.lang.Comparable;

 
public class Student implements Comparable<Student>{
    
  private int roll_no;
  private  String Subject;
  private  int marks;
    
   public  Student(int roll_no,String Subject,int marks){
        
       this.roll_no= roll_no;
       this.Subject= Subject;
       this.marks=marks;
       
    }
   
  @Override
   public String toString(){
       
       return "roll_no "+roll_no+ " Subject " + Subject + " marks " + marks;
   }
   
  @Override
   public int compareTo(Student st){  // sorting on the basis of role no.
       
       return this.roll_no - roll_no;
       
   }

    public int getRoll_no() {
        return roll_no;
    }

    public String getSubject() {
        return Subject;
    }

    public int getMarks() {
        return marks;
    }
   
    
}
