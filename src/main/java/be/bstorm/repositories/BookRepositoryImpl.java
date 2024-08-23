package be.bstorm.repositories;

import be.bstorm.entities.Book;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class BookRepositoryImpl implements BookRepository{

    private final EntityManagerFactory emf;

    public BookRepositoryImpl() {
        this.emf = Persistence.createEntityManagerFactory("DemoJPA");
    }

    @Override
    public void save(Book book) {
        try(EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.persist(book);
            em.getTransaction().commit();
        }
    }

    @Override
    public Book findById(Long id) {
        try(EntityManager em = emf.createEntityManager()) {
            return em.find(Book.class, id);
        }
    }

    @Override
    public List<Book> findAll() {
        try(EntityManager em = emf.createEntityManager()) {
            return em.createQuery("SELECT b from Book b",Book.class).getResultList();
        }
    }

    @Override
    public void deleteById(Long id) {
        try(EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            Book book = findById(id);
            em.remove(book);
            em.getTransaction().commit();
        }
    }

    @Override
    public void update(Long id, Book book) {
        try(EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            Book existingBook = findById(id);

            existingBook.setTitle(book.getTitle());

//            em.merge(existingBook);
            em.getTransaction().commit();
        }
    }
}
