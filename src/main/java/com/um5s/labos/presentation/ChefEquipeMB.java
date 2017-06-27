package com.um5s.labos.presentation;

import com.um5s.labos.DAO.GenericDAO;
import com.um5s.labos.DAO.beans.Profil.ChefEquipe;
import com.um5s.labos.service.ServiceGeneric;

import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by l.IsSaM.l on 27/06/2017.
 */
@ManagedBean
public class ChefEquipeMB implements Serializable {

    ServiceGeneric<ChefEquipe> serviceChefEquipe = new ServiceGeneric<ChefEquipe>(new GenericDAO<ChefEquipe>(ChefEquipe.class));
    ChefEquipe SelectedchefEquipe;

    private List<ChefEquipe> listOfChefEquipe;
    private List<ChefEquipe> filteredCE;

    private List<String> listOfCities;

    public ChefEquipeMB()
    {
        listOfChefEquipe  = listOfChefEquipe = serviceChefEquipe.getAll();
        fillCities();

    }

    public void fillCities()
    {
        listOfCities = new ArrayList<String>();
        for(ChefEquipe e : listOfChefEquipe)
            listOfCities.add(e.getVille());
    }

    public ChefEquipe getSelectedchefEquipe() {
        return SelectedchefEquipe;
    }

    public List<ChefEquipe> getListOfChefEquipe() {

        return listOfChefEquipe;
    }

    public void setServiceChefEquipe(ServiceGeneric<ChefEquipe> serviceChefEquipe) {
        this.serviceChefEquipe = serviceChefEquipe;
    }

    public void setSelectedchefEquipe(ChefEquipe selectedchefEquipe) {
        this.SelectedchefEquipe = selectedchefEquipe;
    }

    public void setListOfChefEquipe(List<ChefEquipe> listOfChefEquipe) {
        this.listOfChefEquipe = listOfChefEquipe;
    }

    public ServiceGeneric<ChefEquipe> getServiceChefEquipe() {
        return serviceChefEquipe;
    }

    public List<ChefEquipe> getFilteredCE() {
        return filteredCE;
    }

    public void setFilteredCE(List<ChefEquipe> filteredCE) {
        this.filteredCE = filteredCE;
    }

    public List<String> getListOfCities() {
        return listOfCities;
    }

    public void setListOfCities(List<String> listOfCities) {
        this.listOfCities = listOfCities;
    }
}
