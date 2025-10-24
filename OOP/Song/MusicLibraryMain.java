package Song;

public class MusicLibraryMain {
    public static void main(String[] args) {
        MusicLibrary library = new MusicLibrary();

        library.addSong(new Song("In the End", "Linkin Park"));
        library.addSong(new Song("Believer", "Imagine Dragon"));
        library.addSong(new Song("21 Guns", "Greenday"));

        library.displaySongs();

        library.playRandomSong();

        library.removeSong("Believer");
        library.removeSong("21 Guns");  

        library.displaySongs();

        library.playRandomSong();
    }
}
