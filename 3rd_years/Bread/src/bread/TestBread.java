/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bread;

import static bread.Bread.MOTTO;

/**
 *
 * @author Mr Melvin Kisten
 */
public class TestBread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /**
         * Three Bread objects
         */
        Bread bread1 = new Bread("Rye", 550.61);
        Bread bread2 = new Bread("Sweat", 720.32);
        Bread bread3 = new Bread("Whole Wheat", 333.94);

        /**
         * Calling display method and passing bread objects as parameters to the
         * method
         */
        display(bread1);
        display(bread2);
        display(bread3);

        System.out.println(MOTTO);
    }

    /**
     * Method to display bread type and calories per slice
     *
     * @param outputBread
     */
    public static void display(Bread outputBread) {
        System.out.println("Bread type: "
                + outputBread.getBreadType()
                + "\nCalories per slice: "
                + outputBread.getCaloriesPerSlice());
    }

}
