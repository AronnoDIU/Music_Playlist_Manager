class Song {
    private final String title;
    private final String artist;
    private final String genre;
    private final String mood;

    public Song(String title, String artist, String genre, String mood) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.mood = mood;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Artist: " + artist + ", Genre: " + genre + ", Mood: " + mood;
    }
}