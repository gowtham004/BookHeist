package com.springboot.bookheist.repository;

import com.springboot.bookheist.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends JpaRepository<Books, Long> {

//    @Query("SELECT b FROM Books b WHERE b.bookname LIKE %:keyword% OR b.author LIKE %:keyword%")
//    List<Books> searchBooks(@Param("keyword") String keyword);
}
