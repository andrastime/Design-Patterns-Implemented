package player_role;

import java.util.ArrayList;

public class User {
    String first, last, userID;
    SubscriptionRole subscription;
    SubscriptionType subType;
    private ArrayList<PlayList> playLists;

    public User(String first, String last, String userID, SubscriptionRole subscriptionRole){
        this.first = first;
        this.last = last;
        this.userID = userID;
        this.subscription = subscriptionRole;
        this.subType = subscriptionRole.getSubscriptionType();
        this.playLists = new ArrayList<>(subscription.plSize);
    }

    public ArrayList<PlayList> getPlayLists(){
        return subscription.playLists;
    }

    public void addPlayList(PlayList pl){
        if(playLists.size() < subscription.plSize)
            playLists.add(pl);
    }

    public void changeSubscriptionType(SubscriptionRole newRole)
    {
        if (!(this.getSubscriptionType().equals(SubscriptionType.FREE)) && (newRole.getSubscriptionType().equals(SubscriptionType.SILVER) || newRole.getSubscriptionType().equals(SubscriptionType.GOLD))) {
            for (User ur : this.subscription.getFriends())
                newRole.addFriend(ur);
        }
        this.subType = newRole.getSubscriptionType();;
        this.subscription = newRole;
    }

    public SubscriptionType getSubscriptionType(){
        return this.subType;
    }

    public SubscriptionRole getRole()
    {
        return this.subscription;
    }

    public String getUser(){
        return first.concat(" ").concat(last);
    }
}
