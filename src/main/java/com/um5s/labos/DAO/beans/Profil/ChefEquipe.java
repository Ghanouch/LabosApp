/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.um5s.labos.DAO.beans.Profil;

import com.um5s.labos.DAO.beans.Travail.Equipe;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author l.IsSaM.l
 */
@Entity
@DiscriminatorValue(value = "Chef_Equipe")
public class ChefEquipe extends Utilisateur{



    public ChefEquipe(String nom, String prenom, String login, String password, String email, String tel, String titre, String ville, String pays, String resume, String photo) {
        super(nom, prenom, login, password, email, tel, titre, ville, pays, resume, photo);
    }

    public ChefEquipe(String nom, String prenom, String login, String password) {
        super(nom, prenom, login, password);
    }

    public ChefEquipe() {
    }
    
    
    
}
