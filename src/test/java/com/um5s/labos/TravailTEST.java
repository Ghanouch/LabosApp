/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.um5s.labos;


import com.um5s.labos.DAO.beans.Profil.SuperAdmin;
import com.um5s.labos.DAO.beans.Profil.Utilisateur;
import com.um5s.labos.DAO.beans.Travail.CentreRecherche;

/**
 *
 * @author l.IsSaM.l
 */
public class TravailTEST {
    
    public static void main(String[] args) 
    {
            centre_Recherche();

    }
    
    public static void centre_Recherche()
    {
         GenericDAO<CentreRecherche>  experienceDAO  = new  GenericDAO<CentreRecherche>(CentreRecherche.class);
         GenericDAO<Utilisateur> userDAO = new GenericDAO<Utilisateur>(Utilisateur.class);
         CentreRecherche centreRecherche = new CentreRecherche("centre Recherche");
         
         SuperAdmin superAdmin = new SuperAdmin("Nom", "Prenom", "login", "Passw");
         centreRecherche.setSuperAdmin(superAdmin);
         
         userDAO.ajouter(superAdmin);
         experienceDAO.ajouter(centreRecherche);

         
         //for ( CentreRecherche c : experienceDAO.getAll())
            // System.out.println(c);
    }
}
