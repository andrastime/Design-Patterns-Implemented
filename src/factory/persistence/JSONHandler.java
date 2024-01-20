package factory.persistence;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import factory.obj.Book;
import factory.obj.Magazine;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JSONHandler implements FormatHandler{  
       
    @Override
    public Book readBook(String fileName) {  
        Book book = new Book();
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            book = mapper.readValue(new File(fileName), Book.class);
        } catch (IOException ex) {
            Logger.getLogger(JSONHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return book;
    }

    @Override
    public void saveBook(String fileName, Book book) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            mapper.writeValue(new File(fileName), book);
        } catch (IOException ex) {
            Logger.getLogger(JSONHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Magazine readMagazine(String fileName) {  
        Magazine magazine = new Magazine();
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            magazine = mapper.readValue(new File(fileName), Magazine.class);
        } catch (IOException ex) {
            Logger.getLogger(JSONHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return magazine;
    }

    @Override
    public void saveMagazine(String fileName, Magazine magazine) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            mapper.writeValue(new File(fileName), magazine);
        } catch (IOException ex) {
            Logger.getLogger(JSONHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
