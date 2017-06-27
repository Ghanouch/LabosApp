package com.um5s.labos.presentation;

import com.um5s.labos.DAO.GenericDAO;
import com.um5s.labos.DAO.beans.Profil.AdministrateurLabo;
import com.um5s.labos.DAO.beans.Profil.ChefEquipe;
import com.um5s.labos.service.ServiceGeneric;

import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import java.util.List;

/**
 * Created by l.IsSaM.l on 27/06/2017.
 */
@ManagedBean
public class ChefLaboMB implements Serializable {

    ServiceGeneric<AdministrateurLabo> serviceAdministrateurLabo = new ServiceGeneric<AdministrateurLabo>(new GenericDAO<AdministrateurLabo>(AdministrateurLabo.class));
    ChefEquipe SelectedAdministrateurLabo;


    private List<AdministrateurLabo> listOfAdministrateurLabo;

    public ChefLaboMB()
    {
        listOfAdministrateurLabo  = serviceAdministrateurLabo.getAll();

    }


    public ServiceGeneric<AdministrateurLabo> getServiceAdministrateurLabo() {
        return serviceAdministrateurLabo;
    }

    public ChefEquipe getSelectedAdministrateurLabo() {
        return SelectedAdministrateurLabo;
    }

    public List<AdministrateurLabo> getListOfAdministrateurLabo() {
        return listOfAdministrateurLabo;
    }

    public void setServiceAdministrateurLabo(ServiceGeneric<AdministrateurLabo> serviceAdministrateurLabo) {
        this.serviceAdministrateurLabo = serviceAdministrateurLabo;
    }

    public void setSelectedAdministrateurLabo(ChefEquipe selectedAdministrateurLabo) {
        SelectedAdministrateurLabo = selectedAdministrateurLabo;
    }

    public void setListOfAdministrateurLabo(List<AdministrateurLabo> listOfAdministrateurLabo) {
        this.listOfAdministrateurLabo = listOfAdministrateurLabo;
    }
}
