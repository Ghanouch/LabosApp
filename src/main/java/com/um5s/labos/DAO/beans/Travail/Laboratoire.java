/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.um5s.labos.DAO.beans.Travail;


import com.um5s.labos.DAO.beans.Profil.AdministrateurLabo;

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
public class Laboratoire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Labo_ID")
    private long id;
    private String nom;
    private String adresse;
    private String Description;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Centre_ID")
    private CentreRecherche centreRecherche;

    @OneToOne
    @JoinColumn(name="User_id")
    private AdministrateurLabo administrateurLabo;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "Labo_ID")
    private Set<Equipe> listEquipes = new HashSet<Equipe>();

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "Labo_ID")
    private Set<DomaineRecherche> listDomaines = new HashSet<DomaineRecherche>();

    public Laboratoire(String nom, String adresse, String Description) {
        this.nom = nom;
        this.adresse = adresse;
        this.Description = Description;
    }

    public Laboratoire() {
    }


    public long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getDescription() {
        return Description;
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

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public void setCentreRecherche(CentreRecherche centreRecherche) {
        this.centreRecherche = centreRecherche;
    }

    public AdministrateurLabo getAdministrateurLabo() {
        return administrateurLabo;
    }

    public void setAdministrateurLabo(AdministrateurLabo administrateurLabo) {
        this.administrateurLabo = administrateurLabo;
    }



    @Override
    public String toString() {
        return "Laboratoire{" + "id=" + id + ", nom=" + nom + ", adresse=" + adresse + ", Description=" + Description + ", centreRecherche=" + centreRecherche + '}';
    }

    public Set<Equipe> getListEquipes() {
        return listEquipes;
    }

    public void setListEquipes(Set<Equipe> listEquipes) {
        this.listEquipes = listEquipes;
    }

    public Set<DomaineRecherche> getListDomaines() {
        return listDomaines;
    }

    public void setListDomaines(Set<DomaineRecherche> listDomaines) {
        this.listDomaines = listDomaines;
    }


}
