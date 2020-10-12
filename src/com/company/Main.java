package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Univesity univesity = new Univesity();

        Student student = new Student();
        //name John, surname Connor, programm Math
        student.setProgramm("Math");
        student.setStartingDay("1 Sep 2020");
        student.setYear("1");
        student.setName("John");
        student.setSurname("Connor");

        Person teacher1 = new Teacher();
        teacher1.name = "Arnold";
        teacher1.surname = "Schwarzenegger";

        AdministativeStaff administativeStaff = new AdministativeStaff(
                "Director", 100000000
        );
        administativeStaff.name = "Friedrich";
        administativeStaff.surname = "Miller";

        univesity.universityPeople.add(student);
        univesity.universityPeople.add(teacher1);
        univesity.universityPeople.add(administativeStaff);

        //student.attendUniversity();
        //teacher1.attendUniversity();

        for (Person person: univesity.universityPeople) {
            person.attendUniversity();
        }
    }
}

 /*


            administration

            programs
            requirements for appllication
            faculties/deparments
            semester
            scolarships/projects
        */

        /*
        methods(with parameters) inside classes
        class
        objects
        arrays
        loops/conditions
        */