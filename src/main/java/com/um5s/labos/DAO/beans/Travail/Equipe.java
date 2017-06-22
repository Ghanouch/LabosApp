/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.um5s.labos.DAO.beans.Travail;

import com.um5s.labos.DAO.beans.Profil.Membre;
import com.um5s.labos.DAO.beans.Profil.ChefEquipe;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author l.IsSaM.l
 */
@Entity
public class Equipe {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Equipe_ID")
    private long id;
    private String nom;
    private String Description; 
    private Date dateCreation;
    
    @OneToOne
    @JoinColumn(name = "User_Id")
    private ChefEquipe ChefEquipe;
    
    
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Labo_ID")
    private Laboratoire laboratoire;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Centre_ID")
    private CentreRecherche centreRecherche;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "Domaine_ID")    
    private Set<DomaineRecherche> listDomaines = new HashSet<DomaineRecherche>();
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="User_Id")
    private Set<Membre> listDesMembres = new HashSet<Membre>();

    public Equipe(String nom, String Description) {
        this.nom = nom;
        this.Description = Description;
    }

    public Equipe() {
    }

    public Equipe(String nom, String Description, Date dateCreation, ChefEquipe ChefEquipe, Laboratoire laboratoire, CentreRecherche centreRecherche) {
        this.nom = nom;
        this.Description = Description;
        this.dateCreation = dateCreation;
        this.ChefEquipe = ChefEquipe;
        this.laboratoire = laboratoire;
        this.centreRecherche = centreRecherche;
    }

    
    
    
    public long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return Description;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public ChefEquipe getChefEquipe() {
        return ChefEquipe;
    }

    public Laboratoire getLaboratoire() {
        return laboratoire;
    }

    public CentreRecherche getCentreRecherche() {
        return centreRecherche;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setChefEquipe(ChefEquipe ChefEquipe) {
        this.ChefEquipe = ChefEquipe;
    }

    public void setLaboratoire(Laboratoire laboratoire) {
        this.laboratoire = laboratoire;
    }

    public void setCentreRecherche(CentreRecherche centreRecherche) {
        this.centreRecherche = centreRecherche;
    }

    public Set<DomaineRecherche> getListDomaines() {
        return listDomaines;
    }

    public void setListDomaines(Set<DomaineRecherche> listDomaines) {
        this.listDomaines = listDomaines;
    }

    public Set<Membre> getListDesMembres() {
        return listDesMembres;
    }

    public void setListDesMembres(Set<Membre> listDesMembres) {
        this.listDesMembres = listDesMembres;
    }
    
    
    
}
