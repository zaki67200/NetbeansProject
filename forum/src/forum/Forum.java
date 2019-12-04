/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum;

import java.util.ArrayList;

/**
 *
 * @author CRM
 */
class Forum {
    
         private  ArrayList<Utilisateur> listeUser=new ArrayList<>();
     private  ArrayList<Message> listeMsg=new ArrayList<>();

     
    private int NBRE_Message;

  

    

    public boolean ajouterUtilisateurMessages ( Utilisateur utilisateur , Message me) {
    
     
        this.listeMsg.add(me);
        this.listeUser.add(utilisateur);
        
        
      return true;
    }

 
    public int getNBRE_Message() {
        return NBRE_Message;
    }

   

    public void setNBRE_Message(int NBRE_Message) {
        this.NBRE_Message = NBRE_Message;
    }

    public ArrayList<Utilisateur> getListeUser() {
        return listeUser;
    }

    public void setListeUser(ArrayList<Utilisateur> listeUser) {
        this.listeUser = listeUser;
    }

    public ArrayList<Message> getListeMsg() {
        return listeMsg;
    }

    public void setListeMsg(ArrayList<Message> listeMsg) {
        this.listeMsg = listeMsg;
    }
   
    


  public void affiche() 
            
    {
       
        listeUser.forEach((user) -> {
            listeMsg.forEach((message) -> {
               
                
                System.out.println(message.getTitre()+" "+message.getTexte()+" "+message.getDateCreation()+" "+user.getNom()+" "+user.getPrenom()+" "+user.getStatut());
            });
             });
        
      
    }
  
  
  
  
  
  
  
  
 }