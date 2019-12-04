/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author CRM
 */
public final class Message {
    
    private String titre;
    private String texte;
    private Date dateCreation;
    private final Utilisateur utilisateur;
    private  Forum forum;
    

    public Message(String titre, String texte, Utilisateur utilisateur) {
        this.titre = titre;
        this.texte = texte;
        this.dateCreation = new Date();;
        this.utilisateur = utilisateur;
        this.forum=forum;
    }

    
   
    
    
    
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public String getDateCreation() {
        
        DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);
        return df.format(dateCreation);
    }

   

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

  
    @Override
     public String toString(){
        
        return titre+"--"+texte+"\nDate de création "+getDateCreation()+"\n"+this.utilisateur;
        
    }
    
    public String getAuteur(){
        
        
        return utilisateur.getPrenom()+" "+ utilisateur.getNom()+" "+utilisateur.getStatut();
        
    }
     
    
}
