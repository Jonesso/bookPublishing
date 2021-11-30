package ru.pavlinina.ecommerce.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.pavlinina.ecommerce.models.RoughDraft;
import ru.pavlinina.ecommerce.repositories.RoughDraftRepository;

/**
 * @author Sofia Pavlinina
 */
@Service
public class RoughDraftService {

  @Autowired
  private RoughDraftRepository roughDraftRepository;

  public List<RoughDraft> listDrafts() {
    return roughDraftRepository.findAll();
  }
}
