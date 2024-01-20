package abstraction_occurence;

import java.util.ArrayList;
import java.util.Calendar;

public class Book {
    private String title, isbn, isbn13, author, id, language, publisher, description;
    private
    int edition;
    Calendar publicationDate;
    public ArrayList<BookCopy> BookCopies;


    public Book(String title, String isbn, String isbn13, String author, int edition, String language, String publisher, Calendar publicationDate, String description ) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isbn13 = isbn13;
        this.language = language;
        this.publisher = publisher;
        this.description = description;
        this.edition = edition;
        this.publicationDate = publicationDate;
    }
    public void addCopy(BookCopy bc){
        if (this.BookCopies == null)
        {
            this.BookCopies = new ArrayList<>();
        }

        this.BookCopies.add(bc);
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }
}

