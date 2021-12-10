package ru.pavlinina.ecommerce.services;

import java.util.List;
import java.util.Optional;
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
    return bookRepository.findAll();
  }

  public Optional<Book> getBookById(Integer bookId) {
    return bookRepository.findById(bookId);
  }

  public void addBook(Book book) {
    bookRepository.save(book);
  }

  public void deleteBook(Integer bookId) {
    bookRepository.deleteById(bookId);
  }

  public List<Book> findByAuthor(String author) {
    return bookRepository.findByAuthorContaining(author);
  }

  public List<Book> findByTitle(String title) {
    return bookRepository.findByTitleContaining(title);
  }

  public List<Book> findByAgeLimit(int ageLimit) {
    return bookRepository.findByAgeLimit(ageLimit);
  }
}
