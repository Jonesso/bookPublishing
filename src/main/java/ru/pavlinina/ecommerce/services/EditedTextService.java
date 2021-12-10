package ru.pavlinina.ecommerce.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.pavlinina.ecommerce.models.EditedText;
import ru.pavlinina.ecommerce.repositories.EditedTextRepository;

/**
 * @author Sofia Pavlinina
 */
@Service
public class EditedTextService {

  @Autowired
  private EditedTextRepository editedTextRepository;

  public List<EditedText> listEditedTexts() {
    return editedTextRepository.findAll();
  }

  public Optional<EditedText> getEditedTextById(Integer editedTextId) {
    return editedTextRepository.findById(editedTextId);
  }

  public void addEditedText(EditedText editedText) {
    editedTextRepository.save(editedText);
  }

  public void deleteEditedText(Integer editedTextId) {
    editedTextRepository.deleteById(editedTextId);
  }

  public List<EditedText> findByAuthor(String author) {
    return editedTextRepository.findByAuthorContaining(author);
  }
}
