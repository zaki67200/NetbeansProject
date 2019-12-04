/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testvoyage;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author CRM
 */
public class TestVoyage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Planete  pla= new Planete("rubis", 250000, 500000);
        Planete  pla2= new Planete("neptune", 450000, 7058400);
        Voyage v1= new  Voyage( LocalDate.of(2015, Month.DECEMBER,5), pla, pla2);
        
        v1.ajouterPersonne("zak","web");
        v1.ajouterPersonne("bernard","bobb");
        v1.ajouterPersonne("marx", "karl");
        v1.affichePersonne();
        Tellurique t1=Tellurique.Aquatique;
        Tellurique t2=Tellurique.Desertique;
        Tellurique t3=Tellurique.Forestière;
        
    
    
}


}