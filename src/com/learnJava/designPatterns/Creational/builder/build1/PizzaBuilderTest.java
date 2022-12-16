package com.learnJava.designPatterns.Creational.builder.build1;

public class PizzaBuilderTest {
    public static void main(String[] args) {
        Pizza pizza = new PizzaBuilder()
                .withCrust(Crust.THIN)
                .withToppings(Topping.CHICKEN)
                .withSize(Size.LARGE)
                .build();
        System.out.println(Topping.CHICKEN+" "+pizza.getTopping());
        System.out.println(Size.LARGE+" "+pizza.getSize());
        System.out.println(Crust.THIN+" "+pizza.getCrust());
        System.out.println(pizza.getTotalPrice());



    }
}
