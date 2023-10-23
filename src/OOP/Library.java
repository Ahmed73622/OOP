package OOP;

import java.util.List;
import java.util.Map;

public class Library {
    public int    libraryId;
    public int    totalBooks;
    public String librarianName;
    public String bookSection;

    private List<Book> __books;

    public Map<String, String> LibraryDetails()
    {

    }
    public Book SearchBooks(Book book)
    {
        return __books.stream().filter((b) -> b.equals(book)).findFirst().get();
    }

    public void LendBooks(Book book)
    {
        Book b;
        if((b = SearchBooks(book)) != null)
        {
            b.lend();
        }
    }
    public void ReturnBooks(Book book)
    {
        Book b;
        if((b = SearchBooks(book)) != null && b.isLend())
        {
            b.returning();
        }
    }
    public Map<String, String> PayFine()
    {

    }
}
