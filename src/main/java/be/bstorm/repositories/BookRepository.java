package be.bstorm.repositories;

import be.bstorm.entities.Book;

import java.util.List;

public interface BookRepository {

    void save(Book book);
    Book findById(Long id);
    List<Book> findAll();
    void deleteById(Long id);
    void update(Long id,Book book);
}
