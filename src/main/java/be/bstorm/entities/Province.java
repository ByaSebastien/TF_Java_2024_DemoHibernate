package be.bstorm.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Province {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

//    @OneToMany(mappedBy = "province")
//    private Set<Municipality> municipalities;
}
