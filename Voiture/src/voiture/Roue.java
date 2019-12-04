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
public class Roue implements Cloneable  {
    
    
   private  boolean aTourner;
   private int Largeur;
   private int HauteurDuFlanc;
   private String Type;
   private int Diametre;
   private int IndiceDeCharge;
   private String IndiceDeVitesse;

    public Roue(int Largeur, int HauteurDuFlanc, String Type, int Diametre, int IndiceDeCharge, String IndiceDeVitesse) {
        this.Largeur = Largeur;
        this.HauteurDuFlanc = HauteurDuFlanc;
        this.Type = Type;
        this.Diametre = Diametre;
        this.IndiceDeCharge = IndiceDeCharge;
        this.IndiceDeVitesse = IndiceDeVitesse;
    }

    public Roue() {
        
        this.Largeur = Largeur;
        this.HauteurDuFlanc = HauteurDuFlanc;
        this.Type = Type;
        this.Diametre = Diametre;
        this.IndiceDeCharge = IndiceDeCharge;
        this.IndiceDeVitesse = IndiceDeVitesse;
    }

   
   
    public int getLargeur() {
        return Largeur;
    }

    public void setLargeur(int Largeur) {
        this.Largeur = Largeur;
    }

    public int getHauteurDuFlanc() {
        return HauteurDuFlanc;
    }

    public void setHauteurDuFlanc(int HauteurDuFlanc) {
        this.HauteurDuFlanc = HauteurDuFlanc;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public int getDiametre() {
        return Diametre;
    }

    public void setDiametre(int Diametre) {
        this.Diametre = Diametre;
    }

    public int getIndiceDeCharge() {
        return IndiceDeCharge;
    }

    public void setIndiceDeCharge(int IndiceDeCharge) {
        this.IndiceDeCharge = IndiceDeCharge;
    }

    public String getIndiceDeVitesse() {
        return IndiceDeVitesse;
    }

    public void setIndiceDeVitesse(String IndiceDeVitesse) {
        this.IndiceDeVitesse = IndiceDeVitesse;
    }

    public boolean Tourner(){
  if(aTourner==false)
        {
            aTourner=true;
            
      
           return true;

            
        }
        
        else
        {
              return false;
        }
 }      
  
public Object clone() throws CloneNotSupportedException {
		Object o = null;
		try {
			// On récupère l'instance à renvoyer par l'appel de la 
		// l'interface Cloneable
				// méthode super.clone()
			o = super.clone();
		} catch(CloneNotSupportedException cnse) {
			// Ne devrait jamais arriver car nous implémentons 
			cnse.printStackTrace(System.err);
		}
		// on renvoie le clone
		return o;
	}
  
   
}
