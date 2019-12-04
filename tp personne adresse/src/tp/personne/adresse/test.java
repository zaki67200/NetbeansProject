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
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Adresse a1=new Adresse(2,"rue Victor Hugo",75008, "Paris");
        Adresse a2=new Adresse(17,"rue de la Republique",44000, "Nantes");
        Adresse a3=new Adresse(55,"Bld de la Liberation",59000, "Lille");
        
        Personne p1= new Personne("Jean","Dupont", 30, a3);
        Personne p2= new Personne("Bernard","Morin", 45, a1);
        Personne p3= new Personne("Nathalie","Durand", 35, a2);
        
        p1.affichePersone();
        p2.affichePersone();
        p3.affichePersone();
        
        p1.setAdresse(new Adresse(44,"Rue des Docks", 33000,"Bordeaux"));
        p1.affichePersone();
        p2.seMarier(p3);
        
        
                
    }
    
}
