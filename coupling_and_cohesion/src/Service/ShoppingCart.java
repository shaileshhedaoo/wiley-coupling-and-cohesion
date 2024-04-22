package Service;
import Entity.Book;
import java.util.ArrayList;
import java.util.List;
public class ShoppingCart implements ShoppingCartInterface{
    private List<Book> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    @Override
    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Book item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    @Override
    public void addItem(Book book) {
        items.add(book);
    }
    @Override
    public void removeItem(Book book) {
        items.remove(book);
    }
    @Override
    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("Shopping cart is empty.");
        } else {
            System.out.println("Shopping cart items:");
            for (Book item : items) {
                System.out.println(item.getTitle() + " by " + item.getAuthor() + " - Price: $" + item.getPrice());
            }
            System.out.println("Total Price: $" + calculateTotalPrice());
        }
    }
}

