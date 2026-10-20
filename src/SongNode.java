/**
 * SongNode.java
 *
 * Represents a song of a playlist.
 *
 * Your Name:        Mehmet Uryan
 * Your Student ID:  240446021
 * Your Date:        20.10.2026
 */

public class SongNode {

    String title;

    SongNode prev;
    SongNode next;

    public SongNode(String title) {
        this.title = title;
        this.prev = null;
        this.next = null;
    }
}