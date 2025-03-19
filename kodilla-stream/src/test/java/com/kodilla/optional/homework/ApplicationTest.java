package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTest {

    @Test
    public void shouldReturnTeacherNameOrUndefinedIfTeacherIsNull() {

        Student student1 = new Student("Alexis Ventura", new Teacher("Mark Ponce"));
        Student student2 = new Student("Niko Stark", null);
        Student student3 = new Student("Kamilah Robinson", null);
        Student student4 = new Student("Cayson McDonald", new Teacher("Zion Sims"));

        assertEquals("Mark Ponce", student1.getTeacher().getName());
        assertEquals("<undefined>", student2.getTeacher().getName());
        assertEquals("<undefined>", student3.getTeacher().getName());
        assertEquals("Zion Sims", student4.getTeacher().getName());
    }
}