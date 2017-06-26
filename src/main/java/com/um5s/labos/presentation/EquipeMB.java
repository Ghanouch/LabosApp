package com.um5s.labos.presentation;

import com.um5s.labos.DAO.GenericDAO;
import com.um5s.labos.DAO.beans.Profil.ChefEquipe;
import com.um5s.labos.DAO.beans.Travail.Equipe;
import com.um5s.labos.DAO.beans.Travail.Laboratoire;
import com.um5s.labos.service.ServiceGeneric;

import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import java.util.List;

/**
 * Created by l.IsSaM.l on 26/06/2017.
 */
@ManagedBean
public class EquipeMB implements Serializable {

    ServiceGeneric<Equipe> serviceEquipe = new ServiceGeneric<Equipe>(new GenericDAO<Equipe>(Equipe.class));
    ServiceGeneric<ChefEquipe> serviceChefEquipe = new ServiceGeneric<ChefEquipe>(new GenericDAO<ChefEquipe>(ChefEquipe.class));
    ServiceGeneric<Laboratoire> serviceLabo = new ServiceGeneric<Laboratoire>(new GenericDAO<Laboratoire>(Laboratoire.class));

    List<Laboratoire> list_of_labo ;
    List<ChefEquipe> list_Of_CE ;

    private String idCE;
    private String idLab;
    private String nom, description, dateCreation ;

    public EquipeMB() {
        list_Of_CE  = serviceChefEquipe.getAll();
        list_of_labo= serviceLabo.getAll();
    }

    public String addEquipe()
    {
        ChefEquipe CE = serviceChefEquipe.parID(Long.parseLong(idCE));
        Equipe equipe = new Equipe(nom,description,null);
        equipe.setChefEquipe(CE);

        // On doit tester Si l équipe est lié à un labo ou pas / Si 0 alors il est lié au centre
        if(Long.parseLong(idLab) != 0 )
            equipe.setLaboratoire(serviceLabo.parID(Long.parseLong(idLab)));

        serviceEquipe.ajouter(equipe);
        return "teams";

    }

    public ServiceGeneric<Equipe> getServiceEquipe() {
        return serviceEquipe;
    }

    public ServiceGeneric<ChefEquipe> getServiceChefEquipe() {
        return serviceChefEquipe;
    }

    public ServiceGeneric<Laboratoire> getServiceLabo() {
        return serviceLabo;
    }

    public List<Laboratoire> getList_of_labo() {
        return list_of_labo;
    }

    public List<ChefEquipe> getList_Of_CE() {
        return list_Of_CE;
    }

    public void setServiceEquipe(ServiceGeneric<Equipe> serviceEquipe) {
        this.serviceEquipe = serviceEquipe;
    }

    public void setServiceChefEquipe(ServiceGeneric<ChefEquipe> serviceChefEquipe) {
        this.serviceChefEquipe = serviceChefEquipe;
    }

    public void setServiceLabo(ServiceGeneric<Laboratoire> serviceLabo) {
        this.serviceLabo = serviceLabo;
    }

    public void setList_of_labo(List<Laboratoire> list_of_labo) {
        this.list_of_labo = list_of_labo;
    }

    public void setList_Of_CE(List<ChefEquipe> list_Of_CE) {
        this.list_Of_CE = list_Of_CE;
    }

    public String getIdCE() {
        return idCE;
    }

    public void setIdCE(String idCE) {
        this.idCE = idCE;
    }

    public void setIdLab(String idLab) {
        this.idLab = idLab;
    }

    public String getIdLab() {
        return idLab;
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }
}
