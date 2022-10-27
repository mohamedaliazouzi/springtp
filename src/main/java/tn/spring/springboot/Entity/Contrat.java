package tn.spring.springboot.Entity;

import lombok.*;


import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Table( name="Contrat")

public class Contrat implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idContrat")
    private int idEtudiant;

    private Date dateDebutContrat;
    private Date dateFinContrat;
    private boolean archive;
    private int montantContrat;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;

    @ManyToOne
    Etudiant etudiant;

}
