package com.example.yeldue;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class DiningHall extends AppCompatActivity {
    private String name;
    private food[] foodItems;
    private int[][] timings;
    private double ratings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dining_hall);
    }

    public DiningHall(String name, food[] foodItems, int[][] timings, double ratings) {
        this.name = name;
        this.foodItems = foodItems;
        this.timings = timings;
        this.ratings = ratings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public food[] getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(food[] foodItems) {
        this.foodItems = foodItems;
    }

    public int[][] getTimings() {
        return timings;
    }

    public void setTimings(int[][] timings) {
        this.timings = timings;
    }

    public double getRatings() {
        return ratings;
    }

    public void setRatings(double ratings) {
        this.ratings = ratings;
    }
}