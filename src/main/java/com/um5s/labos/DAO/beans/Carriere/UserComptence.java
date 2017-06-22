/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.um5s.labos.DAO.beans.Carriere;

import com.um5s.labos.DAO.beans.Profil.Utilisateur;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Transient;

/**
 *
 * @author l.IsSaM.l
 */
@Entity
@AssociationOverrides({
		@AssociationOverride(name = "pk.utilisateur",
			joinColumns = @JoinColumn(name = "User_Id")),
		@AssociationOverride(name = "pk.competence",
			joinColumns = @JoinColumn(name = "Compt_ID")) })
public class UserComptence {
    
    private UserCompetenceId pk = new UserCompetenceId();
    private int Niveau;

    @EmbeddedId
    public UserCompetenceId getPk() {
        return pk;
    }

    public int getNiveau() {
        return Niveau;
    }

    public void setPk(UserCompetenceId pk) {
        this.pk = pk;
    }

    public void setNiveau(int Niveau) {
        this.Niveau = Niveau;
    }
    
    @Transient
    public Utilisateur getUser()
    {
        return pk.getUtilisateur();
    }
    
    @Transient
     public Competence getCompetence()
    {
        return pk.getCompetence();
    }
     
     public void setCompetence(Competence c)
     {
         getPk().setCompetence(c);
     }
    
    public void setUser(Utilisateur e)
    {
        getPk().setUtilisateur(e);
    }
}
