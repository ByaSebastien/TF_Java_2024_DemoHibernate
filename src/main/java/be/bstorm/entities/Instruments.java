package be.bstorm.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Instruments {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

//    @ManyToMany(mappedBy = "instruments")
//    private Set<Musician> musicians;
}
