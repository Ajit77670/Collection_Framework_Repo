
package comparable_and_comparator;

import java.util.Comparator;


public class Rating_Compare_Movie1 implements Comparator<Movie1> {
    
    @Override
    public int compare(Movie1 m1, Movie1 m2)
    {
        if (m1.getRating() < m2.getRating()) return -1;
        if (m1.getRating() > m2.getRating()) return 1;
        else return 0;
    }
    
}
