package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.Map;

public class SchoolPractice {
    public static void main(String[] args) {
        Student newStudent = new Student("Emily",34, 27);
        System.out.println(newStudent.getName());
        Student corey = new Student("Corey",23, 30);

        System.out.println(newStudent.getName());

        Course english = new Course("English", "Mr. Feeney");

        english.addStudent(newStudent);
        english.addStudent(corey);

        ArrayList<Student> roster = english.getClassRoster(); //save getter method in array list
        for (Student student: roster){ //pulls out a single student
            System.out.println(student.getName()); //uses getter on the student object of get name
        }
    }
}
