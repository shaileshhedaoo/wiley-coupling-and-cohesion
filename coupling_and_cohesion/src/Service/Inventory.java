package Service;

import Entity.Book;

import java.util.*;
public class Inventory {
    private List<Book> books;
    public Inventory() {
        this.books = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void removeBook(Book book) {
        books.remove(book);
    }
    public void displayInventory() {
        if (books.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("Inventory:");
            for (Book book : books) {
                System.out.println(book.getTitle() + " by " + book.getAuthor() + " - Price: $" + book.getPrice());
            }
        }
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null; // Book not found
    }
    public List<Book> findBooksByAuthor(String author)
    {
        List<Book> booksByAuthor = new ArrayList<>();
        for (Book book : books)
        {
            if (book.getAuthor().equals(author))
            {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }

    public List<Book> findBooksByPriceRange(double minPrice, double maxPrice) {
        List<Book> booksInPriceRange = new ArrayList<>();
        for (Book book : books) {
            if (book.getPrice() >= minPrice && book.getPrice() <= maxPrice) {
                booksInPriceRange.add(book);
            }
        }
        return booksInPriceRange;
    }
}
