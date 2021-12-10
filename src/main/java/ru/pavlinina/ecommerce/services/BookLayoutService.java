package ru.pavlinina.ecommerce.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.pavlinina.ecommerce.models.BookLayout;
import ru.pavlinina.ecommerce.repositories.BookLayoutRepository;

/**
 * @author Sofia Pavlinina
 */
@Service
public class BookLayoutService {

  @Autowired
  private BookLayoutRepository bookLayoutRepository;

  public List<BookLayout> listLayouts() {
    return bookLayoutRepository.findAll();
  }

}
