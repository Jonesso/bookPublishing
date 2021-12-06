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

  // TODO
//  public List<Book> findByAuthor(Long authorId) {
//    return bookRepository.findByAuthor_AuthorId(authorId);
//  }
}
