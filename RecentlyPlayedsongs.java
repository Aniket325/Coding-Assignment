package assement;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
public class RecentlyPlayedsongs {
	
	private final int capacity;
    private final Map<String, LinkedList<String>> userSongs;

    public RecentlyPlayedsongs(int capacity) {
        this.capacity = capacity;
        this.userSongs = new HashMap<>();
    }

    public void addSong(String user, String song) {
        LinkedList<String> songs = userSongs.getOrDefault(user, new LinkedList<>());

        if (songs.size() >= capacity) {
            songs.removeFirst();
        }

        songs.addLast(song);
        userSongs.put(user, songs);
    }

    public LinkedList<String> getRecentlyPlayedSongs(String user) {
        return userSongs.getOrDefault(user, new LinkedList<>());
    }

}
