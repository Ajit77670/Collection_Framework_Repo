/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comparable_and_comparator;

import java.util.Comparator;


public  class Year_Compare_Movie1 implements Comparator<Movie1>{

    
    
     @Override
     public int compare(Movie1 m1, Movie1 m2)  // Comparing on the basis of movie year.
    {
         return m1.getYear()-m2.getYear();
    }
    
}
