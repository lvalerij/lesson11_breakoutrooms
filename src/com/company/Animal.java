package com.company;

public class Animal {
    int speed;
    int weight;
    int height;
    int age;

    void eat() {
        System.out.println("I'm eating");
    }
    void walk() {
        System.out.println("I'm walking");
    }
    void makeSound() {
        System.out.println("I create some sound");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();

    }
}
