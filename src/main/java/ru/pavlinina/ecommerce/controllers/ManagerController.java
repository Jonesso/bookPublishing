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
import ru.pavlinina.ecommerce.models.RoughDraft;
import ru.pavlinina.ecommerce.services.ArchiveService;
import ru.pavlinina.ecommerce.services.BookLayoutService;
import ru.pavlinina.ecommerce.services.BookService;
import ru.pavlinina.ecommerce.services.EditedTextService;
import ru.pavlinina.ecommerce.services.PublicationRequirementService;
import ru.pavlinina.ecommerce.services.RoughDraftService;
import ru.pavlinina.ecommerce.services.ShopService;


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

  @Autowired
  private RoughDraftService roughDraftService;

  @Autowired
  private ShopService shopService;

  @Autowired
  private ArchiveService archiveService;

  @Autowired
  private PublicationRequirementService publicationRequirementService;

  @Autowired
  private BookLayoutService bookLayoutService;

  @GetMapping("index")
  public String index() {
    return "manager/index";
  }

  @GetMapping("other")
  public String other() {
    return "manager/other";
  }

  //	Rough Draft --------------------------------------------------

  @GetMapping("draft-form")
  public ModelAndView listDrafts() {
    ModelAndView mv = new ModelAndView("manager/draft-form");
    mv.addObject("draftsList", roughDraftService.listDrafts());
    return mv;
  }

  @PostMapping("add-draft")
  public ModelAndView addDraft(RoughDraft roughDraft) {
    ModelAndView mv = new ModelAndView("manager/draft-form");
    roughDraftService.addDraft(roughDraft);
    mv.addObject("draftsList", roughDraftService.listDrafts());
    return mv;
  }

  @GetMapping("delete-draft/{draftId}")
  public ModelAndView deleteCategory(@PathVariable("draftId") String draftId) {
    ModelAndView mv = new ModelAndView("manager/draft-form");
    roughDraftService.deleteDraft(Integer.parseInt(draftId));
    mv.addObject("draftsList", roughDraftService.listDrafts());
    return mv;
  }

  @GetMapping("update-draft/{draftId}")
  public ModelAndView updateCategory(@PathVariable("draftId") String draftId) {
    ModelAndView mv = new ModelAndView("manager/update-draft");
    mv.addObject("Draft", roughDraftService.getDraftById(Integer.parseInt(draftId)).get());
    return mv;
  }

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

  //	Shop --------------------------------------------------

  @GetMapping("shop-form")
  public ModelAndView listShops() {
    ModelAndView mv = new ModelAndView("manager/shop-form");
    mv.addObject("shopsList", shopService.listShops());
    return mv;
  }

  //	Archive --------------------------------------------------

  @GetMapping("archive-form")
  public ModelAndView listArchives() {
    ModelAndView mv = new ModelAndView("manager/archive-form");
    mv.addObject("archivesList", archiveService.listArchives());
    return mv;
  }

  //	Requirements --------------------------------------------------

  @GetMapping("requirements-form")
  public ModelAndView listPublicationRequirements() {
    ModelAndView mv = new ModelAndView("manager/requirements-form");
    mv.addObject("requirementsList", publicationRequirementService.listRequirements());
    return mv;
  }
  //	Book layout --------------------------------------------------

  @GetMapping("layout-form")
  public ModelAndView listBookLayouts() {
    ModelAndView mv = new ModelAndView("manager/layout-form");
    mv.addObject("layoutsList", bookLayoutService.listLayouts());
    return mv;
  }
}
