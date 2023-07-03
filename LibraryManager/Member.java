package LibraryManager;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private List<book> brrowedBook = new ArrayList<book>();
    public Member(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public List<book> getbrrowedBook(){
        return brrowedBook;
    }
    public void brroweBook(book book){
        brrowedBook.add(book);
    }
    public void returnBook(book book){
        brrowedBook.remove(book);
    }
}
