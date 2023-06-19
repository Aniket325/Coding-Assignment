package assement;

import java.util.Arrays;
import java.util.List;

public class main {
	
	public static void main(String[] args) {
		RecentlyPlayedStore store = new RecentlyPlayedStore(3);

        store.addSong("User1", "S1");
        store.addSong("User1", "S2");
        store.addSong("User1", "S3");

        store.addSong("User2", "S4");
        store.addSong("User2", "S5");
        store.addSong("User2", "S6");

        System.out.println(store.getRecentlyPlayedSongs("User1")); // Output: [S1, S2, S3]
        System.out.println(store.getRecentlyPlayedSongs("User2")); // Output: [S4, S5, S6]
        RecentlyPlayedStore store1 = new RecentlyPlayedStore(3);

        store.addSong("User1", "S7");
        store.addSong("User1", "S8");
        store.addSong("User1", "S9");

        store.addSong("User2", "S10");
        store.addSong("User2", "S11");
        store.addSong("User2", "S12");

        
        List<String> user1Songs = store.getRecentlyPlayedSongs("User1");
        assert user1Songs.equals(Arrays.asList("S1", "S2", "S3")) : "Incorrect songs for User1";

        List<String> user2Songs = store.getRecentlyPlayedSongs("User2");
        assert user2Songs.equals(Arrays.asList("S4", "S5", "S6")) : "Incorrect songs for User2";

        store.addSong("User1", "S2");

        user1Songs = store.getRecentlyPlayedSongs("User1");
        assert user1Songs.equals(Arrays.asList("S1", "S3", "S2")) : "Incorrect songs for User1";

        System.out.println("Assertions passed successfully.");
    }

}
