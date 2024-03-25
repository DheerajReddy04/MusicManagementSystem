class Main {
    public static void main(String[] args) {
        System.out.println("MUSIC MANAGEMENT SYSTEM");
        while (true) {
            System.out.print("\n1. Add Songs\n2. Manage Songs\n3. Audio Playback\n4. Sort by\n5. Exit\n");
            int op = InputHandler.getIntInput("Enter an Option");
            switch(op) {
                case 1: Song s1 = new Song();
                        break;
                case 2: System.out.println("\nWhat Operation do you want to perform\n1. Update title of the song\n2. Update Artist name of the song\n3. Update Album name of the song\n4. Update the Genre of the song.");
                        int op1 = InputHandler.getIntInput("Enter an Option");
                        ManageSongs m1 = new ManageSongs();
                        switch(op1) {
                            case 1: m1.updateTitle();
                                    break;
                            case 2: m1.updateArtist();
                                    break;
                            case 3: m1.updateAlbum();
                                    break;
                            case 4: m1.updateGenre();
                                    break;
                            default: System.out.println("Enter a valid option.");
                        }
                        break;
                case 3: System.out.println("\nWhat Operation do you want to perform\n1. Play\n2. Pause");
                        int op2 = InputHandler.getIntInput("Enter an Option");
                        PlayBack p1  =new PlayBack();
                        switch (op2) {
                            case 1: p1.isPlaying();
                                    break;
                            case 2: p1.stopPlaying();
                                    break;
                        }
                        break;
                case 4: System.out.println("\nSort\n1. Songs\n2. Artists\n3. Albums");
                        int op3 = InputHandler.getIntInput("Enter the Option");
                        Sort so1 = new Sort();
                        switch (op3) {
                            case 1: so1.sortbyTitle();
                                    break;
                            case 2: so1.sortbyArtist();
                                    break;
                            case 3: so1.sortbyAlbum();
                                    break;
                        }
                        break;
                case 5: System.out.println("Exiting Music Management System. Tune in again!");
                        InputHandler.closeScanner();
                        System.exit(0);
            }
        }
    }
}
