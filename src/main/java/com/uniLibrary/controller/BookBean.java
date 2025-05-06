package com.uniLibrary.controller;
import com.uniLibrary.model.Book;
import com.uniLibrary.model.FormBook;
import com.uniLibrary.repository.BookRepository;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import java.io.Serializable;
import java.util.List;

@Named("bookBean")
@SessionScoped
public class BookBean implements Serializable {

    private List<Book> books;
    private FormBook formBook = new FormBook();

    public BookBean() {
        books = BookRepository.getAllBooks();  // Carregar livros da base de dados.
    }

    public List<Book> getBooks() {
        return books;
    }

    public FormBook getFormBook() {
        return formBook;
    }

    public String removeBook(String isbn) {
        BookRepository.removeBook(isbn);
        books = BookRepository.getAllBooks();  // Atualiza a lista de livros após exclusão
        return "/books/index.xhtml";  // Retorna para a mesma página
    }

    public String addBook() {
        try {
            // Tenta adicionar o livro com os dados do formulário
            Book newBook = new Book(formBook.getTitle(), formBook.getAuthor(), formBook.getYear(), formBook.getIsbn());
            // Se chegar aqui, o livro foi validado corretamente e pode ser adicionado
            BookRepository.addBook(newBook);  // Adiciona o novo livro ao repositório
            books = BookRepository.getAllBooks();  // Atualiza a lista de livros após a adição
    
            // Mensagem de sucesso
            FacesContext.getCurrentInstance().addMessage(null, 
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso", "Livro adicionado com sucesso."));
    
            formBook = new FormBook();

            return "/books/index.xhtml?faces-redirect=true"; // Evita reenvio do formulário ao atualizar
    
        } catch (IllegalArgumentException e) {
            FacesContext.getCurrentInstance().addMessage(null, 
                    new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), e.getMessage()));
            return "/books/index.xhtml";
        }
    }
    
}
