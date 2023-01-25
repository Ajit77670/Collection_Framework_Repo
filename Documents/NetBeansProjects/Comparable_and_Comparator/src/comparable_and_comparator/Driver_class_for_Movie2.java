
package comparable_and_comparator;

import java.util.ArrayList;
import java.util.Collections;


public class Driver_class_for_Movie2 {
    
    public static void main(String[] args)
    {
        ArrayList<Movie1> list = new ArrayList<Movie1>();
        list.add(new Movie1("Force Awakens", 8.3, 2015));
        list.add(new Movie1("Star Wars", 8.7, 1977));
        list.add(new Movie1("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie1("Return of the Jedi", 8.4, 1983));
 
        // Sort by rating : (1) Create an object of rating
        //                  (2) Call Collections.sort
        //                  (3) Print Sorted list
        
        System.out.println("Sorted by rating");
        Rating_Compare_Movie1 ratingCompare = new Rating_Compare_Movie1();
        Collections.sort(list, ratingCompare);
        for (Movie1 movie: list)
            System.out.println(movie.getRating() + " " +
                               movie.getName() + " " +
                               movie.getYear());
 
 
        // Call overloaded sort method with Name Compare
        // (Same three steps as above)
        
        System.out.println("\nSorted by name");
        NameCompare_Movie1 nameCompare = new NameCompare_Movie1();
        Collections.sort(list, nameCompare);
        for (Movie1 movie: list)
            System.out.println(movie.getName() + " " +
                               movie.getRating() + " " +
                               movie.getYear());
 
        // Uses Comparable to sort by year
        
        System.out.println("\nSorted by year");
        Year_Compare_Movie1 yearcompare= new Year_Compare_Movie1();
        Collections.sort(list,yearcompare);
        for (Movie1 movie: list)
            System.out.println(movie.getYear() + " " +
                               movie.getRating() + " " +
                               movie.getName()+" ");
    }
} 
    

