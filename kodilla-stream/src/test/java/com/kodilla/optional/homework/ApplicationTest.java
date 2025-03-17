package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ApplicationTest {

    @Test
    public void shouldDisplayStudentAndTeacherNames() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alexis Ventura", new Teacher("Mark Ponce")));
        students.add(new Student("Cayson McDonald", new Teacher("Zion Sims")));
        students.add(new Student("Matthew Jackson", new Teacher("Felipe Dorsey")));

        Application.displayStudentAndTeacherNames(students);
    }

    @Test
    public void shouldDisplayStudentNameAndUndefinedIfTeacherIsNull() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Josue George", null));
        students.add(new Student("Niko Stark", null));
        students.add(new Student("Kamilah Robinson", null));
        students.add(new Student("Cruz Vazquez", null));

        Application.displayStudentAndTeacherNames(students);
    }
}