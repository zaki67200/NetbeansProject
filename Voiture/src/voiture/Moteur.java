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
public class Moteur implements Cloneable
        

{
    
    private boolean aDemarrer;
   
    
    public Object clone() throws CloneNotSupportedException {
		Object o = null;
		try {
			// On récupère l'instance à renvoyer par l'appel de la 
		// l'interface Cloneable
				// méthode super.clone()
			o = super.clone();
		} catch(CloneNotSupportedException cnse) {
			// Ne devrait jamais arriver car nous implémentons 
			cnse.printStackTrace(System.err);
		}
		// on renvoie le clone
		return o;
	}

    

   
    
    
    
 public boolean Demarrer(){
  if(aDemarrer==false)
        {
            aDemarrer=true;
            
      
           return true;

            
        }
        
        else
        {
              return false;
        }
 }      
         

     public boolean Arreter() {

        if (aDemarrer==true)
        
        
        {
             aDemarrer=false; 
           return true;
            
            
        }
        
        else
            return false;
       
    }
     
     public boolean EntrainerRoues(Roue roueMot1 ,Roue roueMot2){
         
        return roueMot1.Tourner()&&roueMot2.Tourner();
         
     }
     
     
     
     
}

  
    
    

   
    
  
    

  
