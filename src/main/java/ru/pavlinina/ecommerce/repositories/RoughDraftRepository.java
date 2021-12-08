package ru.pavlinina.ecommerce.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.pavlinina.ecommerce.models.RoughDraft;

/**
 * @author Sofia Pavlinina
 */
@Repository
public interface RoughDraftRepository extends JpaRepository<RoughDraft, Integer> {

  List<RoughDraft> findByStatus(String status);

  List<RoughDraft> findByAuthor(String author);

  List<RoughDraft> findByTitle(String title);
}
