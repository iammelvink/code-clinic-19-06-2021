/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package returnvalues;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class ReturnValues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        As perviously stated the void keyword used in the previous examples indicates 
        that the method will not return a value. If we wanted a method to return 
        a value we could use a data type like int instead of void and then include 
        a return keyword in the body of the method
        
        */
        
        System.out.println(math(10,5,5,5));
        
        int z = myMath(10,100, 40);
        System.out.println(z);
        
        int result;
        int num = 77;
        result = square(num);
        
        System.out.println("Squared value of " + num + " is:"+ " "+ result);
        
        
        Sum();
    } 
    
    public static int math(int x, int y, int w, int v)
    {
       return x + y + w+ v; 
    }
    
    public static int myMath(int x, int y, int l)
    {
        return x + y + l;
    }
    
    
    public static int square(int num)
    {
        return num * num;
    }
    
    public static void Sum()
    {
        Scanner input = new Scanner (System.in);
        int x , y;
        
        System.out.println("Enter a number:");
        x = input.nextInt();
        
        System.out.println("Please enter another number");
        y = input.nextInt();
        
        System.out.println("Sum is"+ " "+ (x+ y));
        
        
        
        
    }
}
