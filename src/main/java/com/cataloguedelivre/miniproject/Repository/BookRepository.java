package com.cataloguedelivre.miniproject.Repository;


import com.cataloguedelivre.miniproject.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    Book getBookById(Long id);

    @Query(value = "select * from Book where title like concat('%',:mot,'%')  or description like concat('%',:mot,'%') ", nativeQuery = true)
    List<Book> getBookByTitleOrDescriptionLike(String mot);


    @Query(value = "select * from Book where DatePublication between :date1 and :date2", nativeQuery = true)
    List<Book> getBookByDatePublicationBetween(Date date1, Date date2);



}


