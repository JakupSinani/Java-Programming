package test;

import comparable.Movie;
import comparator.NameCompare;
import comparator.RatingCompare;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieSorterTest {
    @Test
    public void testSortByRating() {
        ArrayList<Movie> list = new ArrayList<>();
        list.add(new Movie(8.3, "Force Awakens", 2015));
        list.add(new Movie(8.7, "Star Wars", 1977));
        list.add(new Movie(8.8, "Empire Strikes Back", 1980));
        list.add(new Movie(8.4, "Return of the Jedi", 1983));

        // Act
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list, ratingCompare);

        // Assert
        assertEquals(8.3, list.get(0).getRating(), 0.1);
        assertEquals(8.4, list.get(1).getRating(), 0.1);
        assertEquals(8.7, list.get(2).getRating(), 0.1);
        assertEquals(8.8, list.get(3).getRating(), 0.1);
    }

    @Test
    public void testSortByName() {
        ArrayList<Movie> list = new ArrayList<>();
        list.add(new Movie(8.3, "Force Awakens", 2015));
        list.add(new Movie(8.7, "Star Wars", 1977));
        list.add(new Movie(8.8, "Empire Strikes Back", 1980));
        list.add(new Movie(8.4, "Return of the Jedi", 1983));

        //  act
        NameCompare nameCompare = new NameCompare();
        Collections.sort(list, nameCompare);

        //  assert
        assertEquals("Empire Strikes Back", list.get(0).getName());
        assertEquals("Force Awakens", list.get(1).getName());
        assertEquals("Return of the Jedi", list.get(2).getName());
        assertEquals("Star Wars", list.get(3).getName());
    }

    @Test
    public void testSortByYear() {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie(8.3, "Force Awakens", 2015));
        list.add(new Movie(8.7, "Star Wars", 1977));
        list.add(new Movie(8.8, "Empire Strikes Back", 1980));
        list.add(new Movie(8.4, "Return of the Jedi", 1983));
        // Act
        Collections.sort(list);

        // Assert
        assertEquals(1977, list.get(0).getYear());
        assertEquals(1980, list.get(1).getYear());
        assertEquals(1983, list.get(2).getYear());
        assertEquals(2015, list.get(3).getYear());

    }
}
