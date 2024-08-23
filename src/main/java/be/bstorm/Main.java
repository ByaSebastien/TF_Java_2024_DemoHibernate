package be.bstorm;

import be.bstorm.entities.*;
import be.bstorm.enums.UserGender;
import be.bstorm.repositories.BookRepository;
import be.bstorm.repositories.BookRepositoryImpl;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Book book = new Book();
        book.setTitle("L'art de la guerre");

        BookRepository bookRepository = new BookRepositoryImpl();

        bookRepository.save(book);

        Book updatedBook = new Book();
        updatedBook.setTitle("Toto a la playa");

        bookRepository.update(1L, updatedBook);


    }
}