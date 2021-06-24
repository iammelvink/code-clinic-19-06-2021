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
public class Bread {

    /**
     * Data field for Bread type
     */
    private String breadType;

    /**
     * Data field for Calories per slice
     */
    private double caloriesPerSlice;

    /**
     * Data field for the company motto as a String
     */
    public final static String MOTTO = "\"The staff of life\"";

    /**
     *
     * @param breadType
     * @param caloriesPerSlice
     */
    Bread(String breadType, double caloriesPerSlice) {
        this.breadType = breadType;
        this.caloriesPerSlice = caloriesPerSlice;
    }

    /**
     * Getter for Bread type
     *
     * @return
     */
    public String getBreadType() {
        return breadType;
    }

    /**
     * Getter for Calories per slice
     *
     * @return
     */
    public double getCaloriesPerSlice() {
        return caloriesPerSlice;
    }

}
