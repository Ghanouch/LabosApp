package com.um5s.labos.service;

import com.um5s.labos.DAO.IDAOGeneric;

import java.util.List;

/**
 * Created by l.IsSaM.l on 26/06/2017.
 */
public class ServiceGeneric<T> implements IServiceGeneric<T> {

    IDAOGeneric<T> DaoGeneric;

    public ServiceGeneric(IDAOGeneric<T> daoGeneric) {
        DaoGeneric = daoGeneric;
    }

    @Override
    public void ajouter(T u) {
        DaoGeneric.ajouter(u);
    }

    @Override
    public T modifier(T u) {
        return DaoGeneric.modifier(u);
    }

    @Override
    public void supprimer(T u) {
        DaoGeneric.supprimer(u);
    }

    @Override
    public List<T> getAll() {
       return  DaoGeneric.getAll();
    }

    @Override
    public T parID(long id) {
        return DaoGeneric.parID(id);
    }
}
