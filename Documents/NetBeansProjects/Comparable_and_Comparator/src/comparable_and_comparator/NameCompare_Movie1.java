
package comparable_and_comparator;

import java.util.Comparator;


public class NameCompare_Movie1 implements Comparator<Movie1>{
    
    @Override
    public int compare(Movie1 m1, Movie1 m2)
    {
        return m1.getName().compareTo(m2.getName());
    }
    
}
