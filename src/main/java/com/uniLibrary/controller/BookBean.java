package com.uniLibrary.controller;

import com.uniLibrary.model.Book;
import com.uniLibrary.repository.BookRepository;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named("bookBean")
@SessionScoped
public class BookBean implements Serializable {

    private List<Book> books;

    public BookBean() {
        books = BookRepository.getAllBooks();  // Carregar livros da base de dados ou repositório.
    }

    public List<Book> getBooks() {
        return books;
    }

    public String excluirLivro(String isbn) {
        BookRepository.removeBook(isbn);
        books = BookRepository.getAllBooks();  // Atualiza a lista de livros após exclusão
        return "bookList";  // Retorna para a mesma página
    }
}
