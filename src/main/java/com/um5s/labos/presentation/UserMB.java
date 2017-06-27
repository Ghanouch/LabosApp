package com.um5s.labos.presentation;

import com.um5s.labos.DAO.GenericDAO;
import com.um5s.labos.DAO.beans.Profil.AdministrateurLabo;
import com.um5s.labos.DAO.beans.Profil.ChefEquipe;
import com.um5s.labos.DAO.beans.Profil.Membre;
import com.um5s.labos.DAO.beans.Profil.Utilisateur;
import com.um5s.labos.service.ServiceGeneric;

import javax.faces.bean.ManagedBean;
import java.io.Serializable;

/**
 * Created by l.IsSaM.l on 26/06/2017.
 */
@ManagedBean
public class UserMB implements Serializable {

    ServiceGeneric<ChefEquipe> serviceChefEquipe = new ServiceGeneric<ChefEquipe>(new GenericDAO<ChefEquipe>(ChefEquipe.class));
    ServiceGeneric<AdministrateurLabo> serviceAdminLabo = new ServiceGeneric<AdministrateurLabo>(new GenericDAO<AdministrateurLabo>(AdministrateurLabo.class));
    ServiceGeneric<Membre> serviceMembreSimple = new ServiceGeneric<Membre>(new GenericDAO<Membre>(Membre.class));


    private String typeUser;
    private Utilisateur user;
    private String name, prenom, login,passwd, ville, pays, mail, tel, titre, resume;

    /* Affichage des membres */

    public void AddUser()
    {
        int typeUtilisateur = Integer.parseInt(typeUser);

        switch(typeUtilisateur)
        {
            case 1:
                ChefEquipe CE = new ChefEquipe(name, prenom, login,passwd, mail, tel, titre, ville, pays, resume,"lien");
                serviceChefEquipe.ajouter(CE);
                break;
            case 2:
                AdministrateurLabo AL = new AdministrateurLabo(name, prenom, login,passwd, mail, tel, titre, ville, pays, resume,"lien");
                serviceAdminLabo.ajouter(AL);
                break;
            case 3:
                Membre mm = new Membre(name, prenom, login,passwd, mail, tel, titre, ville, pays, resume,"lien");
                serviceMembreSimple.ajouter(mm);
                break;
        }

    }

    public String getTypeUser() {
        return typeUser;
    }

    public Utilisateur getUser() {
        return user;
    }

    public void setTypeUser(String typeUser) {
        this.typeUser = typeUser;
    }

    public void setUser(Utilisateur user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getLogin() {
        return login;
    }

    public String getPasswd() {
        return passwd;
    }

    public String getVille() {
        return ville;
    }

    public String getPays() {
        return pays;
    }

    public String getMail() {
        return mail;
    }

    public String getTel() {
        return tel;
    }

    public String getTitre() {
        return titre;
    }

    public String getResume() {
        return resume;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }
}
