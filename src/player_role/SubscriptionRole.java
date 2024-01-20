package player_role;

import java.util.ArrayList;

public abstract class SubscriptionRole {
    int plSize;
    ArrayList<PlayList> playLists;
    User user;

    private ArrayList<User> friends;
    public SubscriptionRole(int plSize) {
        this.plSize = plSize;
        playLists = new ArrayList<>(plSize);
    }

    public int getPlSize() {
        return plSize;
    }

    public SubscriptionType getSubscriptionType(){
        return null;
    }

    public ArrayList<User> getFriends(){
        return null;
    }

    public void addFriend(User ur){
        return;
    }

    public void downloadSong(Song s)
    {
        return;
    }
}
