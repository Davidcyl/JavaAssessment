package com.generation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student
    extends Person
    implements Evaluation
{

    float PASS_MIN_GRADE = 3.0f;
    private ArrayList<Course> enrolledCourses;

    public Student( String id, String name, String email, Date birthDate )
    {

        super( id, name, email, birthDate );
        //create an empty enrolledCourses ArrayList
        enrolledCourses = new ArrayList<>();

    }

    public void enrollToCourse( Course course )
    {
        //TODO
        enrolledCourses.add(course);
    }

    @Override
    public List<Course> findPassedCourses()
    {
        //TODO

        return null;
    }

    public Course findCourseById(String courseId )
    {
        //TODO
        if (enrolledCourses.contains(courseId)) {

            return enrolledCourses.get(Integer.parseInt(courseId));
        }

       return null;
    }

    @Override
    public List<Course> getEnrolledCourses()
    {
        //TODO
        return null;
    }

    @Override
    public String toString()
    {
        return "Student {" + super.toString() + "} + Enrolled Courses " + this.enrolledCourses;
    }


}
