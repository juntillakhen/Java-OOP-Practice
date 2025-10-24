package Movie;
import java.util.ArrayList;

public class Movie {
    private String title;
    private String director;
    private ArrayList<String> actors;
    private ArrayList<String> reviews;

    public Movie(String title, String director, ArrayList<String> actors) {
        this.title = title;
        this.director = director;
        this.actors = new ArrayList<>(actors);
        this.reviews = new ArrayList<>();
    }

    public void addReview(String review) {
        reviews.add(review);
    }

    public ArrayList<String> getReviews() {
        return new ArrayList<>(reviews);  
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Actors: " + String.join(", ", actors));
    }
}
