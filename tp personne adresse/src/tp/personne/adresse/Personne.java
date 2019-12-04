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
public class Personne {
    
    
   String prenom;
   String nom;
   int age;
   Adresse adresse;

    public Personne(String prenom, String nom, int age, Adresse adresse) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        this.adresse = adresse;
    }
   

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
        
    }
   
  
  
   
   public void  affichePersone(){
       
        System.out.println(" "+this.prenom+" "+this.nom+" "+this.age+" "+ " ans, habite au "+" "+adresse.afficher()+" "+"\n");
   }

   public void seMarier(Personne p)
   {
      System.out.println("Vive les mariés");
       p.adresse=this.adresse;
       this.affichePersone();
       p.affichePersone();
       
       
       
   
   }
}


