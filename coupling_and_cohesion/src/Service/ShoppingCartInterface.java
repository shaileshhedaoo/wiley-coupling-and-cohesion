package Service;

import Entity.Book;
import java.util.List;

public interface ShoppingCartInterface {
    double calculateTotalPrice();
    void addItem(Book book);
    void removeItem(Book book);
    void displayItems();
}
