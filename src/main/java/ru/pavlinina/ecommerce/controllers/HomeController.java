package ru.pavlinina.ecommerce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

//    @GetMapping("getProducts/{categoryId}")
//    public ModelAndView getProductFromCategory(@PathVariable("categoryId")String categoryId) {
//        ModelAndView mv = new ModelAndView("index");
//        long categoryLongId = Long.parseLong(categoryId);
//        System.out.println(categoryLongId);
//        mv.addObject("productList", productService.findByCategory(categoryLongId));
//        mv.addObject("categoryList", categoryService.listCategory());
//        return mv;
//    }

  @GetMapping("error")
  public String error() {
    return "error";
  }

}
