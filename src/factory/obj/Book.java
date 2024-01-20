package factory.obj;

import factory.persistence.*;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.Objects;

//DON'T MODIFY THE XML TAGS!!
@XmlRootElement(name = "Book")
@XmlAccessorType(XmlAccessType.FIELD)
public class Book implements Item {

    @XmlElement(name = "Title")
    private String title;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
    @XmlElement(name = "Author")
    private String author;

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }
    @XmlElement(name = "Year")
    private String year;

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return this.year;
    }
    @XmlElement(name = "ISBN")
    private String isbn;

    public void setISBN(String isbn) {
        this.isbn = isbn;
    }

    public String getISBN() {
        return this.isbn;
    }
    @XmlElement(name = "Publisher")
    private String publisher;

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return this.publisher;
    }
    @XmlElement(name = "Cost")
    private Cost cost;

    public void setCost(Cost cost) {
        this.cost = cost;
    }

    public Cost getCost() {
        return this.cost;
    }

    @Override
    public int hashCode() {//good practice to implement hashcode whenever you implement equals
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.isbn);
        return hash;
    }

    @Override
    public boolean equals(Object book) {
        //assuming books with same ISBN are the same book
        if (book instanceof Book) {
            return ((Book) book).isbn.contentEquals(this.isbn);
        }
        return false;
    } //DON'T MODIFY THE XML TAGS!! 

    private void copyBook(Book book) { //needed for CSV type
        this.author = book.author;
        this.cost = book.cost;
        this.isbn = book.isbn;
        this.publisher = book.publisher;
        this.title = book.title;
        this.year = book.year;
    }

    @Override
    public void save(String fileName, FileType type) {
        //Using a handler factory we made this method closed
        //compared to writing a specific save method for each file type (saveCSV, saveXML, saveJSON)
        //we just need to provide the type we want to save as and create a handler using the factory
        //this makes adding new file types for saving or reading without modifying this class (the code is closed)
        FormatHandler fh = HandlerFactory.createHandler(type);

        fh.saveBook(fileName, this);
    }

    @Override
    public void read(String fileName, FileType type) {
        //Using a handler factory we made this method closed
        //compared to reading a specific read method for each file type (readCSV, readXML, readJSON)
        //we just need to provide the type we want to read as and create a handler using the factory
        //this makes adding new file types for saving or reading without modifying this class (the code is closed)
        FormatHandler fh = HandlerFactory.createHandler(type);
        copyBook(fh.readBook(fileName));
    }

}
