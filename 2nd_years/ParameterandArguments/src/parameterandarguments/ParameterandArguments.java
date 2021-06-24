/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parameterandarguments;

/**
 *
 * @author Student
 */
public class ParameterandArguments {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Information can be passed to methods as parameters. Parameters act as a variable inside the method.
        
        Parameters are specified after the method name, inside the two parentheses. You can add as many parameters as you like. Just separate by comma.
        */
        
        myName("Kealeboga");
        myAge(18);
        me("Kea", 22);
        
        int hour = 12;
        int minute = 15;
        
        printTime(hour,minute);
        
    }
    
    public static void myName(String fname)
    {
        System.out.println("My name is"+ " "+ fname );
    }
    
    /*
    When a parameter is passed to a method its is called an argument.
    */
    
    public static void myAge(int age)
    {
        System.out.println("My age is"+ " "+ age);
    }
    
    public static void me(String name, int age)
    {
        System.out.println("My name is "+ " "+ name+ " "+ " and I am "+ " "+ age+" "+ " old");
    }
    
   /*
    When you work with multiple parameters, 
    the method call must have the same number of arguments as there are parameters 
    and the arguments must be passed in the same order.
    */
    
    
    public static void printTime(int hour, int minute)
    {
        System.out.println(hour + " "+":"+ " "+ minute );
       
    }
}

