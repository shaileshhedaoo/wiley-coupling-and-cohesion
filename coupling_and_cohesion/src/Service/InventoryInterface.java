package Service;
import Entity.Book;
import java.util.List;
public interface InventoryInterface {
    void addBook(Book book);
    void removeBook(Book book);
    void displayInventory();
    Book findBookByTitle(String title);
    List<Book> findBooksByAuthor(String author);
    List<Book> findBooksByPriceRange(double minPrice, double maxPrice);
}

