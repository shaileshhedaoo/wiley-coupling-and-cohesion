package Controller;

import Entity.Book;
import Service.Inventory;
import Service.ShoppingCart;

public class Bookstore {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        ShoppingCart shoppingCart=new ShoppingCart();
        // Add books to inventory
        Book book1 = new Book("Java Programming", "John Smith", 29.99);
        Book book2 = new Book("Python Basics", "Jane Doe", 19.99);
        inventory.addBook(book1);
        inventory.addBook(book2);

        // Add books to shopping cart
        shoppingCart.addItem(book1);
        shoppingCart.addItem(book2);

        // Display inventory and total price of items in shopping cart
        System.out.println("Inventory:");
        inventory.displayInventory();
        System.out.println("\nShopping Cart:");
        shoppingCart.displayItems();
    }
}
