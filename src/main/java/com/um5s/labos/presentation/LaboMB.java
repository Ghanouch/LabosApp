package com.um5s.labos.presentation;

import com.um5s.labos.DAO.GenericDAO;
import com.um5s.labos.DAO.beans.Profil.AdministrateurLabo;
import com.um5s.labos.DAO.beans.Profil.ChefEquipe;
import com.um5s.labos.DAO.beans.Travail.Laboratoire;
import com.um5s.labos.service.ServiceGeneric;

import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import java.util.List;

/**
 * Created by l.IsSaM.l on 26/06/2017.
 */
@ManagedBean
public class LaboMB implements Serializable {

    ServiceGeneric<Laboratoire> serviceLabo = new ServiceGeneric<Laboratoire>(new GenericDAO<Laboratoire>(Laboratoire.class));
    ServiceGeneric<AdministrateurLabo> serviceAdminLabo = new ServiceGeneric<AdministrateurLabo>(new GenericDAO<AdministrateurLabo>(AdministrateurLabo.class));

    List<AdministrateurLabo> list_Of_admin_labo;
    private String idAdmin;

    public LaboMB()
    {
        list_Of_admin_labo = serviceAdminLabo.getAll();
    }

    String description, nom , adresse;

    public String addLabo()
    {
        Laboratoire labo = new Laboratoire(nom,adresse,description);
        AdministrateurLabo adminLabo = serviceAdminLabo.parID(Long.parseLong(idAdmin));
        labo.setAdministrateurLabo(adminLabo);
        serviceLabo.ajouter(labo);
        return "labos";
    }




    public ServiceGeneric<Laboratoire> getServiceLabo() {
        return serviceLabo;
    }

    public String getDescription() {
        return description;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setServiceLabo(ServiceGeneric<Laboratoire> serviceLabo) {
        this.serviceLabo = serviceLabo;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public ServiceGeneric<AdministrateurLabo> getServiceAdminLabo() {
        return serviceAdminLabo;
    }

    public List<AdministrateurLabo> getList_Of_admin_labo() {
        return list_Of_admin_labo;
    }

    public void setServiceAdminLabo(ServiceGeneric<AdministrateurLabo> serviceAdminLabo) {
        this.serviceAdminLabo = serviceAdminLabo;
    }

    public void setList_Of_admin_labo(List<AdministrateurLabo> list_Of_admin_labo) {
        this.list_Of_admin_labo = list_Of_admin_labo;
    }

    public String getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
    }
}
