package Controller;

import Entity.Book;
import Service.Inventory;
import Service.InventoryInterface;
import Service.ShoppingCart;
import Service.ShoppingCartInterface;

public class Bookstore {
    public static void main(String[] args) {
        InventoryInterface inventory = new Inventory();
        ShoppingCartInterface shoppingCart = new ShoppingCart();

        Book book1 = new Book("Java Programming", "John Smith", 29.99);
        Book book2 = new Book("Python Basics", "Jane Doe", 19.99);
        inventory.addBook(book1);
        inventory.addBook(book2);


        shoppingCart.addItem(book1);
        shoppingCart.addItem(book2);

        System.out.println("Inventory:");
        inventory.displayInventory();
        System.out.println("\nShopping Cart:");
        shoppingCart.displayItems();
    }
}
