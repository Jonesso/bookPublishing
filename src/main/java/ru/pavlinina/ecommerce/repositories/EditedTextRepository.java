package ru.pavlinina.ecommerce.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.pavlinina.ecommerce.models.EditedText;

/**
 * @author Sofia Pavlinina
 */
@Repository
public interface EditedTextRepository extends JpaRepository<EditedText, Integer> {

  List<EditedText> findByAuthorContaining(String author);
}
