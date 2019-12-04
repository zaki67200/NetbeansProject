/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.personne.adresse;

/**
 *
 * @author CRM
 */
public class Adresse {
    
    private int numero_rue;
    private String nom_rue;
    private int codePostal;
    private String Ville;

    public Adresse(int numero_rue, String nom_rue, int codePostal, String Ville) {
        this.numero_rue = numero_rue;
        this.nom_rue = nom_rue;
        this.codePostal = codePostal;
        this.Ville = Ville;
    }

    
    
    
    
    public int getNumero_rue() {
        return numero_rue;
    }

    public void setNumero_rue(int numero_rue) {
        this.numero_rue = numero_rue;
    }

    public String getNom_rue() {
        return nom_rue;
    }

    public void setNom_rue(String nom_rue) {
        this.nom_rue = nom_rue;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return Ville;
    }

    public void setVille(String Ville) {
        this.Ville = Ville;
    }
    
    public String afficher(){
        
        return ("Adresse :"+" "+this.numero_rue+" "+this.nom_rue+" "+this.codePostal+" "+this.Ville);
        
        
    }
    
    
    
}
