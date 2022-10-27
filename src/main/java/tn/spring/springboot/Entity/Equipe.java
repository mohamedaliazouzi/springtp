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
@Table( name="Equipe")

public class Equipe implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idEquipe")
    private int idEquipe;

    private String nomEquipe;
    @Enumerated(EnumType.STRING)
    private Niveau niveau;

    @ManyToMany(mappedBy="equipes", cascade = CascadeType.ALL)
    private Set<Etudiant> equipes;

    @OneToOne
    private DetailEquipe detailEquipe;


}
