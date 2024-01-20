package player_role;

public class Driver {

    public static void main(String[] args) {
        User mb = new User("Mustafa", "Bozkurt", "0001", new Gold());
        User mustafaObj = mb;
        User at = new User("Alan", "Turing", "0002", new Gold());
        User bl = new User("Barbara", "Liskov", "0003", new Gold());

        Song s1 = new Song("Changes");
        Song s2 = new Song("All Eyez On Me");
        Song s3 = new Song("Dear Mama");

        PlayList pl1 = new PlayList();
        pl1.addSong(s1);
        pl1.addSong(s2);
        PlayList pl2 = new PlayList();
        pl2.addSong(s1);
        pl2.addSong(s3);

        mb.getRole().addFriend(at);
        mb.getRole().addFriend(bl);

        mb.addPlayList(pl1);
        mb.addPlayList(pl2);

        mb.getRole().downloadSong(s1);
        mb.getRole().downloadSong(s2);

        System.out.println(mb.getRole().getFriends());
        mb.changeSubscriptionType(new Silver());
        System.out.println(mb.getRole().getFriends());
        //Silver mb2 = new Silver(mb); //I have to create a new object
        //mustafaObj = mb2;
        Runtime.getRuntime().gc(); //delete mb and my gold data is lost

    }
}
