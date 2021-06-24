/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodoverloading;

/**
 *
 * @author Student
 */
public class MethodOverloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Method overloading
        Multiple methods can have the same name with different parameters
        */
        
         multiply(1,7);
         multiply(1,5,8);
         
         
         int num1 = plusMethodint(5,3);
         double num2 = plusMethodDouble(5.5, 3.3);
         
         System.out.println("int:"+ " "+ num1);
         System.out.println("double:"+ " "+ num2);
         
         
         
         int num = plusMethod(8, 10);
         
         double numm = plusMethod(8.8, 10.10);
         
         System.out.println("int:"+ " "+ num);
         System.out.println("numm:"+ " "+ numm);
         
         
         
    }
    public static void multiply(int a , int b)
    {
        System.out.println("Result is"+ " "+ (a*b));
        
    }
    
    public static void multiply(int a , int b, int c)
    {
        System.out.println("Result is"+ " "+ (a*b*c));
    }
    
    
    public static int plusMethodint(int x, int y)
    {
       return x + y; 
    }
    
    public static double plusMethodDouble(double x, double y)
    {
        return x + y;
    }
    
    
    
    public static int plusMethod(int x, int y)
    {
        return x + y;
    }
    
    public static double plusMethod(double x, double y)
    {
        return x + y;
    }
    
}
