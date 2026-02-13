package com.foodtruck;

import java.util.HashMap;

public class Menu {

    private HashMap<String, MenuItem> items;

    public Menu() {

        items = new HashMap<>();

        items.put("salad_greek", new Salad("Greek Salad", 7.50));
        items.put("sandwich_turkey", new Sandwich("Turkey Sandwich", 9.50));
        items.put("drink_water", new Drink("Water", 1.50));
    }

    public HashMap<String, MenuItem> getAllItems() {
        return items;
    }
}
