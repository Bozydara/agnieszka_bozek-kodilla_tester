package com.kodilla.abstracts.homework;

public class Person {
    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public static void showJobResponsibilities(Person person) {

        System.out.println(person.firstName + " (age: " + person.age + ") " + "is " + person.job.getResponsibilities() + ".");
    }
}