package singleton;

public class Driver {

    public static void main(String[] args){
        UserManager um1 = UserManager.getInstance();
        UserManager um2 = UserManager.getInstance(); //created by mistake

        um1.addUser(new User("001"));
        um1.addUser(new User("002"));
        um1.addUser(new User("003"));
        um2.addUser(new User("004"));
        um1.addUser(new User("005"));

        String[] arr = {"001","002","003","004","005"};

        for(String id : arr)
            um1.getUser(id).ifPresentOrElse(value->System.out.println("User with ID#".concat(value.getUserID()).concat(" is found.")),
                ()->System.out.println("User with the given user ID(".concat(id).concat(") doesn't exist!")));
    }
}
