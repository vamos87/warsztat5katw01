package pl.coderslab.warsztat5katw01.service;

import pl.coderslab.warsztat5katw01.model.Book;

import java.util.List;

public interface BookService {
    List<Book> getList();

    void deleteById(int id);

    void insert(Book book);
}
