package com.um5s.labos.presentation;

import com.um5s.labos.DAO.GenericDAO;
import com.um5s.labos.DAO.beans.Profil.Membre;
import com.um5s.labos.service.ServiceGeneric;

import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import java.util.List;

/**
 * Created by l.IsSaM.l on 27/06/2017.
 */
@ManagedBean
public class MembreMB implements Serializable {
    ServiceGeneric<Membre> serviceMembre = new ServiceGeneric<Membre>(new GenericDAO<Membre>(Membre.class));

    List<Membre> listOfMembres;
    Membre selectedMembre;

    public MembreMB() {

        this.listOfMembres = serviceMembre.getAll();
    }


    public void setServiceMembre(ServiceGeneric<Membre> serviceMembre) {
        this.serviceMembre = serviceMembre;
    }

    public void setListOfMembres(List<Membre> listOfMembres) {
        this.listOfMembres = listOfMembres;
    }

    public void setSelectedMembre(Membre selectedMembre) {
        this.selectedMembre = selectedMembre;
    }

    public ServiceGeneric<Membre> getServiceMembre() {
        return serviceMembre;
    }

    public List<Membre> getListOfMembres() {
        return listOfMembres;
    }

    public Membre getSelectedMembre() {
        return selectedMembre;
    }
}
