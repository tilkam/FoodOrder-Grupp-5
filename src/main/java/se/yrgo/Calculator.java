package se.yrgo;

import java.awt.*;
import java.util.List;
import java.util.Map;

public class Calculator {
    private int billNumber;


    public static int calculate() {
        int total = 0;
        for (
                Map.Entry<String, Integer> entry : Menu.foodMenu.entrySet()) {
            total += entry.getValue();
        }

        return total;
    }
    public static int calculateBill(List<String> bill) {
        int total = 0;
        for (Map.Entry<String, Integer> entry : Menu.foodMenu.entrySet()) {
            for (String meal: bill) {
                if(meal.equals(entry.getKey()))
                    total += entry.getValue();
            }

        }
        return total;
    }
}
