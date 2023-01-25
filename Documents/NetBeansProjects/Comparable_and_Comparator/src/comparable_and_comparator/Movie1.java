
package comparable_and_comparator;

import java.util.Comparator;


public class Movie1 <Movie1> {
    
    private int year;
    private String name;
    private double rating;
    
    
    // Used to sort movies by year
    
    /*@Override
    public int compareTo(Movie1 m)  // override method for Comparable
    {
        return this.year - m.year;
    }
    */
    public Movie1( String nm,double rt,int yr ){  //constructor
    
    this.name  = nm;
    this.year = yr;
    this.rating=rt;
}

    //getter methods for private varibles
    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }
    
    
    
    
}
