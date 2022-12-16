package com.learnJava.designPatterns.Creational.builder.build1;

public enum Crust {
    THIN {
        public float getCost() {
            return 70;
        }
    },
    STUFFED {
        public float getCost () {
            return 50;
        }
    },
    THICK {
        public float getCost () {
            return 20;
        }
    };
    public abstract float getCost();
}

