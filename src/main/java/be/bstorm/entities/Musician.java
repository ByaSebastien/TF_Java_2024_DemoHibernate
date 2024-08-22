package be.bstorm.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Musician {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany
    private Set<Instruments> instruments;
}
