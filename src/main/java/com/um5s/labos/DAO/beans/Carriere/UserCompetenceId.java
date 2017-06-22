/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.um5s.labos.DAO.beans.Carriere;

import com.um5s.labos.DAO.beans.Profil.Utilisateur;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

/**
 *
 * @author l.IsSaM.l
 */
@Embeddable
public class UserCompetenceId implements Serializable{
    
    private Utilisateur utilisateur;
    private Competence competence;

    @ManyToOne
    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    @ManyToOne
    public Competence getCompetence() {
        return competence;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public void setCompetence(Competence competence) {
        this.competence = competence;
    }
    
    
    
}
