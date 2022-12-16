package com.learnJava.sample;
@FunctionalInterface
interface Show{
    void speak();
    String toString();
}
public class InterfaceTest {
    public static void main(String[] args) {
  Show s1 = new Show() {
      @Override
      public void speak() {
          System.out.println("Av is here");
      }
  };
        Show s2 = new Show() {
            @Override
            public void speak() {
                System.out.println("NO one is here");
            }
        };
  s1.speak();
  s2.speak();
}
}
