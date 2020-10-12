package com.company;

public class Person  {
    String name;
    String surname;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void attendUniversity(){
        System.out.println("Person attents univeristy, name: " + name);
    }
}
