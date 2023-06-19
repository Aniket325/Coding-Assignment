package assement;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class RecentlyPlayedStore {
	private final int capacity;
    private final Map<String, LinkedList<String>> userSongs;

    public RecentlyPlayedStore(int capacity) {
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

    public List<String> getRecentlyPlayedSongs(String user) {
        return userSongs.getOrDefault(user, new LinkedList<>());
    }
}
