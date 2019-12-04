/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banque;

import java.util.ArrayList;

/**
 *
 * @author CRM
 */
public class Banque {
    
   private  ArrayList<Compte> mesComptes;
   private int nbComptes;
   private String nom;
   private String ville;

    public Banque(int nbComptes, String nom, String ville) {
        this.nbComptes = nbComptes;
        this.nom = nom;
        this.ville = ville;
        this.mesComptes=new ArrayList<>();
        
    }

    public int getNbComptes() {
        return nbComptes;
    }

    public void setNbComptes(int nbComptes) {
        this.nbComptes = nbComptes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public ArrayList<Compte> getMesComptes() {
        return mesComptes;
    }

    public void setMesComptes(ArrayList<Compte> mesComptes) {
        this.mesComptes = mesComptes;
    }
   
   private void ajouterCompte(Compte c){
       
        this.mesComptes.add(c);
        
       
         
    }
      public void afficheCompte() 
            
      {
        this.mesComptes.forEach((compte) -> {
       System.out.println(compte.toString());
        });
    
      }
  public void ajouterCompte(int decouvertAutorise, String nom, int numero, int solde)
  {
     ajouterCompte(new Compte(decouvertAutorise, nom, numero, solde));
  }
  
  public String toString() {
       
       return "Compte [Nom de Banque ="+" "+getNom()+
               " ,La Ville = "+" "+getVille()+ " , numero = "+" "+
               " ,nombre de Compte = "+" "+ getNbComptes()+" "+"]";
   }
  
  public Compte CompteSup(){
      
       
       Compte temp=mesComptes.get(0);
     
      for(Compte compte: mesComptes)
      
      
         if ( compte.Superieur(temp))
         {
             temp=compte;
         } 
      
      

   
     
    return temp;
   
      
  }
  
    public Compte RendreCompte(int numero) {
       

        Compte c = null ;
        for (int i = 0; i < mesComptes.size(); i++) {
            if (mesComptes.get(i).getNumero()==numero) 
            {
                c=mesComptes.get(i);
                
                
            }
        }
        
        return c;
        
    }
    
    public Compte Transfert(int numero1 ,int numero2,int montant){
          
       
        Compte c = null ;
        Compte t=mesComptes.get(0);
        for (int i = 0; i < mesComptes.size(); i++){
        for (int j = 0; j < mesComptes.size(); j++){
        
            if (mesComptes.get(i).getNumero()==numero1 && mesComptes.get(j).getNumero()==numero2) 
            {
                    c=mesComptes.get(i); 
                    t=mesComptes.get(j); 
                    c.Transferer(montant, t);
                                   
            }
          
        }
        
        }
        
        return c;
    
    
}
    
}