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
@Table( name="Etudiant")

public class Etudiant implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idEtudiant")
    private int idEtudiant;
    private String prenomE;
    private String nomE;
    @Enumerated(EnumType.STRING)
    private Option option;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="etudiant")
    private Set<Contrat> contrats;

    @ManyToOne
    Departement departement;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Equipe> equipes;


}
