package factory.obj;

import factory.persistence.FileType;

//Item interface for Open/Close principle makes it easier to add new items (open for extension)
public interface Item { 
    //Each item will have save and read within the class
    public void save(String fileName, FileType type); 
    public void read(String fileName, FileType type);
    public String getTitle();
    public Cost getCost();
    public String getPublisher();
    public String getYear();
}
