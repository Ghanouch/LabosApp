package com.um5s.labos.presentation.landpage.labos;

/**
 * Created by zGuindouOS on 27/06/2017.
 */
import com.um5s.labos.DAO.GenericDAO;
import com.um5s.labos.DAO.beans.Travail.Laboratoire;
import com.um5s.labos.service.ServiceGeneric;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class DataGridView implements Serializable {

    private List<Laboratoire> labos;

    private Laboratoire selectedLabo;

    private ServiceGeneric<Laboratoire> LabosService = new ServiceGeneric<Laboratoire>(new GenericDAO<Laboratoire>(Laboratoire.class));

    @PostConstruct
    public void init() {
        labos = LabosService.getAll();
    }

    public List<Laboratoire> getLabos() {
        return labos;
    }

    public Laboratoire getSelectedLabo() {
        return selectedLabo;
    }

    public void setSelectedLabo(Laboratoire selectedLabo) {
        this.selectedLabo = selectedLabo;
    }
}