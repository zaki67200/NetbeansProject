/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banque;

/**
 *
 * @author CRM
 */
public class Compte {
    
    private int decouvertAutorise;
    private String nom;
    private int numero;
    private int solde;

    public Compte() {
    }

    public Compte(int decouvertAutorise, String nom, int numero, int solde) {
        this.decouvertAutorise = decouvertAutorise;
        this.nom = nom;
        this.numero = numero;
        this.solde = solde;
    }

    public int getDecouvertAutorise() {
        return decouvertAutorise;
    }

    public void setDecouvertAutorise(int decouvertAutorise) {
        this.decouvertAutorise = decouvertAutorise;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }
    
   public void Crediter(int montant)
   
   {
       if (montant>=this.decouvertAutorise+this.solde && montant>=0)
           
       {
       this.solde+=montant;
       }
       else
           System.out.println("Ceci n'est pas un débit");
   }
       
   
   
   
   public boolean Debiter (int montant)
   {
       if (montant>=0 && montant <= this.decouvertAutorise+this.solde) {
           this.solde -=montant;
           return true;
        } else System.out.println("Ceci n'est pas un crédit");
        return false;
       
   }
   
   public boolean Superieur (Compte compte)
   {
        return this.solde>compte.solde; 
      
   
   }
   
   public String toString() {
       
       return "Compte [decouvertAutorise ="+" "+getDecouvertAutorise()+
               " , nom = "+" "+getNom()+ " , numero = "+" "+getNumero()+
               " , solde = "+" "+ getSolde()+" "+"]";
   }
   public boolean Transferer(int montant , Compte compte)
   
   {
       if (montant>=0 && montant<this.decouvertAutorise+this.solde) {
           compte.solde+=montant;
           this.solde-=montant;
           return true;
        } else System.out.println("la transaction est pas négatif");
        return false;
   }
}

