package player_role;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
    private List<Song> songs;

    public PlayList(){
        songs = new ArrayList<>();
    }
    public Song getSong(int idx){return songs.get(idx);}
    public void addSong(Song s){
        songs.add(s);
    }
}
