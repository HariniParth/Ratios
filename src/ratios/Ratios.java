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
        // Iterate through the HashMap to determine the quantity in 1 portion of the meal.
        for(Map.Entry<Integer, Integer> entrySet : mealPortions.entrySet()){
            int mealPortion = entrySet.getValue();
            totalPortions += mealPortion;
        }
        // Fix issue with allocating non-integer portion counts.
        singlePortion = (int) Math.ceil(total / totalPortions);
        
        // Return a HashMap with Keys being meal identifiers and values being meal quantities.
        for(Map.Entry<Integer, Integer> entrySet : mealPortions.entrySet()){
            int mealIdentifier = entrySet.getKey();
            int mealPortion = entrySet.getValue();
            // Check if the requested meal quantity is less than or equal to the total portions allocated.
            int mealQuantity;
            if(singlePortion * mealPortion <= totalPortions)
                mealQuantity = singlePortion * mealPortion;
            else
                mealQuantity = totalPortions;
            // Once the meal portion is allocated, reduce the total number of portions.
            totalPortions -= mealQuantity;
            
            meal.put(mealIdentifier, mealQuantity);
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
