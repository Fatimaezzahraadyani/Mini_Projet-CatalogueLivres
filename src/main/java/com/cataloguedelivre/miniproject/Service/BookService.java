package com.cataloguedelivre.miniproject.Service;


import com.cataloguedelivre.miniproject.Model.Book;
import com.cataloguedelivre.miniproject.Repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(Long id){
        return bookRepository.getBookById(id);
    }

    public void deleteBookById(Long id){
        bookRepository.deleteById(id);
    }

    public Book updateBook(Book book){
        return bookRepository.save(book);
    }

    public List<Book> getBooksByMot(String mot){
        return bookRepository.getBookByTitleOrDescriptionLike(mot);
    }
}
