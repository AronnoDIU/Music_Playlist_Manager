public class MusicPlaylistApp {
    public static void main(String[] args) {
        PlaylistManager playlistManager = new PlaylistManager();
        playlistManager.addSongToPlaylist("My Playlist", new Song("Song 1", "Artist 1", "Genre 1", "Mood 1"));
        playlistManager.addSongToPlaylist("My Playlist", new Song("Song 2", "Artist 2", "Genre 2", "Mood 2"));
        playlistManager.addSongToPlaylist("My Playlist", new Song("Song 3", "Artist 3", "Genre 3", "Mood 3"));
        playlistManager.viewPlaylist("My Playlist");
        playlistManager.removeSongFromPlaylist("My Playlist", "Song 2");
        playlistManager.viewPlaylist("My Playlist");
    }
}
