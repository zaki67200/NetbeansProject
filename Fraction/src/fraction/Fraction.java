/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fraction;

/**
 *
 * @author CRM
 */
public class Fraction {
    
    private int numerateur;
    private int denominateur;
            int inverse;
    public Fraction(int numerateur, int denominateur) {
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }

    public int getNumerateur() {
        return numerateur;
    }

    public void setNumerateur(int numerateur) {
        this.numerateur = numerateur;
    }

    public int getDenominateur() {
        return denominateur;
    }

    public void setDenominateur(int denominateur) {
        this.denominateur = denominateur;
    }
    
    public String toString () {
         
        return getNumerateur()+"/"+getDenominateur();
    }
    
    public void Oppose(){
        this.numerateur=-numerateur;
    }
    
    public void Inverser(){
       
        this.inverse=numerateur;
        this.numerateur=denominateur;
        this.denominateur=inverse;
        }
    
    public boolean Superieur(Fraction f){
    
                {
                    return this.numerateur-this.denominateur > f.numerateur-f.denominateur;
                }
                
    }
    
    public boolean EgalA(Fraction f){
        
        return this.numerateur-this.denominateur == f.numerateur-f.denominateur;
                
    }
    
    public int GetPgcd()
    {
        int a=this.numerateur;
        int b=this.denominateur;
        int pgcd=1;
        if (a!=0 && b!=0)
        {
            
        if (a<0) a=-a;
        if (b<0) b=-b;
        while(a!=b)
        {
            if (a<b)
            {
                b=b-a;
                
            }
            else
            {
                a=a-b;
            }
            
        } 
         pgcd=a;
        }
       return pgcd; 
    
    }
    
    public void Reduire(){
        
        int a=this.numerateur/GetPgcd();
        int b=this.denominateur/GetPgcd();
        
        System.out.println(a+"/"+b);
        
    }
   public Fraction Plus(Fraction f){
       
    int a=this.denominateur*f.denominateur;
    int b=this.numerateur*f.denominateur;
    int c=f.numerateur*this.denominateur;
    int n3=(b+c)/GetPgcd();
    int d3= a/GetPgcd();
    
       return new Fraction (n3,d3);
       
   }
   
    public Fraction Moins(Fraction f){
       
    int a=this.denominateur*f.denominateur;
    int b=this.numerateur*f.denominateur;
    int c=f.numerateur*this.denominateur;
    int n3=(b-c)/GetPgcd();
    int d3= a/GetPgcd();
    
       return new Fraction (n3,d3);
       
   }
    
    public Fraction Multiplie(Fraction f){
       
    int a=this.denominateur*f.denominateur;
    int b=this.numerateur*f.numerateur;
  
    int n3=(b)/GetPgcd();
    int d3= a/GetPgcd();
    
       return new Fraction (n3,d3);
       
   }
    
     public Fraction Diviser(Fraction f){
        f.Inverser();
    int a=this.denominateur*f.denominateur;
    int b=this.numerateur*f.numerateur;
  
    int n3=(b)/GetPgcd();
    int d3= a/GetPgcd();
    
       return new Fraction (n3,d3);
       
   }
}
