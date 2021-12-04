package ru.pavlinina.ecommerce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.pavlinina.ecommerce.models.Book;
import ru.pavlinina.ecommerce.services.BookService;


/**
 * @author Sofia Pavlinina
 */
@Controller
@RequestMapping("manager")
public class ManagerController {

  @Autowired
  private BookService bookService;

  @GetMapping("index")
  public String index() {
    return "manager/index";
  }

  //	Category--------------------------------------------------

//    @GetMapping("category-form")
//    public ModelAndView listCategory() {
//        ModelAndView mv = new ModelAndView("manager/category-form");
//        mv.addObject("categoryList", categoryService.listCategory());
//        return mv;
//    }
//
//    @PostMapping("add-category")
//    public ModelAndView addCategory(Category category) {
//        ModelAndView mv = new ModelAndView("manager/category-form");
//        categoryService.addCategory(category);
//        mv.addObject("categoryList", categoryService.listCategory());
//        return mv;
//    }
//
//    @GetMapping("delete-Category/{categoryId}")
//    public ModelAndView deleteCategory(@PathVariable("categoryId")String categoryId) {
//        ModelAndView mv = new ModelAndView("manager/category-form");
//        categoryService.deleteCategory(Long.parseLong(categoryId));
//        mv.addObject("categoryList", categoryService.listCategory());
//        return mv;
//    }
//
//    @GetMapping("updateCategory/{categoryId}")
//    public ModelAndView updateCategory(@PathVariable("categoryId")String categoryId) {
//        ModelAndView mv = new ModelAndView("manager/updateCategory");
//        mv.addObject("Category", categoryService.getCategory(Long.parseLong(categoryId)).get());
//        return mv;
//    }
//
//
  //	Book --------------------------------------------------

  @GetMapping("book-form")
  public ModelAndView listProduct() {
    ModelAndView mv = new ModelAndView("manager/book-form");
    mv.addObject("booksList", bookService.listBooks());
    return mv;
  }

  @PostMapping("add-book")
  public ModelAndView addBook(Book book) {
    ModelAndView mv = new ModelAndView("manager/book-form");
    bookService.addBook(book);
    mv.addObject("booksList", bookService.listBooks());
    return mv;
  }

  @GetMapping("delete-book/{bookId}")
  public ModelAndView deleteBook(@PathVariable("bookId") String bookId) {
    ModelAndView mv = new ModelAndView("manager/book-form");
    bookService.deleteBook(Long.parseLong(bookId));
    mv.addObject("booksList", bookService.listBooks());
    return mv;
  }

  @GetMapping("update-book/{bookId}")
  public ModelAndView updateBook(@PathVariable("bookId") String bookId) {
    ModelAndView mv = new ModelAndView("manager/update-book");
    mv.addObject("Book", bookService.getBookById(Long.parseLong(bookId)).get());
    return mv;
  }

}
