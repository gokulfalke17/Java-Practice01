package company.programming.test;

import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private String isbn;


    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }


    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn + "]";
    }
}

class Library {
    private List<Book> books;


    public Library() {
        this.books = new ArrayList<>();
    }


    public void addBook(Book book) {
        books.add(book);
    }


    public List<Book> searchByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                result.add(book);
            }
        }
        if (result.isEmpty()) {
            System.out.println("Book Not Found By Given Title....");
        }
        return result; 
    }


    public List<Book> searchByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                result.add(book);
            }
        }
        if (result.isEmpty()) {
            System.out.println("Book Not Found By Given Author...");
        }
        return result; 
    }


    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("The library is empty.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Library library = new Library();


        library.addBook(new Book("java programming", "HK", "3938000"));
        library.addBook(new Book("spring framework", "nataraj", "1091138211"));
        library.addBook(new Book("node JS", "karan", "0938982"));
        library.addBook(new Book("python", "stv", "33333333"));
        library.addBook(new Book("c programming", "pqr", "4484748739"));


        System.out.println();
        library.displayBooks();
        System.out.println();


        System.out.println("Searching for books with title 'python' :: ");
        List<Book> booksByTitle = library.searchByTitle("pyton");
        for (Book book : booksByTitle) {
            System.out.println(book);
        }
        System.out.println();


        System.out.println("Searching for books by author 'nataraj' :: ");
        List<Book> booksByAuthor = library.searchByAuthor("natraj");
        for (Book book : booksByAuthor) {
            System.out.println(book);
        }
        System.out.println();
    }
}
