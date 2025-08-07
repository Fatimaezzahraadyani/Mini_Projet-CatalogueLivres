package com.cataloguedelivre.miniproject.Repository;


import com.cataloguedelivre.miniproject.Model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorReposirory extends JpaRepository<Author, Long> {

}
