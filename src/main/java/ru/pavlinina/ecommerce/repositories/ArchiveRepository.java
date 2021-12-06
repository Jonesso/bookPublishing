package ru.pavlinina.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.pavlinina.ecommerce.models.Archive;

/**
 * @author Sofia Pavlinina
 */
@Repository
public interface ArchiveRepository extends JpaRepository<Archive, Integer> {

}
