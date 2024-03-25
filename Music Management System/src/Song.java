public class Song {
    static int i = 0;
    static Song[] songs = new Song[10];
    String title, artist, album, genre;

    public Song() {
        this.title = InputHandler.getStringInput("Title");
        this.artist = InputHandler.getStringInput("Artist Name");
        this.album = InputHandler.getStringInput("Album Name");
        this.genre = InputHandler.getStringInput("Genre");

        setSongs();
    }

    void setSongs() {
        if (i < songs.length) {
            songs[i] = this;
            System.out.println("Song added to DataBase");
            i++;
        }
        else {
            System.out.println("Database is full. Cannot add more songs.");
        }
    }
}
