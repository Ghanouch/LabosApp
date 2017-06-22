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
public class Certification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String autorite;
    private String licence_id;
    private Date dateDebut;
    private Date dateFin;
    private String Url;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "User_Id")
    private Utilisateur utilisateur;
    
    public Certification(String autorite, String licence_id, Date dateDebut, Date dateFin, String Url) {
        this.autorite = autorite;
        this.licence_id = licence_id;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.Url = Url;
    }

    public Certification() {
    }
    
     public Certification(String autorite, String licence_id) {
        this.autorite = autorite;
        this.licence_id = licence_id;
    }

    

    public long getId() {
        return id;
    }

   
    public String getAutorite() {
        return autorite;
    }

    public String getLicence_id() {
        return licence_id;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public String getUrl() {
        return Url;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setAutorite(String autorite) {
        this.autorite = autorite;
    }

    public void setLicence_id(String licence_id) {
        this.licence_id = licence_id;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public void setUrl(String Url) {
        this.Url = Url;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
    
    
    
    
    
}
