package com.company;
@FunctionalInterface
interface Animal{
    void bark();
}
//class Dog implements  Animal{
//    @Override
//    public void bark()
//    {
//        System.out.println("Dog barks!!");
//    }
//}


public class Anonymousclass {
    public static void main(String[] args) {
//        Dog bruno=new Dog();
//        bruno.bark();
        //using Anonymous class
        Animal bruno = new Animal() {
            @Override
            public void bark() {
                System.out.println("Dog barks!!!");
            }

        };
        bruno.bark();
    }
}
