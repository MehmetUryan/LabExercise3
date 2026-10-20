/**
 * Represents the doubly linked list for the music playlist.
 *
 * Your Name:        Mehmet Uryan
 * Your Student ID:  240446021
 * Your Date:        20.10.2026
 */

public class MusicPlaylist {

    //create private instants of the doubly linked list: 
    // -  head, tail and current
    private SongNode head;
    private SongNode tail;
    private SongNode current;

    // constructor: The head,tail and current should be initialized to null in the beginning
    public MusicPlaylist() {
        this.head = null;
        this.tail = null;
        this.current = null;
    }

    // Add a song to the end of the playlist
    public void addSong(String title) {
        SongNode newNode = new SongNode(title);

        if (head == null) {
            head = newNode;
            tail = newNode;
            current = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }


    // Remove a song from the playlist
    public void removeSong(String title) {
        SongNode temp = head;

        while (temp != null && !temp.title.equals(title)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("The song isn't in the playlist");
            return;
        }

        if (temp.prev != null) {
            temp.prev.next = temp.next;
        } else {
            head = temp.next;
        }

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        } else {
            tail = temp.prev;
        }

        if (temp == current) {
            if (current.next != null) {
                current = current.next;
            } else {
                current = current.prev;
            }
        }

        System.out.println("Removed: " + title);
    }


    // Move to the next song
    public void nextSong() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Playing: " + current.title);
        } else {
            System.out.println("Already at the last song of the playlist.");
        }
    }


    // Move to the previous song
    public void previousSong() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Playing: " + current.title);
        } else {
            System.out.println("Already at the first song of the playlist.");
        }
    }


    // Display the current song
    public void displayCurrentSong() {
        if (current != null) {
            System.out.println("Current Song: " + current.title);
        }
    }


    // Display all songs
    public void displayPlaylist() {
        SongNode temp = head;
        while (temp != null) {
            System.out.print(temp.title + " <-> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}