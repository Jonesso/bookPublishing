package ru.pavlinina.ecommerce.services;

import java.util.List;
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
}
