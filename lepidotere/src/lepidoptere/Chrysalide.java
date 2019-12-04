/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lepidoptere;

/**
 *
 * @author CRM
 */
public class Chrysalide extends Stade{
    
    
  
    
 
    public Stade SeTransformer()
{
  
  return new Papillon();
}
public void SeDeplacer()
{
  System.out.println("je ne peux pas me déplacer ");
 
}

   public String ToString() {
    return "je suis un Chrysalide";
    }
   

}