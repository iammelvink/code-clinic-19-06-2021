/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bread;

/**
 *
 * @author Mr Melvin Kisten
 */
public class TestSandwichFilling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /**
         * Three SandwichFilling objects
         */
        SandwichFilling sandwichFilling1 = new SandwichFilling("Egg salad", 800);
        SandwichFilling sandwichFilling2 = new SandwichFilling("Cheese", 995);
        SandwichFilling sandwichFilling3 = new SandwichFilling("Butter", 1053);

        /**
         * Calling display method and passing sandwichFillng objects as
         * parameters to the method
         */
        display(sandwichFilling1);
        display(sandwichFilling2);
        display(sandwichFilling3);
    }

    /**
     * Method to display filling type and calories in a serving
     *
     * @param outputFilling
     */
    public static void display(SandwichFilling outputFilling) {
        System.out.println("Sandwich filling type: "
                + outputFilling.getFillingType()
                + "\nCalories in a serving: "
                + outputFilling.getCaloriesInAServing());
    }

}
