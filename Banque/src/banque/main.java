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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      // TODO code application logic here
  
       Banque b1 = new Banque(2,"Credit Mutuel", "Strasbourg");
       
       b1.ajouterCompte(250,"zak",2584148,1500);
       b1.ajouterCompte(2500, "bob",2580848,1640);
        
    
       
        
        System.out.println(b1.Transfert(2584148,2580848, 100) );
        b1.afficheCompte();
        
       
     
        
      
    }
    
}
