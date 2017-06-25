/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.um5s.labos.DAO.beans.Carriere;

import com.um5s.labos.DAO.beans.Profil.Utilisateur;

import java.util.Date;
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
public class Projet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private Date dateDepart;
    private Date dateFin;
    private String URL;
    private String description;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "User_Id")
    private Utilisateur utilisateur;

    public Projet(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Projet() {
    }

    public Projet(String name, Date dateDepart, Date dateFin, String URL, String description, Utilisateur utilisateur) {
        this.name = name;
        this.dateDepart = dateDepart;
        this.dateFin = dateFin;
        this.URL = URL;
        this.description = description;
        this.utilisateur = utilisateur;
    }



    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public String getURL() {
        return URL;
    }

    public String getDescription() {
        return description;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
    
}
