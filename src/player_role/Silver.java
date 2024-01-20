package player_role;

import java.util.ArrayList;

public class Silver extends SubscriptionRole{

    private ArrayList<User> friends;
    public Silver() {
        super(100);
        friends = new ArrayList<>();
    }

    public void addFriend(User u){
        if (friends == null)
        {
            friends = new ArrayList<>();
        }
        friends.add(u);
    }

    public ArrayList<User> getFriends(){
        return friends;
    }

    public SubscriptionType getSubscriptionType(){
        return SubscriptionType.SILVER;
    }
}
