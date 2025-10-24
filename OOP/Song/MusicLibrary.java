package Song;

import java.util.ArrayList;
import java.util.Random;

public class MusicLibrary {
    private ArrayList<Song> songs;
    private Random random;

    public MusicLibrary() {
        songs = new ArrayList<>();
        random = new Random();
    }

    public void addSong(Song song) {
        songs.add(song);
        System.out.println("Added song: " + song);
    }

    public void removeSong(String title) {
        Song toRemove = null;
        for (Song song : songs) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                toRemove = song;
                break;
            }
        }
        if (toRemove != null) {
            songs.remove(toRemove);
            System.out.println("Removed song: " + toRemove);
        } else {
            System.out.println("Song titled \"" + title + "\" not found.");
        }
    }

    public void playRandomSong() {
        if (songs.isEmpty()) {
            System.out.println("No songs in the library to play.");
            return;
        }
        int index = random.nextInt(songs.size());
        Song song = songs.get(index);
        System.out.println("Now playing: " + song);
    }

    public void displaySongs() {
        if (songs.isEmpty()) {
            System.out.println("Music library is empty.");
            return;
        }
        System.out.println("Songs in library:");
        for (Song song : songs) {
            System.out.println("- " + song);
        }
    }
}
