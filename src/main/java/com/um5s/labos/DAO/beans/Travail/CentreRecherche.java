/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.um5s.labos.DAO.beans.Travail;

import com.um5s.labos.DAO.beans.Profil.SuperAdmin;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author l.IsSaM.l
 */
@Entity
public class CentreRecherche {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Centre_ID")
    private long id;
    private String name;
    private String adresse;
    private String tel;
    private String email;
    private String description ;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "User_Id")
    private SuperAdmin superAdmin;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "Labo_ID")    
    private Set<Laboratoire> listLaboratoires = new HashSet<Laboratoire>();
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "Equipe_ID")    
    private Set<Equipe> listEquipes = new HashSet<Equipe>();

    public CentreRecherche() {
    }

    public CentreRecherche(String name) {
        this.name = name;
    }

    public CentreRecherche(String name, String adresse, String tel, String email, String description) {
        this.name = name;
        this.adresse = adresse;
        this.tel = tel;
        this.email = email;
        this.description = description;
    }

    
    
    public long getId() {
        return id;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getTel() {
        return tel;
    }

    public String getEmail() {
        return email;
    }

    public String getDescription() {
        return description;
    }

    public SuperAdmin getSuperAdmin() {
        return superAdmin;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSuperAdmin(SuperAdmin superAdmin) {
        this.superAdmin = superAdmin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CentreRecherche{" + "id=" + id + ", name=" + name + ", adresse=" + adresse + ", tel=" + tel + ", email=" + email + ", description=" + description + ", superAdmin=" + superAdmin + '}';
    }

 
    
    

 

    public Set<Laboratoire> getListLaboratoires() {
        return listLaboratoires;
    }

    public Set<Equipe> getListEquipes() {
        return listEquipes;
    }

    public void setListLaboratoires(Set<Laboratoire> listLaboratoires) {
        this.listLaboratoires = listLaboratoires;
    }

    public void setListEquipes(Set<Equipe> listEquipes) {
        this.listEquipes = listEquipes;
    }
    
    
    
    
}
