/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.um5s.labos.DAO;

import java.util.List;

import com.um5s.labos.utils.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author l.IsSaM.l
 */
public class GenericDAO<T> implements IDAOGeneric<T> {

    private String nomClass;
    Class classname;
    private T clzz;
    private Session session = HibernateUtil.getSessionFactory().openSession();

    public GenericDAO(String nomClass , Class classname){

        try{
            this.nomClass = nomClass;
            this.classname = classname;
            //clzz = (T) Class.forName("beans.Carriere." + nomClass).newInstance();
        } catch(Exception e)
        {
            e.printStackTrace();
        }
    }


    public GenericDAO(Class classname){
        try{
            this.classname = classname;
            nomClass = classname.getName().toString();
            //clzz = (T) Class.forName("beans.Profil."+nomClass).newInstance();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }





    public void ajouter(T u) {
        session.getTransaction().begin();
        session.save(u);
        session.getTransaction().commit();
    }


    public T modifier(T u) {
        T ut = null;
        session.getTransaction().begin();
        ut = (T) session.merge(u);
        session.getTransaction().commit();
        return ut;
    }

    public void supprimer(T u) {
        session.getTransaction().begin();
        session.delete(u);
        session.getTransaction().commit();
    }

    public List<T> getAll()
    {
        String type = this.getClass().getName();
        return session.createQuery("from " +nomClass).list();
    }


    public T parID(long id){

        return (T) session.load(classname, id);


    }

    public void close()
    {
        session.close();
    }
}
