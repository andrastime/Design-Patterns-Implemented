package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Building implements Iterable<Office> {
    List<Office> offices;
    String name;

    public Building(String name){
        offices = new ArrayList<>();
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public List<Office> getOffices(){
        return offices;
    }

    public void addOffice(Office o){
        offices.add(o);
    }

    public Iterator<Office> iterator(){
        return offices.iterator();
    }
}
