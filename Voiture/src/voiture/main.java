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
public class main {

    /**
     * @param args the command line arguments
     * @throws java.lang.CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        // TODO code application logic here
   
       Roue ro1 = new Roue(205, 45, "R", 16,91 ,"V");
      
    
    Voiture v1=new Voiture("Renault","Clio", ro1, ro1, ro1, ro1);

    Voiture v2=(Voiture) v1.clone();
    
        System.out.println(v1.getMoteur().hashCode());
        System.out.println(v2.getMarque());
        System.out.println(v1.getRoueAvantDroite().hashCode());
        System.out.println(v1.getRoueAvantGauche().hashCode());
         System.out.println(v1.hashCode());
        System.out.println(v2.hashCode());
    
     if (v1.Demarrer())
     {
         System.out.println("la voiture"+" "+v1.getModele()+" "+"est démarré");
     }
    
     if  (v1.Avancer())
     {
         System.out.println("la voiture"+" "+v1.getModele() +" "+"avance");
     }
     
     
      if (v1.Arreter())
     {
     System.out.println("la voiture"+" "+v1.getModele() +" "+"est arrêté");
     }      
  
     }    
  
}
