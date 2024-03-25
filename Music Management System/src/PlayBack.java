public class PlayBack {
    static int playing = 0;
    void isPlaying() {
        if(playing == 0) {
            System.out.println("\n1. Select a Song\n2. Select from a playlist");
            String toPlay;
            int op1 = InputHandler.getIntInput("Enter an Option.");
            switch(op1) {
                case 1: toPlay = InputHandler.getStringInput("Enter the Song name.");
                        System.out.println("Playing " + toPlay + "..." );
                        playing = 1;
                        break;
                case 2: toPlay = InputHandler.getStringInput("Enter the Playlist name.");
                        System.out.println("Playing songs from the playlist " + toPlay);
                        playing = 1;
                        break;
            }
        }
        else {
            System.out.println("Already Playing...");
        }
    }

    void stopPlaying() {
        if(playing == 1) {
            System.out.println("Stopped Playing...");
            playing = 0;
        }
        else {
            System.out.println("Not playing in the first place...");
        }
    }
}
