package ru.pavlinina.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.pavlinina.ecommerce.models.PublicationRequirement;

/**
 * @author Sofia Pavlinina
 */
@Repository
public interface PublicationRequirementRepository extends
    JpaRepository<PublicationRequirement, Long> {

}
