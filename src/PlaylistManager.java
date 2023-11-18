import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class PlaylistManager {
    private final Map<String, List<Song>> playlists;

    public PlaylistManager() {
        this.playlists = new HashMap<>();
    }

    public void addSongToPlaylist(String playlistName, Song song) {
        if (!playlists.containsKey(playlistName)) {
            playlists.put(playlistName, new ArrayList<>());
        }
        playlists.get(playlistName).add(song);
        System.out.println("Song added to the playlist: " + playlistName);
    }

    public void viewPlaylist(String playlistName) {
        if (playlists.containsKey(playlistName)) {
            System.out.println("Playlist: " + playlistName);
            for (Song song : playlists.get(playlistName)) {
                System.out.println(song);
            }
        } else {
            System.out.println("Playlist not found: " + playlistName);
        }
    }

    public void removeSongFromPlaylist(String playlistName, String songTitle) {
        if (playlists.containsKey(playlistName)) {
            List<Song> playlist = playlists.get(playlistName);
            playlist.removeIf(song -> song.getTitle().equalsIgnoreCase(songTitle));
            System.out.println("Song removed from the playlist: " + playlistName);
        } else {
            System.out.println("Playlist not found: " + playlistName);
        }
    }
}