package com.learnJava.designPatterns.Creational.singleton;

public class Singleton {
    private  static  Singleton INSTANCE;
    private Singleton(){}
    public static Singleton getInstance(){
        if(INSTANCE==null){
            synchronized (Singleton.class){
                if(INSTANCE==null){
                    INSTANCE = new Singleton();
                }
            }

        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        if(s1==s1){
            System.out.println("Object are same "+s1);
        }else
        {
            System.out.println("Object are not same");
        }
    }
}
