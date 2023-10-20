package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean extraCheeseAdded;
    private boolean extraToppingsAdded;
    private boolean paperBagAdded;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.price += isVeg ? 300 : 400;
        this.bill = "Base Price Of The Pizza: " + this.price;
        extraCheeseAdded = false;
        extraToppingsAdded = false;
        paperBagAdded = false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!extraCheeseAdded) {
            this.price += 80;
            this.bill += "\nExtra Cheese Added: 80";
            extraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!extraToppingsAdded) {
            int toppingsPrice = isVeg ? 70 : 120;
            this.price += toppingsPrice;
            this.bill += "\nExtra Toppings Added: ";
            extraToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!paperBagAdded) {
            this.price += 20;
            this.bill += "\nPaperbag Added: 20";
            paperBagAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        this.bill += "\nTotal Price: " + this.price;
        return this.bill;
    }
}
