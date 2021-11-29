package ru.pavlinina.ecommerce.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.pavlinina.ecommerce.models.Book;
import ru.pavlinina.ecommerce.repositories.BookRepository;

/**
 * @author Sofia Pavlinina
 */
@Service
public class BookService {

  @Autowired
  private BookRepository bookRepository;

  public List<Book> listBooks() {
    System.out.println(bookRepository.findAll());
    return bookRepository.findAll();
  }
}
