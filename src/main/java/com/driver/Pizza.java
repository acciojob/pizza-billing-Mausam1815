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
        this.price = isVeg ? 300 : 400;
        extraCheeseAdded = false;
        extraToppingsAdded = false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!extraCheeseAdded) {
            this.price += 80;
            extraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!extraToppingsAdded) {
            this.price += isVeg ? 70 : 120;
            extraToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!paperBagAdded) {
            this.price += 20;
            paperBagAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isVeg){
            bill = "Base Price Of The Pizza: 300\n";
        }
        else{
            bill = "Base Price Of The Pizza: 400\n";
        }

        if(extraCheeseAdded){
            bill += "Extra Cheese Added: 80\n";
        }

        if(extraToppingsAdded){
            if(isVeg){
                bill += "Extra Toppings Added: 70\n";
            }
            else{
                bill += "Extra Toppings Added: 120\n";
            }
        }

        if(paperBagAdded){
            bill += "Paperbag Added: 20\n";
        }

        bill += "Total Price: " + this.price;
        return this.bill;
    }
}
