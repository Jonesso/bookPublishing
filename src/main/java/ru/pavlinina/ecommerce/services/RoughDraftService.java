package ru.pavlinina.ecommerce.services;

import java.util.List;
import java.util.Optional;
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

  public Optional<RoughDraft> getDraftById(Integer draftId) {
    return roughDraftRepository.findById(draftId);
  }

  public void addDraft(RoughDraft draft) {
    roughDraftRepository.save(draft);
  }

  public void deleteDraft(Integer draftId) {
    roughDraftRepository.deleteById(draftId);
  }

  public List<RoughDraft> findByStatus(String status) {
    return roughDraftRepository.findByStatus(status);
  }

  public List<RoughDraft> findByAuthor(String author) {
    return roughDraftRepository.findByAuthorContaining(author);
  }

  public List<RoughDraft> findByTitle(String title) {
    return roughDraftRepository.findByTitleContaining(title);
  }
}
