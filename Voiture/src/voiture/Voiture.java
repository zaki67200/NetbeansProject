/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voiture;

/**
 *
 * @author CRM
 */
public class Voiture implements Cloneable {

    
    //Les attributs*//
    private String marque;
    private String modele;
    private boolean aDemarrer;
    private boolean aTourner;
    private int vitesse;
    private int nbPortes;
    private Moteur moteur;
    private Roue roueAvantDroite;
    private Roue roueAvantGauche;
    private Roue roueArriereDroite;
    private Roue roueArriereGauche;
    

    //les constructeur //

    public Voiture(String marque, String modele, Roue roueAvantDroite, Roue roueAvantGauche, Roue roueArriereDroite, Roue roueArriereGauche) {
        this.marque = marque;
        this.modele = modele;
        this.vitesse = vitesse;
        this.moteur = new Moteur();
        this.roueAvantDroite = new Roue();
        this.roueAvantGauche = new Roue();
        this.roueArriereDroite = new Roue();
        this.roueArriereGauche = new Roue();
    }

  

    public Roue getRoueAvantDroite() {
        return roueAvantDroite;
    }

    public void setRoueAvantDroite(Roue roueAvantDroite) {
        this.roueAvantDroite = roueAvantDroite;
    }

    public Roue getRoueAvantGauche() {
        return roueAvantGauche;
    }

    public void setRoueAvantGauche(Roue roueAvantGauche) {
        this.roueAvantGauche = roueAvantGauche;
    }

    public Roue getRoueArriereDroite() {
        return roueArriereDroite;
    }

    public void setRoueArriereDroite(Roue roueArriereDroite) {
        this.roueArriereDroite = roueArriereDroite;
    }

    public Roue getRoueArriereGauche() {
        return roueArriereGauche;
    }

    public void setRoueArriereGauche(Roue roueArriereGauche) {
        this.roueArriereGauche = roueArriereGauche;
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

    public Moteur getMoteur() {
        return moteur;
    }

    public void setMoteur(Moteur moteur) {
        this.moteur = moteur;
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

      public boolean Demarrer() {
         
     
          return moteur.Demarrer();
          
      
        
}

    
    public boolean Arreter() {
    
   return moteur.Arreter();
        
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

  public boolean Avancer() {
          return moteur.EntrainerRoues(roueAvantDroite,roueAvantGauche);
       
        
}
   
  public Object clone() throws CloneNotSupportedException {
	    Voiture voiture = null;
	    try {
	    
	      	voiture = (Voiture) super.clone();
	    } catch(CloneNotSupportedException cnse) {
	      	
	      	cnse.printStackTrace(System.err);
	    }
	    
	   
	    voiture.roueAvantDroite = (Roue)  roueAvantDroite.clone();
	    voiture.roueAvantGauche = (Roue)  roueAvantGauche.clone();
	    voiture.roueArriereDroite = (Roue)  roueArriereDroite.clone();
	    voiture.roueArriereGauche = (Roue)  roueArriereGauche.clone();
            voiture.moteur=(Moteur) moteur.clone();
	    
	    return voiture;
	}
}
  
 
 
