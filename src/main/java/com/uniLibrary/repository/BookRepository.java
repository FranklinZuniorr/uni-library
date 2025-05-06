package com.uniLibrary.repository;

import com.uniLibrary.model.Book;
import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private static List<Book> books = new ArrayList<>();

    public static List<Book> getAllBooks() {
        return books;
    }

    public static void addBook(Book book) {
        books.add(book);
    }

    public static void removeBook(String isbn) {
        books.removeIf(book -> book.getIsbn().equals(isbn));
    }
}
