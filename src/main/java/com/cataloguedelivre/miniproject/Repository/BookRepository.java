package com.cataloguedelivre.miniproject.Repository;


import com.cataloguedelivre.miniproject.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
