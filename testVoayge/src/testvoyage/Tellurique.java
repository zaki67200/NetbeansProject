/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testvoyage;

import java.util.ArrayList;

/**
 *
 * @author CRM
 */
public enum Tellurique {
    
    Aquatique ("Planete Tellurique Aquatique"),
    Desertique ("Planete Tellurique Desertique"),
    Forestière ("Planete Tellurique Forestière");

    public ArrayList<Planete> getMesPlanetes() {
        return mesPlanetes;
    }

    public void setMesPlanetes(ArrayList<Planete> mesPlanetes) {
        this.mesPlanetes = mesPlanetes;
    }
    


  private String name = "";
  
  private ArrayList<Planete>mesPlanetes;
  //Constructeur
  Tellurique (String name){
    this.name = name;
  }
   
  public String toString(){
    return name;
  }
  public void ajouterPlanete(Planete p){
       
        this.mesPlanetes.add(p);
}
   public void affichePlanete() 
            
      {
          
         
         
        this.mesPlanetes.forEach((planete) -> {
       System.out.println(planete.toString());
        });
    
      }
  
  
}

