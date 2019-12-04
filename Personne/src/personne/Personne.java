/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personne;

import static javax.lang.model.type.TypeKind.NULL;

/**
 *
 * @author CRM
 */
public class Personne {

   private  String nom;
   private String societe;
   

    

    public Personne(String nom) {
        this.nom = nom.toUpperCase();
        societe="?";
    }

   
       
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSociete() {
        return societe;
    }

    public void setSociete(String societe) {
        this.societe = societe;
    }

 
    
    public void  afficher(){
        
        if (societe.equals("?"))
            
            System.out.println("Je m'appelle "+" "+this.nom+" "+"je ne travaile pas dans une societe"); 

            
        
        else
            System.out.println("Je m'appelle "+" "+this.nom+" "+"je travaille chez"+" "+this.societe);
    }
    
    
    public void quitterSociete() {
 if (societe.equals("?")) {

 afficher ();
 System.out.println ( "Je ne suis pas salarié : impossible de quitter la société") ;
   
 }
 
        societe="?";
 
}
    
    public void integrerSociete(String entreprise)
            
    {
        societe=entreprise;
    }
}
