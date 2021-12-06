package ru.pavlinina.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.pavlinina.ecommerce.models.Book;

/**
 * @author Sofia Pavlinina
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
