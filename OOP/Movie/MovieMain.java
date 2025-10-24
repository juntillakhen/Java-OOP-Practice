package Movie;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieMain {
    public static void main(String[] args) {
        Movie movie = new Movie(
            "Inception",
            "Christopher Nolan",
            new ArrayList<>(Arrays.asList("Leonardo DiCaprio", "Joseph Gordon-Levitt", "Ellen Page"))
        );

        movie.displayInfo();

        movie.addReview("Amazing plot and visuals!");
        movie.addReview("Mind-bending thriller, loved it.");
        movie.addReview("A bit confusing but great overall.");

        System.out.println("\nReviews:");
        for (String review : movie.getReviews()) {
            System.out.println("- " + review);
        }
    }
}
