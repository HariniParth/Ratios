/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ratios;

import java.util.*;

/**
 *
 * @author harini-geek
 */
public class Ratios {

    private HashMap<Integer, Integer> mealRatios(int total, HashMap<Integer, Integer> mealPortions){
        
        // Key = Meal Identifier, Value = Meal Quantity
        HashMap<Integer, Integer> meal = new HashMap<>();
        
        int singlePortion;
        int totalPortions = 0;
        // Iterate through the HashMap to determine the quantity in 1 portion of the meal
        for(Map.Entry<Integer, Integer> entrySet : mealPortions.entrySet()){
            totalPortions += entrySet.getValue();
        }
        singlePortion = total / totalPortions;
        
        // Return a HashMap with Keys being meal identifiers and values being meal quantities.
        for(Map.Entry<Integer, Integer> entrySet : mealPortions.entrySet()){
            meal.put(entrySet.getKey(), singlePortion * entrySet.getValue());
        }
        
        return meal;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
