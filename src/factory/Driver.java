package factory;

import factory.obj.Book;
import factory.obj.Item;
import factory.obj.Magazine;
import factory.persistence.FileType;
import java.util.ArrayList;

public class Driver {
    //Closed for change, you can add as many file and item types without modifying this code
    public void read(Item item, String fileName, FileType type) {
        item.read(fileName, type);
    }

    //Closed for change, you can add as many file and item types without modifying this code
    public void save(Item item, String fileName, FileType type) {
        item.save(fileName, type);
    }

    public static void main(String[] args) {
        String[] files = {"book.xml", "magazine.xml"};
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Book());
        items.add(new Magazine());

        for (int i = 0; i < items.size(); i++) {
            items.get(i).read(files[i], FileType.XML);
        }

        System.out.println(items.get(0).getTitle());
        System.out.println(items.get(0).getCost().getCostValue()+ " "+ items.get(0).getCost().getCurrency());
        System.out.println(items.get(0).getYear());
    }
}
