package com.learnJava.designPatterns.Creational.builder.build1;

public enum Topping {
    PEPPERONI {
        public float getCost() {
            return 100;
        }
    },
    CHICKEN {
        public float getCost () {
            return 200;
        }
    },
    MUSHROOM {
        public float getCost () {
            return 150;
        }
    };
    public abstract float getCost();
}

