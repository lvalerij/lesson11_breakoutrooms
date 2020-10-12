package com.company;

public class AdministativeStaff extends Person  {

    String profession;
    int salary;


    public AdministativeStaff(String profession, int salary) {
        this.profession = profession;
        this.salary = salary;
    }

    @Override
    public void attendUniversity() {
        System.out.println("Admin staff attends university, name: " + name);
    }
}
