class Song {
    private final String title; // Create a private field named title of type String
    private final String artist; // Create a private field named artist of type String
    private final String genre; // Create a private field named genre of type String
    private final String mood; // Create a private field named mood of type String

    public Song(String title, String artist, String genre, String mood) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.mood = mood;
    }

    // Create a getter method for the title field
    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Artist: " + artist + ", Genre: " + genre + ", Mood: " + mood;
    }
}