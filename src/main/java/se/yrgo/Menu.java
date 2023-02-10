package se.yrgo;

import java.util.HashMap;
import java.util.Map;

public class Menu {

    public static Map <String, Integer> foodMenu = new HashMap<>();

    public Menu() {
        this.foodMenu = foodMenu;
        addMeal();
    }

    private static void addMeal() {
        foodMenu.put("Lasagne", 125);
        foodMenu.put("Pizza", 140);
        foodMenu.put("Entrecote", 260);
        foodMenu.put("Poke Bowl", 149);
        foodMenu.put("Falafel Salad", 139);
        foodMenu.put("Ice Cream", 69);
    }

    public void showMenu() {
        for (Map.Entry<String, Integer> entry : foodMenu.entrySet()) {
            System.out.println(entry.getKey()
                    + " kostar " + entry.getValue() + " kr");
        }
    }

    public static Map<String, Integer> getFoodMenu() {
        return foodMenu;
    }
}
