package player_role;

import java.util.ArrayList;
import java.util.List;

public class Gold extends SubscriptionRole{

    private ArrayList<User> friends;
    private List<Song> downloadedSongs;
    public Gold() {
        super(1000);
        downloadedSongs = new ArrayList<>();
    }

    public void addFriend(User u){
        if (friends == null)
        {
            friends = new ArrayList<>();
        }
        friends.add(u);
    }

    public void downloadSong(Song s){
        downloadedSongs.add(s);
        System.out.println("Downloading ".concat(s.name).concat("... "));
    }

    public ArrayList<User> getFriends(){
        return friends;
    }

    public List<Song> getDownloadedSongs(){
        return downloadedSongs;
    }

    public SubscriptionType getSubscriptionType(){
        return SubscriptionType.GOLD;
    }
}
