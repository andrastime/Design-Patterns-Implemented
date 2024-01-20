package abstraction_occurence;

public class BookCopy {
    public Book book;
    public String id;

    public BookCopy(Book book, String id){
        this.book = book;
        this.id = id;
    }

    public Book getBook(){
        return this.book;
    }
    public String getID(){
        return this.id;
    }
}
