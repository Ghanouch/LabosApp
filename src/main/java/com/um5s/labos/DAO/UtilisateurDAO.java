/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.um5s.labos.DAO;

import com.um5s.labos.DAO.beans.Carriere.Publication;
import com.um5s.labos.DAO.beans.Profil.Utilisateur;
import com.um5s.labos.utils.HibernateUtil;
import org.hibernate.Session;

import java.util.List;
import java.util.Set;

/**
 *
 * @author l.IsSaM.l
 */


public class UtilisateurDAO implements IDAOGeneric<Utilisateur> {

    private Session session = HibernateUtil.getSessionFactory().openSession();

    @Override
    public void ajouter(Utilisateur u) {
        session.getTransaction().begin();
        session.save(u);
        session.getTransaction().commit();
    }

    @Override
    public Utilisateur modifier(Utilisateur u) {
        Utilisateur ut = null;
        session.getTransaction().begin();
        ut = (Utilisateur) session.merge(u);
        session.getTransaction().commit();
        return ut;
    }

    @Override
    public void supprimer(Utilisateur u) {
        session.getTransaction().begin();
        session.delete(u);
        session.getTransaction().commit();
    }

    @Override
    public List<Utilisateur> getAll()
    {
        return session.createQuery("from Utilisateur").list();
    }

    @Override
    public Utilisateur parID(long id) {
        return (Utilisateur) session.load(Utilisateur.class, id);
    }



    public void close()
    {
        session.close();
    }

    public Set<Publication> AllPublications(Utilisateur u)
    {
        return u.getListDesPublications();
    }
}
