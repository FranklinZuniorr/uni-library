package com.uniLibrary.model;

import java.time.Year;

public class FormBook {
    private String title;
    private String author;
    private int year;
    private String isbn;

    public void Book() {
        this.author = "";
        this.isbn = "";
        this.title = "";
        this.year = Year.now().getValue();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
