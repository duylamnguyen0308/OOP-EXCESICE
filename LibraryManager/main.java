package LibraryManager;

public class main {
    public static void main(String[] args) {
        library library = new library();

        book book1 = new book("lam di", "vu trong phung", 3);
        book book2 = new book("truyen kieu", "Nguyen Du", 5);
        book book3 = new book("Dat nuoc", "kim lan", 7);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        Member member1 = new Member("Quang");
        Member member2 = new Member("Tai");

        library.loanBook(book1);
        library.loanBook(book1);

        member1.brroweBook(book1);
        member2.brroweBook(book2);
        member2.returnBook(book3);

        member1.returnBook(book1);
        library.returnBook(book1);

        System.out.println("\nBook in the library after returning book: ");
        for (book book : library.getBooks()) {
            System.out.println(book.getTenSach() + " by " + book.getTacGia() + "(Quanlity: " + book.getSoLuong() + ")");
        }
    }
}
