import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class PlaylistManager {
    // Create a private field named playlists of type Map<String, List<Song>>
    private final Map<String, List<Song>> playlists;

    // Create a constructor for PlaylistManager class that initializes the playlist field
    public PlaylistManager() {
        this.playlists = new HashMap<>(); // Initialize the playlist field
    }

    // Create a method named addSongToPlaylist() that accepts two parameters:
    // playlistName of type String and song of type Song
    public void addSongToPlaylist(String playlistName, Song song) {

        // If the playlistName does not exist in the playlist map,
        // create a new list and add the song to the list
        if (!playlists.containsKey(playlistName)) {

            // Create a new list and add the song to the list
            playlists.put(playlistName, new ArrayList<>());
        }
        playlists.get(playlistName).add(song); // Add the song to the list
        System.out.println("Song added to the playlist: " + playlistName);
    }

    // Create a method named viewPlaylist() that accepts one parameter:
    // playlistName of type String
    public void viewPlaylist(String playlistName) {
        // If the playlistName exists in the playlist map,
        if (playlists.containsKey(playlistName)) {
            System.out.println("Playlist: " + playlistName);

            for (Song song : playlists.get(playlistName)) {
                System.out.println(song); // Print the songs in the list
            }
        } else {
            System.out.println("Playlist not found: " + playlistName);
        }
    }

    // Create a method named removeSongFromPlaylist() that accepts two parameters:
    public void removeSongFromPlaylist(String playlistName, String songTitle) {
        // playlistName of type String and songTitle of type String
        if (playlists.containsKey(playlistName)) {
            // Get the list of songs from the playlist map
            List<Song> playlist = playlists.get(playlistName);

            // Remove the song from the playlist
            playlist.removeIf(song -> song.getTitle().equalsIgnoreCase(songTitle));

            System.out.println("Song removed from the playlist: " + playlistName);
        } else {
            System.out.println("Playlist not found: " + playlistName);
        }
    }
}