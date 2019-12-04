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
public class Planete {
    
   private String nomPlanete;
   private int rayonPlanete;
   private int Capacite;
   
   
   public Planete(String nomPlanete,int rayonPlanete,int Capacite)
   {
       this.nomPlanete=nomPlanete;
       this.rayonPlanete=rayonPlanete;
       this.Capacite=Capacite;
       
   }

    public Planete() {
    }
   

    public String getNomPlanete() {
        return nomPlanete;
    }

    public void setNomPlanete(String nomPlanete) {
        this.nomPlanete = nomPlanete;
    }

    public int getRayonPlanete() {
        return rayonPlanete;
    }

    public void setRayonPlanete(int rayonPlanete) {
        this.rayonPlanete = rayonPlanete;
    }

    public int getCapacite() {
        return Capacite;
    }

    public void setCapacite(int Capacite) {
        this.Capacite = Capacite;
    }
    
     public String toString() {
       
       return "Planete [Nom ="+" "+getNomPlanete()+
               " , Rayon = "+" "+ getRayonPlanete()+
               "Capacité"+" "+getCapacite()+" "+"]";
   }
    
}
