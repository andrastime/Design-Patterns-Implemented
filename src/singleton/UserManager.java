package singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserManager {

    List<User> onlineUsers;
    private static UserManager instance;

    private UserManager(){
        onlineUsers = new ArrayList<>();
    }

    public static UserManager getInstance(){
        if (instance == null)
        {
            instance = new UserManager();
        }

        return instance;
    }

    public void addUser(User u){
        onlineUsers.add(u);
    }

    public Optional<User> getUser(String uID){
        Optional<User> result = Optional.empty(); //used Optional instead of returning NULL
        for(User u : onlineUsers) {
            if (u.getUserID().equals(uID))
                result = Optional.ofNullable(u);
        }
        return result; //if no result is found it returns empty object (optional) otherwise returns user
    }
}
