package hust.soict.hedspi.aims.book;

import java.util.ArrayList;
import java.util.List;

import hust.soict.hedspi.aims.media.Media;

// Represents a book media item with multiple authors
public class Book extends Media {
    private List<String> bookAuthors = new ArrayList<>();

    public Book(int identifier, String bookTitle, String genre, float price, List<String> authors) {
        super(identifier, bookTitle, genre, price);
        this.bookAuthors = new ArrayList<>(authors);
    }

    // Adds a new author if not already present
    public void includeAuthor(String authorName) {
        if (!bookAuthors.contains(authorName)) {
            bookAuthors.add(authorName);
            System.out.println("Author added successfully.");
        } else {
            System.out.println("Author already exists!");
        }
    }

    // Removes an author if present
    public void excludeAuthor(String authorName) {
        if (bookAuthors.remove(authorName)) {
            System.out.println("Author removed successfully.");
        } else {
            System.out.println("Author not found!");
        }
    }

    @Override
    public String toString() {
        return String.format("Book [ID: %d, Title: %s, Genre: %s, Authors: %s, Price: $%.2f]",
                getId(), getTitle(), getCategory(), String.join(", ", bookAuthors), getCost());
    }
}