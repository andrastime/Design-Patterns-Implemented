package abstraction_occurence;

import java.util.Calendar;

public class Driver {

    public static void main(String[] args) {
        String desc = "Software Engineering introduces students to the overwhelmingly important subject of " +
                "software programming and development. In the past few years, computer systems have come to dominate" +
                " not just our technological growth, but the foundations of our world’s major industries. This text " +
                "seeks to lay out the fundamental concepts of this huge and continually growing subject area in a clear " +
                "and comprehensive manner.";

        Book SE_Book = new Book("Software Engineering", "0133943038", "978-1292096131",
                "Ian Sommerville", 10,"En", "Pearson", Calendar.getInstance(), desc);

        for (int i = 0; i < 20000; i++)
            SE_Book.addCopy(new BookCopy(SE_Book, Integer.toString(i)));

        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        System.out.println(runtime.totalMemory()/1048576L);
        System.out.println((runtime.totalMemory() - runtime.freeMemory())/1048576L);
    }
}

//String title, String isbn, String isbn13, String author, int edition, String language, String publisher, Calendar publicationDate, String description, String id