package singleton;

public class User {
    private String userID;

    public User(String uID) {userID = uID;}

    public String getUserID() {return userID;}

    public boolean equals(Object o) {
        User temp;
        if (o != null)
            if (o instanceof User) {
                temp = (User) o;
                if (temp.getUserID().contentEquals(userID))
                    return true;
            }
        return false;
    }
}
