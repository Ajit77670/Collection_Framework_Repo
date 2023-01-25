/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comparable;

import java.util.ArrayList;
import java.util.Collections;


public class Student_Driver {
    
    public static void main(String[] args) {
        
     ArrayList<Student> al = new ArrayList<Student>();
    
     al.add(new Student(1,"DSA",100));
     al.add(new Student(2,"SSD",70));
     al.add(new Student(4,"HSD",50));
     al.add(new Student(3,"SQL",80));
     
     Collections.sort(al);
        System.out.println("After sorting");
        
        al.forEach((c)->System.out.println(c));
    
    
}

}