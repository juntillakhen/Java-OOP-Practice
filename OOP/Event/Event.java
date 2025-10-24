package Event;

import java.util.ArrayList;

public class Event {
    protected String eventName;
    protected String date;     
    protected String location;

    public Event(String eventName, String date, String location) {
        this.eventName = eventName;
        this.date = date;
        this.location = location;
    }

    public void displayDetails() {
        System.out.println("Event Name: " + eventName);
        System.out.println("Date: " + date);
        System.out.println("Location: " + location);
    }

    public boolean hasConflict(Event otherEvent) {
        return this.date.equals(otherEvent.date) && this.location.equalsIgnoreCase(otherEvent.location);
    }
}

class Seminar extends Event {
    private int numberOfSpeakers;

    public Seminar(String eventName, String date, String location, int numberOfSpeakers) {
        super(eventName, date, location);
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public void displayDetails() {
        System.out.println("Seminar Details:");
        System.out.println("Event Name: " + eventName);
        System.out.println("Date: " + date);
        System.out.println("Location: " + location);
        System.out.println("Number of Speakers: " + numberOfSpeakers);
    }
}

class MusicalPerformance extends Event {
    private ArrayList<String> performers;

    public MusicalPerformance(String eventName, String date, String location, ArrayList<String> performers) {
        super(eventName, date, location);
        this.performers = new ArrayList<>(performers);
    }

    public void displayDetails() {
        System.out.println("Musical Performance Details:");
        System.out.println("Event Name: " + eventName);
        System.out.println("Date: " + date);
        System.out.println("Location: " + location);
        System.out.println("Performers: " + String.join(", ", performers));
    }
}
