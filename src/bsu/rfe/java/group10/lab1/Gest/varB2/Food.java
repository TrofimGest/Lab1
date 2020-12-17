package bsu.rfe.java.group10.lab1.Gest.varB2;

public abstract class Food implements Consumable, Nutritious{
    private    String name = null;
    private double calories = 0.;
    public Food(String name, double calories) {
        this.name = name;
        this.calories = calories;
    }
    public boolean equals(Object arg0) {
        if (!(arg0 instanceof Food)) return false; // Шаг 1
        if (name==null || ((Food)arg0).name==null) return false; // Шаг 2
        return name.equals(((Food)arg0).name); // Шаг 3
    }
    public String toString() {
        return name;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
// Реализация метода consume() удалена из базового класса Food
// Это можно сделать, потому что сам Food - абстрактный
}
