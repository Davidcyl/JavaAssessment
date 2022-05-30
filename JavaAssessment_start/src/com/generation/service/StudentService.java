package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.*;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        //TODO Register student
        students.put(student.getId(), student);
        System.out.println("Student Successfully Registered!");
    }

    public Student findStudent( String studentId )
    {
        //TODO Find student that was registered
        if (students.containsKey(studentId)) {
            return students.get(studentId);
        }
        return null;
    }

    public boolean showSummary()
    {
        //TODO
        if (students!=null) {
            System.out.println(students);
            return true;
        }
        return false;
    }

    public void enrollToCourse( String studentId, Course course )
    {
        //TODO
        if (students.containsKey(studentId)) {
            students.get(studentId).enrollToCourse(course);
        }
    }
}
