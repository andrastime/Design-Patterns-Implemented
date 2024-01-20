package factory.obj;

import factory.persistence.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.Objects;

//DON'T MODIFY THE XML TAGS!! 
@XmlRootElement(name = "Magazine")
@XmlAccessorType(XmlAccessType.FIELD)
public class Magazine implements Item {

    @XmlElement(name = "Title")
    private String title;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
    @XmlElement(name = "Issue")
    private int issue;

    public void setIssue(int issue) {
        this.issue = issue;
    }

    public int getIssue() {
        return this.issue;
    }
    @XmlElement(name = "Year")
    private String year;

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return this.year;
    }
    @XmlElement(name = "ISSN")
    private String issn;

    public void setISSN(String issn) {
        this.issn = issn;
    }

    public String getISSN() {
        return this.issn;
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

    @Override //good practice to implement hashcode whenever you implement equals
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.issn);
        return hash;
    }

    @Override
    public boolean equals(Object magazine) {
        //assuming magazines with same ISBN are the same book
        if (magazine instanceof Magazine) {
            return ((Magazine) magazine).issn.contentEquals(this.issn);
        }
        return false;
    } //DON'T MODIFY THE XML TAGS!! 

    private void copyMagazine(Magazine magazine) { //needed for CSV type
        this.cost = magazine.cost;
        this.issn = magazine.issn;
        this.issue = magazine.issue;
        this.publisher = magazine.publisher;
        this.title = magazine.title;
        this.year = magazine.year;
    }

    @Override
    public void save(String fileName, FileType type) {
        //Using a handler factory we made this code closed
        //compared to writing a specific save method for each file type (saveCSV, saveXML, saveJSON)
        //we just need to provide the type we want to save as and create a handler using the factory
        //this makes adding new file types for saving or reading without modifiying this class (the code is closed)
        FormatHandler fh = HandlerFactory.createHandler(type);
        fh.saveMagazine(fileName, this);
    }

    @Override
    public void read(String fileName, FileType type) {
        //Using a handler factory we made this code closed
        //compared to reading a specific read method for each file type (readCSV, readXML, readJSON)
        //we just need to provide the type we want to read as and create a handler using the factory
        //this makes adding new file types for saving or reading without modifiying this class (the code is closed)
        FormatHandler fh = HandlerFactory.createHandler(type);
        copyMagazine(fh.readMagazine(fileName));
    }
}
