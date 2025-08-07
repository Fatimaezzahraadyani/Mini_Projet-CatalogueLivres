package com.cataloguedelivre.miniproject.Controller;


import com.cataloguedelivre.miniproject.Model.Author;
import com.cataloguedelivre.miniproject.Model.Book;
import com.cataloguedelivre.miniproject.Service.AuthorService;
import com.cataloguedelivre.miniproject.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("api/author")
public class AuthorController {

    private final AuthorService authorService;
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PostMapping("/addAuthor")
    public Author addAuthor(@RequestBody Author author) {
        return authorService.addAuthor(author);
    }

    @GetMapping
    private List<Author> getAllAuthors() {
        return authorService.getAllAuthors();
    }

    @GetMapping("/{id}")
    private Author getAuthorById(@PathVariable Long id) {
        return authorService.getAuthorById(id);
    }


}
