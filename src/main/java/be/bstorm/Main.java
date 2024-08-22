package be.bstorm;

import be.bstorm.entities.Address;
import be.bstorm.entities.Mayor;
import be.bstorm.entities.Municipality;
import be.bstorm.entities.User;
import be.bstorm.enums.UserGender;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DemoJPA");
        EntityManager em = emf.createEntityManager();
        //        try (EntityManager em = emf.createEntityManager()){
//
//
//            User user = new User();
//            user.setFirstName("Seb");
//            user.setLastName("Bya");
//            user.setGender(UserGender.MALE);
//            user.setBirthDate(LocalDate.of(1991,3,27));
//            Address address = new Address();
//            address.setCity("Liège");
//            address.setState("Liège");
//            address.setZip("4000");
//            address.setStreet("Marcel Remy");
//            user.setAddress(address);
//
//            System.out.println(user);
//
//            em.getTransaction().begin();
//
//            em.persist(user);
//
//            em.getTransaction().commit();
//
//            System.out.println(user);
//
//            em.getTransaction().begin();
//
//            user.setFirstName("Toto");
//
//            em.getTransaction().commit();
//
//            User result = em.find(User.class, 1);
//
//            System.out.println(result);
//
//            List<User> users = em.createQuery("select u from User u", User.class).getResultList();
//
//            em.getTransaction().begin();
//
//            em.remove(user);
//
//            em.getTransaction().commit();
//        }

        Mayor mayor = new Mayor("Jean");

        Municipality municipality = new Municipality("Fexhe",mayor);

        em.getTransaction().begin();

        em.persist(municipality);

        em.getTransaction().commit();

    }
}