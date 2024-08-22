package be.bstorm.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Check;

import java.io.Serializable;

@Entity
public class UserBook {

    @EmbeddedId
    private UserBookId id;

    @Check(name = "CK_RATING",constraints = "rating between 0 and 5" )
    private int rating;

    @ManyToOne
    @MapsId("userId")
    private User user;

    @ManyToOne
    @MapsId("bookId")
    private Book book;

    @Embeddable
    public class UserBookId implements Serializable {
        private Long userId;
        private Long bookId;
    }
}
