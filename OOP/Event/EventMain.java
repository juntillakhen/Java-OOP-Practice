package Event;

import java.util.ArrayList;
import java.util.Arrays;

public class EventMain {
    public static void main(String[] args) {
        Seminar seminar = new Seminar("NewFaceTech Innovations 2025", "2025-11-10", "Davao Convention Center", 5);

        MusicalPerformance concert = new MusicalPerformance(
            "Happy Tour for Music 2025",
            "2025-11-10",
            "Davao Convention Center",
            new ArrayList<>(Arrays.asList("The Midnight", "Arctic Monkeys", "Paramore"))
        );

        seminar.displayDetails();
        System.out.println("\n-------------------------------\n");
        concert.displayDetails();

        System.out.println("\n-------------------------------\n");
        if (seminar.hasConflict(concert)) {
            System.out.println("Schedule Conflict: Both events are on the same date and location!");
        } else {
            System.out.println("No schedule conflict detected.");
        }
    }
}

