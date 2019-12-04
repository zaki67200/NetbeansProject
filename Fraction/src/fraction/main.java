/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fraction;

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
        Fraction f1=new Fraction(30,12);
        Fraction f2=new Fraction (4,3);
        Fraction f4= new Fraction(4320,1080);
        Fraction f3 = (f1.Diviser(f2));
        
        System.out.println(f3.toString());

       
       
    }
    
}
