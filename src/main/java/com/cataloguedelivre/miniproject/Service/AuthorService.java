package com.cataloguedelivre.miniproject.Service;


import com.cataloguedelivre.miniproject.Model.Author;
import com.cataloguedelivre.miniproject.Repository.AuthorReposirory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorReposirory authorReposirory;

    public AuthorService(AuthorReposirory authorReposirory){
        this.authorReposirory = authorReposirory;
    }

    public Author addAuthor(Author author){
        return authorReposirory.save(author);
    }

    public List<Author> getAllAuthors(){
        return authorReposirory.findAll();
    }

    public Author getAuthorById(Long id){
        return authorReposirory.getAuthorById(id);
    }
}
