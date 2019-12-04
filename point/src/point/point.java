/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point;

/**
 *
 * @author CRM
 */
public class point {
    
    private float x;
    private float y;
            float b;
    public point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public point() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    
    public void Deplacer (float newX,float newY)
    {
        this.x +=newX;
        this.y +=newY;
    }
    
    public void Permuter()
    {
        this.b=x;
        this.x=y;
        this.y=b;
        
    }
    public String toString()
    {
     return getX()+" "+getY()+" "; 
    }
    
    public void AfficherTexte()
    {
        System.out.println("la valeur de l'abscisse est de :"+" "+getX()+"\n"+"la valeur de l'ordonnée est de :"+" "+getY());
    }
    
     public point SyAxeOrdonnee (float newY)
    {
        this.x =0;
        this.y -=newY;
        return null;
        
    }
     
     public point SyAxeAbscisse (float newX)
    {
        this.y =0;
        this.x -=newX;
        return null;
    }
     
      public point SyOrigine (float newX, float newY)
    {
        
        this.y -=newY;
        this.x -=newX;
        
        
        return null;
    }
      
}
