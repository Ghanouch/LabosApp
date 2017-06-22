/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.um5s.labos.DAO.beans.Profil;

import com.um5s.labos.DAO.beans.Travail.Laboratoire;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author l.IsSaM.l
 */
@Entity
public class AdministrateurLabo extends Utilisateur{
    
    
    @OneToOne
    @JoinColumn(name = "Admin_Labo_ID")
    private Laboratoire laboratoire;

    public AdministrateurLabo(String nom, String prenom, String login, String password, String email, String tel, String titre, String ville, String pays, String resume, String photo) {
        super(nom, prenom, login, password, email, tel, titre, ville, pays, resume, photo);
    }

    public AdministrateurLabo(String nom, String prenom, String login, String password) {
        super(nom, prenom, login, password);
    }

    public AdministrateurLabo() {
    }

    public Laboratoire getLaboratoire() {
        return laboratoire;
    }

    public void setLaboratoire(Laboratoire laboratoire) {
        this.laboratoire = laboratoire;
    }
    
  
    
    
}
