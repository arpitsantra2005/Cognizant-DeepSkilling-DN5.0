package exercise_6;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementApp {
    public static void main(String[] args) {

        List<Book> bookList = new ArrayList<>();

        bookList.add(new Book(101, "Lord of the Flies", "William Golding"));
        bookList.add(new Book(102, "The Client", "John Grisham"));
        bookList.add(new Book(103, "The Subtle Knife", "Philip Pullman"));

        LibraryManager libraryManager = new LibraryManager(bookList);

        Book foundBook = libraryManager.linearSearchByTitle("The Client");

        if (foundBook != null) {
            System.out.println("Linear Search Found: " + foundBook.getTitle() + " by " + foundBook.getAuthor());
        } else {
            System.out.println("Book not found.");
        }

        libraryManager.sortBooksByTitle();

        foundBook = libraryManager.binarySearchByTitle("The Subtle Knife");

        if (foundBook != null) {
            System.out.println("Binary Search Found: " + foundBook.getTitle() + " by " + foundBook.getAuthor());
        } else {
            System.out.println("Book not found.");
        }
    }
}