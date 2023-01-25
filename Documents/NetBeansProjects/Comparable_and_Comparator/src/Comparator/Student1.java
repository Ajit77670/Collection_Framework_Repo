
package Comparator;


 public  class Student1 {
    
  private int roll_no;
  private  String Subject;
  private  int marks;
    
   public  Student1(int roll_no,String Subject,int marks){
        
       this.roll_no= roll_no;
       this.Subject= Subject;
       this.marks=marks;
       
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
