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
public class SandwichFilling {

    /**
     * Data field for Filling type
     */
    private String fillingType;

    /**
     * Data field for Calories in a serving
     */
    private double caloriesInAServing;

    /**
     *
     * @param fillingType
     * @param caloriesInAServing
     */
    SandwichFilling(String fillingType, double caloriesInAServing) {
        this.fillingType = fillingType;
        this.caloriesInAServing = caloriesInAServing;
    }

    /**
     * Getter for Filling type
     *
     * @return
     */
    public String getFillingType() {
        return fillingType;
    }

    /**
     * Getter for Calories in a serving
     *
     * @return
     */
    public double getCaloriesInAServing() {
        return caloriesInAServing;
    }

}
