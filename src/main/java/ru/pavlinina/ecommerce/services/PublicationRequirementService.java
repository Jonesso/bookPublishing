package ru.pavlinina.ecommerce.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.pavlinina.ecommerce.models.PublicationRequirement;
import ru.pavlinina.ecommerce.repositories.PublicationRequirementRepository;

/**
 * @author Sofia Pavlinina
 */
@Service
public class PublicationRequirementService {

  @Autowired
  private PublicationRequirementRepository publicationRequirementRepository;

  public List<PublicationRequirement> listRequirements() {
    return publicationRequirementRepository.findAll();
  }

}
