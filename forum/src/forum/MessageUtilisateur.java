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
public class MessageUtilisateur {
    
    Utilisateur utilisateur;
    Message message;
     

    public MessageUtilisateur(Utilisateur utilisateur, Message message) {
        this.utilisateur = utilisateur;
        this.message = message;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public Message getMessage() {
        return message;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public void setMessage(Message message) {
        this.message = message;
    }


    
     
}
