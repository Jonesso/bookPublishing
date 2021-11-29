package ru.pavlinina.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.pavlinina.ecommerce.models.RoughDraft;

/**
 * @author Sofia Pavlinina
 */
@Repository
public interface RoughDraftRepository extends JpaRepository<RoughDraft, Long> {

}
