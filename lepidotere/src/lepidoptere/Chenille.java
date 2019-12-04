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
public  class Chenille extends Stade  {
    
    
    
   
    
   
    public Stade  SeTransformer()
{
  
  return new Chrysalide(); 
}
public void SeDeplacer()
{
  System.out.println("je rampe ");
 
}

 public String ToString() {
    return "je suis une chenille";
    }
   


}


