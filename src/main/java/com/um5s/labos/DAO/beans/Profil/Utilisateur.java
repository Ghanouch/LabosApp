/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.um5s.labos.DAO.beans.Profil;


import com.um5s.labos.DAO.beans.Carriere.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author l.IsSaM.l
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TypeUser")
public abstract class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "User_Id")
    private long id;
    private String nom;
    private String prenom;
    private String login;
    private String password;
    private String email;
    private String tel;
    private String titre;
    private String ville;
    private String pays;
    private String resume;
    private String photo;

    @OneToMany(cascade = CascadeType.ALL ,fetch = FetchType.LAZY)
    @JoinColumn(name = "User_Id")
    private Set<Publication> listDesPublications = new HashSet<Publication>();

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "User_Id")
    private Set<Experience> listDesExperiences = new HashSet<Experience>();

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "User_Id")
    private Set<Certification> listDesCertifications = new HashSet<Certification>();

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "User_Id")
    private Set<MatiereEnseigne> listDesMatieres = new HashSet<MatiereEnseigne>();

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "User_Id")
    private Set<Projet> listDesProjets = new HashSet<Projet>();

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "User_Id")
    private Set<Divers> listDesDivers = new HashSet<Divers>();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY , mappedBy = "pk.utilisateur")
    private Set<UserComptence> userCompetences = new HashSet<UserComptence>();




    public Utilisateur(String nom, String prenom, String login, String password, String email, String tel, String titre, String ville, String pays, String resume, String photo) {
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.password = password;
        this.email = email;
        this.tel = tel;
        this.titre = titre;
        this.ville = ville;
        this.pays = pays;
        this.resume = resume;
        this.photo = photo;
    }

    public Utilisateur(String nom, String prenom, String login, String password) {
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.password = password;
    }

    public Utilisateur() {
    }



    public long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getTel() {
        return tel;
    }

    public String getTitre() {
        return titre;
    }

    public String getVille() {
        return ville;
    }

    public String getPays() {
        return pays;
    }

    public String getResume() {
        return resume;
    }

    public String getPhoto() {
        return photo;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Set<Publication> getListDesPublications() {
        return listDesPublications;
    }

    public void setListDesPublications(Set<Publication> listDesPublications) {
        this.listDesPublications = listDesPublications;
    }

    @Override
    public String toString() {
        return "Utilisateur{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", login=" + login + ", password=" + password + ", email=" + email + ", tel=" + tel + ", titre=" + titre + ", ville=" + ville + ", pays=" + pays + ", resume=" + resume + ", photo=" + photo + '}';
    }

    public Set<Experience> getListDesExperiences() {
        return listDesExperiences;
    }

    public void setListDesExperiences(Set<Experience> listDesExperiences) {
        this.listDesExperiences = listDesExperiences;
    }

    public Set<Certification> getListDesCertifications() {
        return listDesCertifications;
    }

    public void setListDesCertifications(Set<Certification> listDesCertifications) {
        this.listDesCertifications = listDesCertifications;
    }

    public Set<MatiereEnseigne> getListDesMatieres() {
        return listDesMatieres;
    }

    public void setListDesMatieres(Set<MatiereEnseigne> listDesMatieres) {
        this.listDesMatieres = listDesMatieres;
    }

    public Set<Projet> getListDesProjets() {
        return listDesProjets;
    }

    public void setListDesProjets(Set<Projet> listDesProjets) {
        this.listDesProjets = listDesProjets;
    }

    public Set<Divers> getListDesDivers() {
        return listDesDivers;
    }

    public void setListDesDivers(Set<Divers> listDesDivers) {
        this.listDesDivers = listDesDivers;
    }

    public Set<UserComptence> getUserCompetences() {
        return userCompetences;
    }

    public void setUserCompetences(Set<UserComptence> userCompetences) {
        this.userCompetences = userCompetences;
    }









}
