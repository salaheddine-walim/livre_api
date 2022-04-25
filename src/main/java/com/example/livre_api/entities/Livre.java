package com.example.livre_api.entities;

import lombok.*;
import org.springframework.core.annotation.Order;

import javax.persistence.*;
import javax.persistence.OrderBy;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Livre")
public class Livre {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @Column(name="titre",length=50,nullable=false)
    private String titre;
    @Column(nullable=false,updatable=false)
    private String maisonEdition;
    @Column(nullable=false)
    private Date dateSortie;
    @Column(nullable=false)
    private String auteur;
    @Column(nullable=false)
    private int nbrPage;
    @Column(unique=true,nullable=false,updatable=false)
    private String ISBN;
    @Column(nullable=false)
    private Date dernierConsultation;
    @Column(nullable=false)
    private boolean disponible;
}
