package com.learnJava.designPatterns.Creational.builder.build1;

public class Pizza {
    private Size size;
    private Cheese cheese;
    private Topping topping;
    private Crust crust;

    private float totalPrice = 0;

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public Topping getTopping() {
        return topping;
    }

    public void setTopping(Topping topping) {
        this.topping = topping;
    }

    public Crust getCrust() {
        return crust;
    }

    public void setCrust(Crust crust) {
        this.crust = crust;
    }

 public void addToPrice(float price){
        this.totalPrice = totalPrice+price;
 }

}
