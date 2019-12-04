/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum;

import forum.Utilisateur.CategorieUtilisateur;

/**
 *
 * @author CRM
 */
public class Utilisateur {
    
    private String prenom;
    private String nom;
    private String statut;
    

    public Utilisateur(String prenom, String nom, CategorieUtilisateur statut) {
        this.prenom = prenom;
        this.nom = nom;
        this.statut = statut.toString();
    }

    
   
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
    
    @Override
    public String toString(){
        
        return "Utilisateur :"+" "+prenom+" "+nom+" "+statut;
    }
    
    
  public enum CategorieUtilisateur {
      MODERATEUR,
      STANDARD
      
  }
}
