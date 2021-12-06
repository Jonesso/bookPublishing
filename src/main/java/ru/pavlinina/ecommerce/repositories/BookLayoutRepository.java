package ru.pavlinina.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.pavlinina.ecommerce.models.BookLayout;

/**
 * @author Sofia Pavlinina
 */
@Repository
public interface BookLayoutRepository extends JpaRepository<BookLayout, Integer> {

}
