/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bread;

import java.util.Scanner;

/**
 *
 * @author Mr Melvin Kisten
 */
public class TestSandwich {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /**
         * Three Sandwich objects
         */
        Sandwich sandwich1 = new Sandwich("Sour", 1300, "Nuts", 1600);
        Sandwich sandwich2 = new Sandwich("Low GI", 1300, "Butter", 1800);
        Sandwich sandwich3 = new Sandwich("Bitter", 1300, "Cheese", 2100);

        /**
         * Calling displaySandwich method and passing sandwich objects as
         * parameters to the method
         */
        sandwich1.displaySandwich(sandwich1);
        sandwich2.displaySandwich(sandwich2);
        sandwich3.displaySandwich(sandwich3);

        /**
         * Sample switch case statement
         */
        int colour;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter 1, 2, 3 or 4 for different colour");
        colour = keyboard.nextInt();

        switch (colour) {
            case 1:
                System.out.println("You've chosen a red colour");
                break;
            case 2:
                System.out.println("You've chosen a green colour");
                break;
            case 3:
                System.out.println("You've chosen a blue colour");
                break;
            case 4:
                System.out.println("You've chosen a white colour");
                break;
            default:
                System.out.println("Invalid selection");
                break;
        }
    }

}
