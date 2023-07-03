package LibraryManager;

import java.util.ArrayList;
import java.util.List;

public class library {
    private List<book> books = new ArrayList<book>();

    public void addBook(book book) {
        books.add(book);
    }

    public void removeBook(book book) {
        books.remove(book);
    }

    public List<book> getBooks() {
        return books;
    }

    public void loanBook(book book) {
        int quanlity = book.getSoLuong();
        if (quanlity > 0) {
            book.setSoLuong(quanlity - 1);
        } else {
            System.out.println("the book is not available for loan.");
        }
    }

    public void returnBook(book book) {
        int quanlity = book.getSoLuong();
        book.setSoLuong(quanlity + 1);
    }
}