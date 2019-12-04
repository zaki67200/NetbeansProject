  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lavoiture;

/**
 *
 * @author CRM
 */


// les classes
public class Voiture {

    
    //Les attributs*//
    private String marque;
    private String modele;
    private boolean aDemarrer;
    private int vitesse;
    private int nbPortes;

    //les constructeur //
    public Voiture(String M, String Mo, int nbp, int Vi ) {

        this.marque = M;
        this.modele = Mo;
        this.nbPortes = nbp;
        this.vitesse = Vi;
        
    }

    //*les getters *//
    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public int getNbPortes() {
        return nbPortes;
    }

    public int getVitesse() {
        return vitesse;
    }

   
    
    
    
    //* Les setters*//
    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setNbPortes(int nbPortes) {
        this.nbPortes = nbPortes;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    
    /**
     *
     */
    public String setDemarrer() {
        
     	
            
        
        if(aDemarrer==false)
        {
            aDemarrer=true;
            
            
         

           return "la voiture"+" "+this.marque +" "+this.modele + " "+ "démarre";

            
        }
        
        else
        {
              return "On peux pas demarrer plusieurs fois";
        }
       
        
    
    }

    public String setArreter() {

        if (aDemarrer==true)
        
        
        {
             aDemarrer=false; 
           return "la voiture" + " " + this.marque + " " + this.modele + " " + "est Stoppé";
            
            
        }
        
        else
            return "On peut pas s'arreter plusieurs fois";
       
    }

    
    public String setAccelerer(int vitesse ) {
    
       
       if (aDemarrer==true)
    {
            
            this.vitesse +=vitesse;
            
            
            return "j'accélere de" + " " +vitesse+ " " + "km/h";
        }
        
       else
          return   "le véhicule"+" "+this.modele+" "+" "+this.marque+" "+"veut accelerer de"+" "+vitesse+"\n"
                  +"Pour accelerer, il faut démarrer le véhicule"+" "+this.modele+" "+" "+this.marque;
    }


public String setRalentir(int vitesse) {

   if (vitesse>vitesse+1) {
       
       this.vitesse -= vitesse;
        
        return "je diminue la vitesse" + " " + vitesse + " " + "km/h";

  
       }  
   
   else
       return "on peut pas ralentir de "+" "+vitesse+" "+"km/h"+" "+"car la vitesse est de "+" "+this.vitesse+" "+ "km/h";

    
}

    
 
 
  public String getInfos(){
        
      if (this.vitesse == 0)
      {
        return  
                "Nom et modèle du véhicule :"+marque + " "+ modele+" "+"\n"+ 
                "Nombre de porte"+" "+ nbPortes+" "+"\n"+ 
                "Demarrer/Arreter :"+" "+aDemarrer +"\n"+
         "le vehicule"+" "+ this.modele+" "+"est à l'arret";
      }
      else 
      {    
          return
          "Nom et modèle du véhicule :"+marque + " "+ modele+" "+"\n"+ 
          "Nombre de porte"+" "+ nbPortes+" "+"\n"+ 
          "Demarrer/Arreter :"+" "+aDemarrer +"\n"+
          "la Vitesse Actuelle du vehicule"+" "+this.vitesse+"km/h";
      }
                
    }                 
         
  
 public String afficher(){
     
     if (this.vitesse==0)
     {
      return "le vehicule"+" "+ this.modele+" "+"est à l'arret";
     }
     else
     {
     
     return "la vitesse du vehicule"+" "+this.marque+""+" est de"+" "+this.vitesse+" "+"km/h";
       
     }  

 }
 
 

}
 

