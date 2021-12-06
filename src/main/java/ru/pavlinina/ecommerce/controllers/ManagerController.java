package ru.pavlinina.ecommerce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.pavlinina.ecommerce.models.Book;
import ru.pavlinina.ecommerce.models.EditedText;
import ru.pavlinina.ecommerce.services.BookService;
import ru.pavlinina.ecommerce.services.EditedTextService;


/**
 * @author Sofia Pavlinina
 */
@Controller
@RequestMapping("manager")
public class ManagerController {

  @Autowired
  private BookService bookService;

  @Autowired
  private EditedTextService editedTextService;

  @GetMapping("index")
  public String index() {
    return "manager/index";
  }

  //	Rough Draft --------------------------------------------------

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
  //	Edited text --------------------------------------------------

  @GetMapping("edited-text-form")
  public ModelAndView listEditedTexts() {
    ModelAndView mv = new ModelAndView("manager/edited-text-form");
    mv.addObject("editedTextsList", editedTextService.listEditedTexts());
    return mv;
  }

  @PostMapping("add-edited-text")
  public ModelAndView addEditedText(EditedText editedText) {
    ModelAndView mv = new ModelAndView("manager/edited-text-form");
    editedTextService.addEditedText(editedText);
    mv.addObject("editedTextsList", editedTextService.listEditedTexts());
    return mv;
  }

  @GetMapping("delete-edited-text/{editedTextId}")
  public ModelAndView deleteEditedText(@PathVariable("editedTextId") String editedTextId) {
    ModelAndView mv = new ModelAndView("manager/edited-text-form");
    editedTextService.deleteEditedText(Integer.parseInt(editedTextId));
    mv.addObject("editedTextsList", editedTextService.listEditedTexts());
    return mv;
  }


  @GetMapping("update-edited-text/{editedTextId}")
  public ModelAndView updateEditedText(@PathVariable("editedTextId") String editedTextId) {
    ModelAndView mv = new ModelAndView("manager/update-edited-text");
    mv.addObject("EditedText",
        editedTextService.getEditedTextById(Integer.parseInt(editedTextId)).get());
    return mv;
  }

  //	Book --------------------------------------------------

  @GetMapping("book-form")
  public ModelAndView listBooks() {
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
    bookService.deleteBook(Integer.parseInt(bookId));
    mv.addObject("booksList", bookService.listBooks());
    return mv;
  }

  @GetMapping("update-book/{bookId}")
  public ModelAndView updateBook(@PathVariable("bookId") String bookId) {
    ModelAndView mv = new ModelAndView("manager/update-book");
    mv.addObject("Book", bookService.getBookById(Integer.parseInt(bookId)).get());
    return mv;
  }

}
