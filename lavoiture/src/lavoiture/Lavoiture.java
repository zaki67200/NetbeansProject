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
public class Lavoiture {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
       Voiture v1 = new Voiture("Peugeot", "408", 5, 0);

        Voiture v2= new Voiture("Citroen", "C4", 3, 0);
 

   
          System.out.println( v1.setDemarrer());
          System.out.println( v1.setDemarrer());
          System.out.println(v2.setDemarrer());
     
          System.out.println(v2.setAccelerer(20));
          System.out.println(v2.setRalentir(30));
          System.out.println(v1.afficher());
          System.out.println(v2.afficher()); 
          System.out.println(v1.getInfos());
          System.out.println(v2.getInfos());
    
        
}
}