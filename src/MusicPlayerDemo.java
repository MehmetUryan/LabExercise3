/**
 * MusicPlayerDemo.java
 *
 * Tests the playlist
 *
 * Your Name:        Mehmet Uryan
 * Your Student ID:  240446021
 * Your Date:        20.10.2026
 */
public class MusicPlayerDemo {

    public static void main(String[] args) {

        //create the playlist object
        MusicPlaylist playlist = new MusicPlaylist();

        // Add songs
        playlist.addSong("Shape of You - Ed Sheeran");
        playlist.addSong("Save Me - BTS");
        playlist.addSong("Snap - Manifest");
        playlist.addSong("like JENNIE - JENNIE");

        System.out.println("=== PLAYLIST ===");
        playlist.displayPlaylist();

        System.out.println("\n=== CURRENT SONG PLAYING ===");
        playlist.displayCurrentSong();

        System.out.println("\n=== NEXT SONG TO PLAY ===");
        playlist.nextSong();

        System.out.println("\n=== NEXT SONG TO PLAY ===");
        playlist.nextSong();

        System.out.println("\n=== PREVIOUS SONG TO PLAY ===");
        playlist.previousSong();

        System.out.println("\n=== AFTER REMOVING Shape of You SONG ===");
        playlist.removeSong("Shape of You - Ed Sheeran");
        playlist.displayPlaylist();

        System.out.println("\n=== AFTER REMOVING Snap SONG ===");
        // remove the song called "Snap - Manifest" from the playlist 
        //Then display the Playlist
        playlist.removeSong("Snap - Manifest");
        playlist.displayPlaylist();

    }
}