
//Comparable interface example

package comparable_and_comparator;

import java.io.*;
import java.util.*;

public class Movie implements Comparable<Movie>
{
    private int year;
    private double rating;
    private String name;
    
//constructor 

public Movie(String nm,double rt,int yr){
    
    this.year =yr;
    this.rating=rt;
    this.name=nm;
}    

  @Override 
    public int compareTo(Movie m)  // Comparing on the basis of movie year.
    {
        return this.year - m.year;
    }

//getter methods for private variables.

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

}    


