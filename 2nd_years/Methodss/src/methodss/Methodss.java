/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodss;

/**
 *
 * @author Student
 */
public class Methodss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        /*
        What is method?
        A method is block code which only runs when it is called
        
        You can pass data known as parameters into a method.

        Method to perform cetain action and methods are also know as functions

        Why do we use methods?
        We use methods to reuse code, define code once and use it many times.
        
        */
        
        myMethod();
        mySecond();
        myThird();
    }
    
    public static void myMethod()
    {
        System.out.println("Hello world");
    }
    
    
    public static void mySecond()
    {
        System.out.println("Today is a Saturday");
        
    }
    
    public static void myThird()
    {
        System.out.println("Yesterday was Friday");
    }
}
