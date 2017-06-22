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
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titre;
    private String etablissement;
    private String location;
    private Date dateDepart;
    private Date dateFin;
    private String description;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "User_Id")
    private Utilisateur utilisateur;
    
    public Experience(String titre, String etablissement) {
        this.titre = titre;
        this.etablissement = etablissement;
    }

    
    
    public Experience(String titre, String etablissement, String location, Date dateDepart, Date dateFin, String description) {
        this.titre = titre;
        this.etablissement = etablissement;
        this.location = location;
        this.dateDepart = dateDepart;
        this.dateFin = dateFin;
        this.description = description;
    }

    public Experience() {
    }

    
    
    public long getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public String getEtablissement() {
        return etablissement;
    }

    public String getLocation() {
        return location;
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public String getDescription() {
        return description;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setEtablissement(String etablissement) {
        this.etablissement = etablissement;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Experience{" + "id=" + id + ", titre=" + titre + ", etablissement=" + etablissement + ", location=" + location + ", dateDepart=" + dateDepart + ", dateFin=" + dateFin + ", description=" + description + '}';
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
    
    
    
    
    
}
