/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice;

/**
 *
 * @author CRM
 */
public class Caculatrice {
    
    char operateur;
    double var1;
    double var2;
    
    

       public static void main(String[] args) {
        
          calcul('+',5,10);
    }
 
    public static void calcul (char operateur,double var1,double var2)
    {
        switch (operateur){
        
         case '+':   
            
           System.out.println(var1+var2);
           break;
         
         case '-':
         
           System.out.println(var1-var2);
            break;
          
         case '*':
             System.out.println(var1*var2);
             break;
         case '/':
             
              System.out.println(var1/var2);
             break;
         
         default:
                    
          
   }      
    }
    
}

