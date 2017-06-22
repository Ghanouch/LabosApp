/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.um5s.labos.DAO;

import com.um5s.labos.DAO.beans.Carriere.Publication;
import com.um5s.labos.DAO.beans.Profil.Utilisateur;

import java.util.List;
import java.util.Set;

/**
 *
 * @author l.IsSaM.l
 */
public interface IUtilisateurDAO {
    
    void ajouter(Utilisateur u);
    Utilisateur modifier(Utilisateur u);
    void supprimer(Utilisateur u);
    List<Utilisateur> getAll();
    Utilisateur parID(long id);
    
    Set<Publication> AllPublications(Utilisateur u);
    
}
