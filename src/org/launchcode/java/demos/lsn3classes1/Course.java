package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {
    private String subject;
    private String instructor;
    private ArrayList<Student> classRoster = new ArrayList<>();

    public Course(String subject, String instructor){
        this.subject = subject;
        this.instructor = instructor;
    }

    public void addStudent(Student student){
        classRoster.add(student);
    }

    public ArrayList<Student> getClassRoster(){
        return this.classRoster; //getter method, returned an array list of student which can be edited and manipulated
    }
    public void printClassRoster(){
        for(Student student: this.classRoster){
            System.out.println(student.getName()); //just prints to console, user can't do anything no edits, no returns
        }
    }
}
