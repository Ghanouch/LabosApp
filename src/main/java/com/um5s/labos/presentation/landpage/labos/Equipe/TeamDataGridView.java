package com.um5s.labos.presentation.landpage.labos.Equipe;

import com.um5s.labos.DAO.GenericDAO;
import com.um5s.labos.DAO.beans.Travail.Equipe;
import com.um5s.labos.DAO.beans.Travail.Laboratoire;
import com.um5s.labos.service.ServiceGeneric;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.List;
import java.util.Map;


/**
 * Created by zGuindouOS on 27/06/2017.
 */
@ManagedBean
@ViewScoped
public class TeamDataGridView implements Serializable{

    private List<Equipe> teams;
    @ManagedProperty(value = "#{param.laboId}")
    private Long laboId;
    private Equipe selectedTeam;

    private ServiceGeneric<Equipe> teamsService = new ServiceGeneric<Equipe>(new GenericDAO<Equipe>(Equipe.class));

    @PostConstruct
    public void init() {
        teams = teamsService.getAll();
    }

    public Long getLaboId() {
        return laboId;
    }

    public void setLaboId(Long laboId) {
        this.laboId = laboId;
    }

    public List<Equipe> getEquipe() {
        return (List) new ServiceGeneric<Laboratoire> (new GenericDAO<Laboratoire>(Laboratoire.class))
                .parID(laboId)
                .getListEquipes();
    }

    public String printTeam() {
        teams = getEquipe();
        return "equipes";
    }

    public Equipe getSelectedTeam() {
        return selectedTeam;
    }

    public void setSelectedTeam(Equipe selectedTeam) {
        this.selectedTeam = selectedTeam;
    }

    public List<Equipe> getTeams() {
        return teams;
    }

    public void setTeams(List<Equipe> teams) {
        this.teams = teams;
    }
}
