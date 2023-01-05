package comparable;

public class Movie implements Comparable<Movie> {
    private double rating;
    private String name;
    private int year;

    //  used to sort movies by year
    @Override
    public int compareTo(Movie o) {
        return this.year - o.year;
    }

    public Movie(double rating, String name, int year) {
        this.rating = rating;
        this.name = name;
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}
