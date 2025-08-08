package com.cataloguedelivre.miniproject.Controller;


import com.cataloguedelivre.miniproject.Model.Book;
import com.cataloguedelivre.miniproject.Service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/books")
public class BookController {


    private final BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }
    @PostMapping("/addBooks")
    public Book addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    @GetMapping("/AllBooks")
    public List<Book> getAllBooks(){
        return bookService.getBooks();
    }

    @GetMapping("/getbyId/{id}")
    public Optional<Book> getBook(@PathVariable Long id){
        return bookService.getBookById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id){
        bookService.deleteBookById(id);
    }
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book){
        book.setId(id);
        return bookService.updateBook(book);
    }

    @GetMapping("/search/{mot}")
    public List<Book> getBooksByMot(@PathVariable String mot){
        return bookService.getBooksByMot(mot);
    }

    @GetMapping("/searchByDate")
    public List<Book> getBooksBySearchByDate(@RequestParam Date dateMin, @RequestParam Date dateMax){
        return bookService.getBooksByDateBetween(dateMin, dateMax);
    }



}
