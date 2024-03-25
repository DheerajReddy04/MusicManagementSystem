public class ManageSongs {
    void updateTitle() {
        String titleOfSong = InputHandler.getStringInput("Enter the name of the song you want to change");
        for (int x = 0; x < Song.songs.length; x++) {
            if (Song.songs[x] != null && Song.songs[x].title.equals(titleOfSong)) {
                Song.songs[x].title = InputHandler.getStringInput("Enter the new title: ");
                System.out.println("Title successfully changed.");
                break;
            }
        }
    }

    void updateArtist() {
        String titleOfSong = InputHandler.getStringInput("Enter the title of the Song for which you want to change the Artist name");
        for (int x = 0; x < Song.songs.length; x++) {
            if (Song.songs[x] != null && Song.songs[x].title.equals(titleOfSong)) {
                System.out.println("The current Artist's name is " +  Song.songs[x].artist);
                Song.songs[x].artist = InputHandler.getStringInput("Enter the new Artist name: ");
                System.out.println("Artist name successfully changed.");
                break;
            }
        }
    }

    void updateAlbum() {
        String titleOfSong = InputHandler.getStringInput("Enter the title of the Song for which you want to change the Album name");
        for (int x = 0; x < Song.songs.length; x++) {
            if (Song.songs[x] != null && Song.songs[x].title.equals(titleOfSong)) {
                System.out.println("The current Album's name is " +  Song.songs[x].album);
                Song.songs[x].album = InputHandler.getStringInput("Enter the new Album name: ");
                System.out.println("Album name successfully changed.");
                break;
            }
        }
    }

    void updateGenre() {
        String titleOfSong = InputHandler.getStringInput("Enter the title of the Song for which you want to change the Genre");
        for (int x = 0; x < Song.songs.length; x++) {
            if (Song.songs[x] != null && Song.songs[x].title.equals(titleOfSong)) {
                System.out.println("The current Genre's name is " +  Song.songs[x].genre);
                Song.songs[x].genre = InputHandler.getStringInput("Enter the new Genre name: ");
                System.out.println("Genre successfully changed.");
                break;
            }
        }
    }
}
