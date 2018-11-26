package demo.springboot.web;

import demo.springboot.domain.Book;
import demo.springboot.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: withlzc
 * @Description:
 * @Date: Created in 2018/11/25 0025 15:23
 */
@Controller
@RequestMapping(value = "/book")
public class BookController {

    private static final String BOOK_FORM_PATH_NAME = "bookForm";
    private static final String BOOK_LIST_PATH_NAME = "bookList";
    private static final String REDIRECT_TO_BOOK_URL = "redirect:/book";

    @Autowired
    BookService bookService;

    //@RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public String getBookList(ModelMap map) {
        map.addAttribute("bookList",bookService.findAll());
        return BOOK_LIST_PATH_NAME;
    }

    //@RequestMapping(value = "/create", method = RequestMethod.GET)
    @GetMapping("/create")
    public String createBookForm(ModelMap map) {
        map.addAttribute("book", new Book());
        map.addAttribute("action", "create");
        return BOOK_FORM_PATH_NAME;
    }

    //@RequestMapping(value = "/create", method = RequestMethod.POST)
    @PostMapping("/create")
    public String postBook(@ModelAttribute Book book) {
        bookService.insertByBook(book);
        return REDIRECT_TO_BOOK_URL;
    }

    //@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    @GetMapping("/update/{id}")
    public String getUser(@PathVariable Long id, ModelMap map) {
        map.addAttribute("book", bookService.findById(id));
        map.addAttribute("action", "update");
        return BOOK_FORM_PATH_NAME;
    }

    //@RequestMapping(value = "/update", method = RequestMethod.POST)
    @PostMapping("/update")
    public String putBook(@ModelAttribute Book book) {
        bookService.update(book);
        return REDIRECT_TO_BOOK_URL;
    }

    //@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable Long id) {
        bookService.delete(id);
        return REDIRECT_TO_BOOK_URL;
    }

}
