package iterator;

import java.util.Iterator;

public class Driver {

    public static void main(String[] args) {

    Building b = new Building("Peter Landin");
    b.addOffice(new Office(105));
    b.addOffice(new Office(106));
    b.addOffice(new Office(107));
    b.addOffice(new Office(205));
    b.addOffice(new Office(206));
    b.addOffice(new Office(207));

    Iterator itr = b.iterator();

    while (itr.hasNext()){
        Office o = (Office) itr.next();
        System.out.println(o.getOfficeNo());
        if(o.getOfficeNo() == 206)
            System.out.println("There is an office 206 in "+b.getName()+" building on floor "+o.getOfficeFloor());
    }

}
}
