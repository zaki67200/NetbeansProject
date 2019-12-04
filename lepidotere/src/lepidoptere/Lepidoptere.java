/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lepidoptere;

/**
 *
 * @author CRM
 */
public class Lepidoptere  {
    
     private String Nom;
     private String Sexe;
     private String Color;
     private Stade stadeCourant;
     
    public Lepidoptere(String Nom, String Sexe, String Color) {
        this.Nom = Nom;
        this.Sexe = Sexe;
        this.Color = Color;
        this.stadeCourant=new Oeuf();
       
    }

    public Lepidoptere() {
        this.Nom = Nom;
        this.Sexe = Sexe;
        this.stadeCourant = new Oeuf();
    }

    

 

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getSexe() {
        return Sexe;
    }

    public void setSexe(String Sexe) {
        this.Sexe = Sexe;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public Stade getStadeCourant() {
        return stadeCourant;
    }

    public void SeTransformer() {
        this.stadeCourant = stadeCourant.SeTransformer();
        
    }

  
   
    
    public Lepidoptere Accoupler(Lepidoptere lip)
    {
   
        if (!this.Sexe.equals(lip.Sexe))
            
        {
            
            return new Lepidoptere();
        }
         return null;
       
    }

    
 

}

