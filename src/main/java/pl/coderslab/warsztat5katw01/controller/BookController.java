package pl.coderslab.warsztat5katw01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.warsztat5katw01.model.Book;
import pl.coderslab.warsztat5katw01.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/hello")
    public String hello() {
        return "{msg:hello}";
    }

    @GetMapping("/helloBook")
    public Book helloBook(){
        return	new	Book(1,"9788324631766","Thinking	in	Java",
                "Bruce	Eckel","Helion","programming");
    }

    @GetMapping("")
    public List<Book> bookList() {
        return this.bookService.getList();
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable int id) {
        this.bookService.deleteById(id);
        return "{\"status\":\"success\"}";
    }

    @PostMapping("")
    public Book addBook(@RequestBody Book book) {
        this.bookService.insert(book);
        return book;
    }


}
