package com.foodtruck;

import java.util.HashMap;

public class Menu {

    private HashMap<String, MenuItem> items;

    public Menu() {

        items = new HashMap<>();

        items.put("salad_greek", new Salad("Greek Salad", 7.50));
        items.put("salad_caesar", new Salad("Caesar Salad", 12.50));
        items.put("sandwich_turkey", new Sandwich("Turkey Sandwich", 9.50));
        items.put("sandwich_chicken", new Sandwich("Chicken Sandwich", 5.60));
        items.put("drink_soda", new Drink("Soda", 1.50));
    }

    public HashMap<String, MenuItem> getAllItems() {
        return items;
    }
}
