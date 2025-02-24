package com.kodilla.abstracts.homework;

import static com.kodilla.abstracts.homework.Person.showJobResponsibilities;

public class JobsApplication {

    public static void main(String[] args) {

        Job doctor = new Doctor();
        Job fireman = new Fireman();
        Job teacher = new Teacher();
        Job tester = new Tester();

        Person person1 = new Person("Maciek", 28, fireman);
        Person person2 = new Person("Adam", 56, teacher);
        Person person3 = new Person("Alicja", 38, doctor);
        Person person4 = new Person("Gabi", 40, tester);
        Person person5 = new Person("Jola", 60, teacher);

        showJobResponsibilities(person1);
        showJobResponsibilities(person2);
        showJobResponsibilities(person3);
        showJobResponsibilities(person4);
        showJobResponsibilities(person5);
    }
}