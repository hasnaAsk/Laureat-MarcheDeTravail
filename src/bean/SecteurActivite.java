/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author HP A6
 */
@Entity
public class SecteurActivite implements Serializable {

   

 
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    @OneToMany(mappedBy = "secteurActivite")
    private List<Societe> societes;
    @OneToMany(mappedBy = "secteurActivite")
    private List<Embauche> embauches;

    public SecteurActivite(Long id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public SecteurActivite() {
    }

    public SecteurActivite(String nom) {
        this.nom = nom;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Societe> getSocietes() {
        return societes;
    }

    public void setSocietes(List<Societe> societes) {
        this.societes = societes;
    }

    public List<Embauche> getEmbauches() {
        return embauches;
    }

    public void setEmbauches(List<Embauche> embauches) {
        this.embauches = embauches;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SecteurActivite)) {
            return false;
        }
        SecteurActivite other = (SecteurActivite) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SecteurActivite{" + "id=" + id + ", nom=" + nom + '}';
    }

        
}
