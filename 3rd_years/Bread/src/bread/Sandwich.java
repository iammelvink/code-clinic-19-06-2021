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
public class Sandwich {

    /**
     * Data field for Bread object
     */
    private Bread bread;

    /**
     * Data field for SandwichFilling object
     */
    private SandwichFilling sandwichFilling;

    /**
     *
     * @param breadType
     * @param caloriesPerSlice
     * @param fillingType
     * @param caloriesInAServing
     */
    Sandwich(String breadType, double caloriesPerSlice,
            String fillingType, double caloriesInAServing) {
        bread = new Bread(breadType, caloriesPerSlice);
        sandwichFilling = new SandwichFilling(fillingType, caloriesInAServing);
    }

    /**
     * Method to display Sandwich details
     *
     * @param ouputSandwich
     */
    public void displaySandwich(Sandwich ouputSandwich) {
        System.out.println("Details of each sandwich"
                + "\nBread type: "
                + bread.getBreadType()
                + "\nCalories per slice: "
                + bread.getCaloriesPerSlice()
                + "\nSandwich filling: "
                + sandwichFilling.getFillingType()
                + "\nCalories in a serving: "
                + sandwichFilling.getCaloriesInAServing()
                + "\nTotal calories per Sandwich: "
                + ((bread.getCaloriesPerSlice() * 2)
                + sandwichFilling.getCaloriesInAServing())
                + "\n..................................................");
    }

}
