/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.um5s.labos.DAO.beans.Carriere;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author l.IsSaM.l
 */
@Entity
public class Competence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Compt_ID")
    private long id;
    private String libelle;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY , mappedBy = "pk.competence")
    private Set<UserComptence> userCompetences = new HashSet<UserComptence>();

    public Competence(String libelle) {
        this.libelle = libelle;
    }

    public Competence() {
    }
    

    
    public long getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    
    
    
}
