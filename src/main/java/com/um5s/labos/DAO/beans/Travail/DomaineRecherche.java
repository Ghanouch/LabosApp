/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.um5s.labos.DAO.beans.Travail;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author l.IsSaM.l
 */
@Entity
public class DomaineRecherche {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Domaine_ID")
    private long id;
    private String title;
    
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Labo_ID")
    private Laboratoire laboratoire;
    
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Equipe_ID")
    private Equipe equipe;

    public DomaineRecherche(String title) {
        this.title = title;
    }

    public DomaineRecherche(String title, Laboratoire laboratoire, Equipe equipe) {
        this.title = title;
        this.laboratoire = laboratoire;
        this.equipe = equipe;
    }

    public DomaineRecherche() {
    }

    
    
    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

 

    public Laboratoire getLaboratoire() {
        return laboratoire;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

  
    public void setLaboratoire(Laboratoire laboratoire) {
        this.laboratoire = laboratoire;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }
    
    
    
}
