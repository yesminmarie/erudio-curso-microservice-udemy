package io.github.yesminmarie.bookservice.repository;

import io.github.yesminmarie.bookservice.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
