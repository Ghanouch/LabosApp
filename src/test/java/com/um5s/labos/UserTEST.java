/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.um5s.labos;


import com.um5s.labos.DAO.GenericDAO;
import com.um5s.labos.DAO.UtilisateurDAO;
import com.um5s.labos.DAO.beans.Carriere.*;
import com.um5s.labos.DAO.beans.Profil.ChefEquipe;
import com.um5s.labos.DAO.beans.Profil.Utilisateur;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author l.IsSaM.l
 */
public class UserTEST {
    
    public static void main(String[] str)
    {
          

    }
    
    public static void TEST_CARRIER()
    {
        UtilisateurDAO useDAO = new UtilisateurDAO();
        
        GenericDAO<Publication> publicationDAO = new  GenericDAO<Publication>(Publication.class);
        GenericDAO<Experience>  experienceDAO  = new  GenericDAO<Experience>(Experience.class);
        GenericDAO<Certification> certCarriereDAO = new GenericDAO<Certification>(Certification.class);
      
        Publication p = new  Publication("titre", null, "description");
        Certification cer = new Certification("jj", "kjj");
        certCarriereDAO.ajouter(cer);
        
        publicationDAO.ajouter(p);
        p.setDescription("kkkkk");
        publicationDAO.modifier(p);
       // publicationDAO.supprimer(p);
       Publication p2 = new  Publication("titre_2", null, "description_2");
       publicationDAO.ajouter(p2);
       
       for(Publication p__ : publicationDAO.getAll())
            System.out.println(p__);

        System.out.println(publicationDAO.parID(2l));
    }
    
    private static void TEST_user_1()
    {
         UtilisateurDAO useDAO = new UtilisateurDAO();
        
        GenericDAO<Publication> publicationDAO = new  GenericDAO<Publication>("Publication",Publication.class);
        GenericDAO<Experience>  experienceDAO  = new  GenericDAO<Experience>("Experience",Exception.class);
        
        Utilisateur u = new ChefEquipe("GHANOUCH", "issam", "login", "passwd");
        
        /* Publication */
        Set<Publication> setP = new HashSet<Publication>();
        Publication p = new  Publication("titre", null, "description");
        Publication p2 = new Publication("titre2", null, "description2");
        Publication p3 = new Publication("titre3", null, "description3");
        
        publicationDAO.ajouter(new  Publication("titretitre", null, "descriptiontitre"));
        setP.add(p);
        setP.add(p2);
        setP.add(p3);
        
        /* Experiences */
        Experience e = new Experience("jjj", "kkk");
        Set<Experience> setE = new HashSet<Experience>();
        setE.add(e);
        
        u.setListDesExperiences(setE);
        u.setListDesPublications(setP);
        
        useDAO.ajouter(u);
        
        
        Utilisateur u1 = useDAO.parID(1);
        System.out.println(u1);
        
        System.out.println("-------- Ici la liste des Competence :");
        
        for ( UserComptence e_ : u1.getUserCompetences())
        {
            System.out.println(e_.getCompetence());
        }
        
        
        for ( Publication pub : u1.getListDesPublications())
            System.out.println(pub);
        
        
        System.out.println(" Voila ----------- ");
        for ( Experience ex : u1.getListDesExperiences())
            System.out.println(ex);
        
        
        
        useDAO.close();
    }
    
    
    public static void TEST_Association_UserCompetence()
    {
        GenericDAO<Competence> competenceDAO = new  GenericDAO<Competence>(Competence.class);
             UtilisateurDAO useDAO = new UtilisateurDAO();

             Utilisateur u = new ChefEquipe("GHANOUCH", "issam", "login", "passwd");
             Utilisateur u1 = new ChefEquipe("SENNANE", "TAWFIK", "login_1", "passwd_1");
             
             Competence comp = new Competence("JAVA");
             Competence comp2 = new Competence("C++");
             competenceDAO.ajouter(comp);
             competenceDAO.ajouter(comp2);
             
             
             UserComptence userComptence = new UserComptence();
             userComptence.setCompetence(comp);
             userComptence.setUser(u);
             userComptence.setNiveau(5);

             u.getUserCompetences().add(userComptence); 
             //u.getUserCompetences().remove(userComptence);
             useDAO.ajouter(u);
             
             UserComptence userComptence_2 = new UserComptence();
             userComptence_2.setCompetence(comp2);
             userComptence_2.setUser(u);
             userComptence_2.setNiveau(3);
             
             u.getUserCompetences().add(userComptence_2);
             useDAO.ajouter(u);

             
             u1.getUserCompetences().add(userComptence_2);
             useDAO.ajouter(u1);
    }
}
