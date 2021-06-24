/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelsemethod;

/**
 *
 * @author Student
 */
public class Ifelsemethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       checkAge(18);
       donateBlood(55, 55);
    }
    
    public static void checkAge(int age)
    {
        if (age < 18)
        {
            System.out.println("Access denied, you're underage");
        }
        else
        {
            System.out.println("Access grated , you're old enough");
        }
    }
    
    
    public static void donateBlood( int weight)
    {
       
        
            if (weight > 50)
            {
                System.out.println("You're eligible to donate blood");
            }
            else
            {
                System.out.println("You're not eligible donate blood");
            }
         
        
    }
    
    public static void donateBlood(int age, int weight)
    {
        if (age >= 18)
        {
             if (weight > 50)
             {
                 System.out.println("You're eligible to donate blood");
             }
             else
             {
                  System.out.println("You're not eligible donate blood");
             }
             
          
        }
        else 
          {
                  System.out.println("You must be older than 18 to donate blood");
                  }  
    }
}
