package com.cataloguedelivre.miniproject.Service;


import com.cataloguedelivre.miniproject.Model.Book;
import com.cataloguedelivre.miniproject.Repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

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

    public Optional<Book> getBookById(Long id){
        return bookRepository.findById(id);
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

    public List<Book> getBooksByDateBetween(Date Date1, Date Date2){
        return bookRepository.getBookByDatePublicationBetween(Date1,Date2);
    }
}
