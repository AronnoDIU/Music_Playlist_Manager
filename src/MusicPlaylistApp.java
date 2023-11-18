import java.util.Scanner;

public class MusicPlaylistApp {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        PlaylistManager playlistManager = new PlaylistManager();

        while (true) {
            System.out.println("\nMusic Playlist Manager");
            System.out.println("1. Add song to playlist");
            System.out.println("2. View playlist");
            System.out.println("3. Remove song from playlist");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = userInput.nextInt();
            userInput.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter playlist name: ");
                    String playlistName = userInput.nextLine();
                    System.out.print("Enter song title: ");
                    String title = userInput.nextLine();
                    System.out.print("Enter artist name: ");
                    String artist = userInput.nextLine();
                    System.out.print("Enter genre: ");
                    String genre = userInput.nextLine();
                    System.out.print("Enter mood: ");
                    String mood = userInput.nextLine();

                    Song newSong = new Song(title, artist, genre, mood);
                    playlistManager.addSongToPlaylist(playlistName, newSong);
                    break;

                case 2:
                    System.out.print("Enter playlist name: ");
                    String viewPlaylistName = userInput.nextLine();
                    playlistManager.viewPlaylist(viewPlaylistName);
                    break;

                case 3:
                    System.out.print("Enter playlist name: ");
                    String removePlaylistName = userInput.nextLine();
                    System.out.print("Enter song title to remove: ");
                    String removeSongTitle = userInput.nextLine();
                    playlistManager.removeSongFromPlaylist(removePlaylistName, removeSongTitle);
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    userInput.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}