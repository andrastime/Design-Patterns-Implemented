package factory.persistence;

import factory.obj.Book;
import factory.obj.Magazine;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

public class XMLHandler implements FormatHandler {

    @Override
    public Book readBook(String fileName) {
        Book book = new Book();
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Book.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            book = (Book) jaxbUnmarshaller.unmarshal(new File(fileName));
        } catch (JAXBException ex) {
            Logger.getLogger(XMLHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return book;
    }

    @Override
    public void saveBook(String fileName, Book book) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Book.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(book, new File(fileName));
            //jaxbMarshaller.marshal(book, System.out);
        } catch (JAXBException ex) {
            Logger.getLogger(XMLHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Magazine readMagazine(String fileName) {
        Magazine magazine = new Magazine();
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Magazine.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            magazine = (Magazine) jaxbUnmarshaller.unmarshal(new File(fileName));
        } catch (JAXBException ex) {
            Logger.getLogger(XMLHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return magazine;
    }

    @Override
    public void saveMagazine(String fileName, Magazine magazine) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Magazine.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(magazine, new File(fileName));
        } catch (JAXBException ex) {
            Logger.getLogger(XMLHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
