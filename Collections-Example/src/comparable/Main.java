package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<>();
        list.add(new Movie(8.3, "Force Awakens", 2015));
        list.add(new Movie(8.7, "Star Wars", 1977));
        list.add(new Movie(8.8, "Empire Strikes Back", 1980));
        list.add(new Movie(8.4, "Return of the Jedi", 1983));

        Collections.sort(list);

        System.out.println("Movies after sorting: ");
        for (Movie movie : list) {
            System.out.println(movie.getRating() + " " + movie.getName() + " " + movie.getYear());
        }
    }
}
