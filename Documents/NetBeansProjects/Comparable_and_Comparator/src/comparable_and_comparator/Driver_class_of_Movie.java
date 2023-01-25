
package comparable_and_comparator;

import java.util.ArrayList;
import java.util.Collections;


public class Driver_class_of_Movie {
    
    public static void main(String[] args)
    {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));
        
        //Used Collections class sort method.
        Collections.sort(list);
        System.out.println("Movie after sorting : ");
        for (Movie mv : list){
            
            System.out.println(mv.getName() +" " + mv.getRating() + " " + mv.getYear());
        }
        
    }

    }
    

