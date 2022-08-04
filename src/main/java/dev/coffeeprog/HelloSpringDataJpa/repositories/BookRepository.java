package dev.coffeeprog.HelloSpringDataJpa.repositories;

import dev.coffeeprog.HelloSpringDataJpa.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}

