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
public class Publication {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titre;
    private Date datePublication;
    private String description;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "User_Id")
    Utilisateur utilisateur;
    
    public Publication() {
    }

    public Publication(String titre, Date datePublication, String description) {
        this.titre = titre;
        this.datePublication = datePublication;
        this.description = description;
    }
    
    

    public long getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public Date getDatePublication() {
        return datePublication;
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

    public void setDatePublication(Date datePublication) {
        this.datePublication = datePublication;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    @Override
    public String toString() {
        return "Publication{" + "id=" + id + ", titre=" + titre + ", datePublication=" + datePublication + ", description=" + description + '}';
    }
    
    
    
}
