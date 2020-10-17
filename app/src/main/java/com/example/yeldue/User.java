package com.example.yeldue;

import java.util.ArrayList;

public class User {
    private String name;
    private int age;
    private String mealPreference;
    private ArrayList<String> meals;

    public User(String name, int age, String mealPreference){
        this.name = name;
        this.age = age;
        this.mealPreference = mealPreference;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getMealPreference(){
        return this.mealPreference;
    }

    public ArrayList<String> getMeals(){
        return this.meals;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setMealPreference(String mealPreference){
        this.mealPreference = mealPreference;
    }

    public void addMeal(String meal){
        this.meals.add(meal);
    }

    public String toString(){
        return ("Name: " + getName() + "\n | " + "Age: " + getAge() +
                "\n | " + "Meal Preference: " + getMealPreference() + "\n"
                + "Past meals: " + getMeals());
    }
}
