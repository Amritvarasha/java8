package com.learnJava.designPatterns.Creational.builder.build1;

public enum Size {
    SMALL {
        public float getCost() {
            return 10;
        }
    },
    MEDIUM {
        public float getCost () {
            return 30;
        }
    },
    LARGE {
        public float getCost () {
            return 50;
        }
    };
    public abstract float getCost();
}

