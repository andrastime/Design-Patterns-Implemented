package factory.persistence;

import factory.obj.Book;
import factory.obj.Magazine;
/**
 * The interface that provides Open/Close principle 
 * makes it easier to add new handlers to read and save (open for extension)
 */
public interface FormatHandler { 
    public Book readBook(String fileName);
    public void saveBook(String fileName, Book book);
    public Magazine readMagazine(String fileName);
    public void saveMagazine(String fileName, Magazine magazine);
    
}
