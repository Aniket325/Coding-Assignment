package assement;

public class Test {
	public static void main(String[] args) {
        RecentlyPlayedsongs store = new RecentlyPlayedsongs(3);

        store.addSong("User1", "S1");
        store.addSong("User1", "S2");
        store.addSong("User1", "S3");
        System.out.println(store.getRecentlyPlayedSongs("User1")); // Output: [S1, S2, S3]

        store.addSong("User1", "S4");
        System.out.println(store.getRecentlyPlayedSongs("User1")); // Output: [S2, S3, S4]

        store.addSong("User1", "S2");
        System.out.println(store.getRecentlyPlayedSongs("User1")); // Output: [S3, S4, S2]

        store.addSong("User1", "S1");
        System.out.println(store.getRecentlyPlayedSongs("User1")); // Output: [S4, S2, S1]
    }
}

