package tn.spring.springboot.Entity;


import lombok.*;


import javax.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table( name="Universite")

public class Universite implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idUniv")
    private int idUniv;
    private String nomUniv;

    @OneToOne
    private Departement departement;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Departement> departements;


}
