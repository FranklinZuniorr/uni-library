package com.uniLibrary.model;

import java.time.Year;

public class Book {
    private String title;
    private String author;
    private int year;
    private String isbn;

    public Book(String title, String author, int year, String isbn) {
        setTitle(title);
        setAuthor(author);
        setYear(year);
        setIsbn(isbn);
    }

    public Book() {
        this.setDefaultValues();
    }

    public void setDefaultValues() {
        this.author = "";
        this.isbn = "";
        this.title = "";
        this.year = Year.now().getValue();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("O título não pode ser vazio.");
        }
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("O autor não pode ser vazio.");
        }
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year <= 0) {
            throw new IllegalArgumentException("O ano de publicação deve ser maior que zero.");
        }
        this.year = year;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if (isbn == null || isbn.trim().isEmpty()) {
            throw new IllegalArgumentException("O ISBN não pode ser vazio.");
        }
        if (!isbn.matches("\\d{13}")) {  // Verifica se o ISBN tem 13 dígitos numéricos
            throw new IllegalArgumentException("O ISBN deve ter exatamente 13 dígitos.");
        }
        this.isbn = isbn;
    }
}
