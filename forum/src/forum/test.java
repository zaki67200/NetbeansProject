/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum;

import java.util.Date;

/**
 *
 * @author CRM
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Forum forum = new Forum ();
        Utilisateur jean = new Utilisateur ("jean","Dupont",Utilisateur.CategorieUtilisateur.STANDARD);
        Utilisateur bernard = new Utilisateur ("Bernard","Morin",Utilisateur.CategorieUtilisateur.STANDARD);
        Utilisateur nathalie = new Utilisateur ("Nathalie","Morin",Utilisateur.CategorieUtilisateur.MODERATEUR);
        Message message1=new Message("Java SE","l'encapsulation est une propriete fondamentale",jean);
        MessageUtilisateur mu=new MessageUtilisateur(jean,message1);
        
       forum.ajouterUtilisateurMessages(nathalie, message1);
       forum.ajouterUtilisateurMessages(bernard, message1);
       forum.ajouterUtilisateurMessages(jean, message1);
       
      forum.affiche();
        
    }
    
}
