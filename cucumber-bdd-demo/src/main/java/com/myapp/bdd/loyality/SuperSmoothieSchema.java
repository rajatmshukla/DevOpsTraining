package com.myapp.bdd.loyality;
import java.util.HashMap;
import java.util.Map;
public class SuperSmoothieSchema {
    
    private Map<String, Integer> pointsPerCategory = new HashMap<>();
    private DrinkCatalog catalog;
    
    public SuperSmoothieSchema(DrinkCatalog catalog) {
        this.catalog = catalog;
    }
    
    public void setPointsPerCategory(String category,Integer points) {
        pointsPerCategory.put(category, points);
    
    }
    public int getPointsFor(String drink) {
        // TODO Auto-generated method stub
        return pointsPerCategory.get(categoryOf(drink));
    }
    private Object categoryOf(String drink) {
        // TODO Auto-generated method stub
        return catalog.getCategoryOf(drink);
    }
    
}
