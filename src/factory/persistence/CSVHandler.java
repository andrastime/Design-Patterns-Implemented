package factory.persistence;

import factory.obj.Book;
import factory.obj.Magazine;
import factory.obj.Cost;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CSVHandler implements FormatHandler {

    @Override
    public Book readBook(String fileName) {
        Book book = new Book();
        try {
            List<String> lines = Files.readAllLines(Paths.get(fileName));
            ListIterator<String> it = lines.listIterator(1);
            String[] input = it.next().split(",");
            book.setAuthor(input[0]);
            book.setTitle(input[1]);
            book.setISBN(input[2]);
            book.setYear(input[3]);
            book.setPublisher(input[4]);
            Cost c = new Cost();
            c.setCurrency(input[5]);
            c.setCostValue(Float.parseFloat(input[6]));
            book.setCost(c);
        } catch (IOException ex) {
            Logger.getLogger(CSVHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return book;
    }

    @Override
    public void saveBook(String fileName, Book book) {
        try {
            List<String> lines = new ArrayList<>();
            lines.add(String.join(",", "Author", "Title", "ISBN", "Year", "Publisher", "Currency", "Cost"));
            lines.add(String.join(",", book.getAuthor(), book.getTitle(), book.getISBN(), book.getYear(), book.getPublisher(),
                    book.getCost().getCurrency(), String.valueOf(book.getCost().getCostValue())));
            Files.write(Paths.get(fileName), lines);
        } catch (IOException ex) {
            Logger.getLogger(CSVHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Magazine readMagazine(String fileName) {
        Magazine magazine = new Magazine();
        try {
            List<String> lines = Files.readAllLines(Paths.get(fileName));
            ListIterator<String> it = lines.listIterator(1);
            String[] input = it.next().split(",");
            magazine.setTitle(input[0]);
            magazine.setIssue(Integer.parseInt(input[1]));
            magazine.setYear(input[2]);
            magazine.setISSN(input[3]);
            magazine.setPublisher(input[4]);
            Cost c = new Cost();
            c.setCurrency(input[5]);
            c.setCostValue(Float.parseFloat(input[6]));
        } catch (IOException ex) {
            Logger.getLogger(CSVHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return magazine;
    }

    @Override
    public void saveMagazine(String fileName, Magazine magazine) {
        try {
            List<String> lines = new ArrayList<String>();
            lines.add(String.join(",", "Title", "Issue", "Year", "ISSN", "Publisher", "Currency", "Cost"));
            lines.add(String.join(",", magazine.getTitle(), String.valueOf(magazine.getIssue()), magazine.getYear(), magazine.getISSN(),
                    magazine.getPublisher(), magazine.getCost().getCurrency(), String.valueOf(magazine.getCost().getCostValue())));
            Files.write(Paths.get(fileName), lines);
        } catch (IOException ex) {
            Logger.getLogger(CSVHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
