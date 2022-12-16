package com.learnJava.designPatterns.Creational.builder.build1;

public enum Cheese {
    AMERICAN {
        public float getCost() {
            return 40;
        }
    },
        IATALIAN {
            public float getCost () {
                return 60;
            }
        },
            INDIAN {
                public float getCost () {
                    return 20;
                }
            };
    public abstract float getCost();
    }

