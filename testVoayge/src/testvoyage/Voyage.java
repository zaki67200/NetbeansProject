/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testvoyage;

import java.time.LocalDate;
import java.util.ArrayList;


/**
 *
 * @author CRM
 */
public class Voyage {
    
    private LocalDate dateVoyage;
    private Planete   planeteDepart;
    private Planete   planeteArrive;
    private ArrayList<Personne>mesPersonnes;

    public Voyage(LocalDate dateVoyage, Planete planeteDepart, Planete planeteArrive) {
        this.dateVoyage = dateVoyage;
        this.planeteDepart = planeteDepart;
        this.planeteArrive = planeteArrive;
        this.mesPersonnes = new ArrayList<>();
    }

    public LocalDate getDateVoyage() {
        return dateVoyage;
    }

    public void setDateVoyage(LocalDate dateVoyage) {
        this.dateVoyage = dateVoyage;
    }

    public Planete getPlaneteDepart() {
        return planeteDepart;
    }

    public void setPlaneteDepart(Planete planeteDepart) {
        this.planeteDepart = planeteDepart;
    }

    public Planete getPlaneteArrive() {
        return planeteArrive;
    }

    public void setPlaneteArrive(Planete planeteArrive) {
        this.planeteArrive = planeteArrive;
    }

    public ArrayList<Personne> getMesPersonnes() {
        return mesPersonnes;
    }

    public void setMesPersonnes(ArrayList<Personne> mesPersonnes) {
        this.mesPersonnes = mesPersonnes;
    }
    
    private void ajouterPersonne(Personne p){
       
        this.mesPersonnes.add(p);
        
       
         
    }
    public void ajouterPersonne (String nomPersonne, String prenomPersonne){
        
        ajouterPersonne(new Personne (nomPersonne, prenomPersonne));
    }
    
      public void affichePersonne() 
            
      {
          
         
          System.out.println("le voyage de départ de la planete"+" "+" "+planeteDepart.getNomPlanete()+" "+
                              "vers la planete d'arrivé"+" "+ planeteArrive.getNomPlanete()+" "+
                               " à la date"+" "+getDateVoyage()+"\n"); 
        this.mesPersonnes.forEach((personne) -> {
       System.out.println(personne.toString());
        });
    
      }
    
    
}
