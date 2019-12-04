/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personne;

/**
 *
 * @author CRM
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Personne durant=new Personne ("durant");
        Personne zak=new Personne ("zak");
      
      
        durant.integrerSociete("J2E");
        zak.integrerSociete("GMS");
        durant.quitterSociete();
        zak.quitterSociete();
        zak.afficher();
        durant.afficher();
        durant.integrerSociete("BMS");
        zak.integrerSociete("GM");
        durant.afficher();
        zak.afficher();
       
      
        
    }
    
}
