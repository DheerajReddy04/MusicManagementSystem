import java.util.Arrays;
public class Sort {
    static String[] sorted = new String[10];

    void sortbyTitle() {
        int index = 0;
        for (int x = 0; x < Song.songs.length; x++) {
            if (Song.songs[x] != null) {
                sorted[index++] = Song.songs[x].title;
            }
        }
        String[] trimmedSorted = Arrays.copyOf(sorted, index);
        // Sort the array
        Arrays.sort(trimmedSorted);
        for(int x = 0; x < trimmedSorted.length; x++) {
            System.out.println(trimmedSorted[x]);
        }
    }

    void sortbyArtist() {
        int index = 0;
        for (int x = 0; x < Song.songs.length; x++) {
            if (Song.songs[x] != null) {
                sorted[index++] = Song.songs[x].artist;
            }
        }
        String[] trimmedSorted = Arrays.copyOf(sorted, index);
        // Sort the array
        Arrays.sort(trimmedSorted);
        for(int x = 0; x < trimmedSorted.length; x++) {
            System.out.println(trimmedSorted[x]);
        }
    }

    void sortbyAlbum() {
        int index = 0;
        for (int x = 0; x < Song.songs.length; x++) {
            if (Song.songs[x] != null) {
                sorted[index++] = Song.songs[x].album;
            }
        }
        String[] trimmedSorted = Arrays.copyOf(sorted, index);
        // Sort the array
        Arrays.sort(trimmedSorted);
        for(int x = 0; x < trimmedSorted.length; x++) {
            System.out.println(trimmedSorted[x]);
        }
    }
}
