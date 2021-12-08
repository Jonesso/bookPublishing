package ru.pavlinina.ecommerce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ru.pavlinina.ecommerce.models.User;
import ru.pavlinina.ecommerce.services.BookService;
import ru.pavlinina.ecommerce.services.EditedTextService;
import ru.pavlinina.ecommerce.services.RoughDraftService;
import ru.pavlinina.ecommerce.services.UserService;

/**
 * @author Sofia Pavlinina
 */
@Controller
@RequestMapping("/")
public class HomeController {

  @Autowired
  private UserService userService;

  @Autowired
  private BookService bookService;

  @Autowired
  private EditedTextService editedTextService;

  @Autowired
  private RoughDraftService roughDraftService;


  @GetMapping({"index", "/"})
  public String index(Model model) {
    model.addAttribute("booksList", bookService.listBooks());
    return "index";
  }

  @GetMapping("login")
  public String login() {
    return "login";
  }

  @GetMapping("signup")
  public String signup() {
    return "signup";
  }

  @PostMapping("signup")
  public ModelAndView signUp(User user) {
    ModelAndView mv = new ModelAndView("/index");
    userService.save(user);

    return mv;
  }

  @GetMapping("edited-texts")
  public String editedTexts(Model model) {
    model.addAttribute("editedTextsList", editedTextService.listEditedTexts());
    return "edited_texts";
  }

  @GetMapping("drafts")
  public String drafts(Model model) {
    model.addAttribute("draftsList", roughDraftService.listDrafts());
    return "drafts";
  }

  @GetMapping("search-books-by-author")
  public String searchBooksByAuthor(@RequestParam(name = "author") String author, Model model) {
    model.addAttribute("booksList", bookService.findByAuthor(author));
    return "index";
  }

  @GetMapping("search-books-by-title")
  public String searchBooksByTitle(@RequestParam(name = "title") String title, Model model) {
    model.addAttribute("booksList", bookService.findByTitle(title));
    return "index";
  }

  @GetMapping("search-books-by-age-limit")
  public String searchBooksByAgeLimit(@RequestParam(name = "ageLimit") String ageLimit,
      Model model) {
    model.addAttribute("booksList", bookService.findByAgeLimit(Integer.parseInt(ageLimit)));
    return "index";
  }

  @GetMapping("search-edited-texts-by-author")
  public String searchEditedTextsByAuthor(@RequestParam(name = "author") String author,
      Model model) {
    model.addAttribute("editedTextsList", editedTextService.findByAuthor(author));
    return "edited_texts";
  }

  @GetMapping("error")
  public String error() {
    return "error";
  }

}
