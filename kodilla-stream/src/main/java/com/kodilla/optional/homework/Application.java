package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Killian Rogers", new Teacher("Willie Butler")));
        students.add(new Student("Josue George", null));
        students.add(new Student("Niko Stark", null));
        students.add(new Student("Kamilah Robinson", null));
        students.add(new Student("Cruz Vazquez", null));
        students.add(new Student("Alexis Ventura", new Teacher("Mark Ponce")));
        students.add(new Student("Cayson McDonald", new Teacher("Zion Sims")));
        students.add(new Student("Matthew Jackson", new Teacher("Felipe Dorsey")));
        students.add(new Student("Dylan Gallagher", new Teacher("Rivka Sanchez")));
        students.add(new Student("Stanley Brock", null));

        displayStudentAndTeacherNames(students);
    }

    public static void displayStudentAndTeacherNames(List<Student> students) {
        for (Student student : students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            Teacher teacherName = optionalTeacher.orElse(new Teacher("<undefined>"));
            System.out.println("student: " + student.getName() + ", teacher: " + teacherName.getName());
        }
    }
}