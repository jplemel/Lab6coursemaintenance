package com.plemel;

/**
 * Created by Jennifer Plemel on 10/30/2016.
 */
import java.util.ArrayList;
import java.util.Objects;

/**
 Modify ITECCourseManager so that it adds all of the ITECCourse objects are stored in an
 ArrayList<ITECCourse>.
 Add a method to ITECCourse that returns the number of free spaces in the class.
 Back in ITECCourseManager, loop over all of the ITECCourse objects and print the name of
 course and the number of free spaces in each.
 */
public class ITECCourse
{
    private int maxStudents;
    private String name;
    private String classroom;
    private int code;
    private ArrayList<String> students;


    //get set methods for class properties

    public int getMaxStudents(){return maxStudents;}

    public  void setMaxStudents(int maxStudents){this.maxStudents = maxStudents;}

    public String getName(){return name;}

    public void setName(String name){this.name = name;}

    public String getClassroom() {return classroom;}

    public void setClassroom(String classroom) {this.classroom = classroom;}

    public int getCode(){return code;}

    public void setCode(int code){this.code = code;}

    //constructor
    public ITECCourse(String courseName, int courseCode, int courseMaxStudents, String classroom){
        this.name = courseName;
        this.code = courseCode;
        this.students = new ArrayList<String>();
        this.maxStudents = courseMaxStudents;
        this.classroom = classroom;
    }
    public ITECCourse(String courseName, int courseCode, int courseMaxStudents){
        this.name = courseName;
        this.code = courseCode;
        this.students = new ArrayList<String>();
        this.maxStudents = courseMaxStudents;
        this.classroom = "Not Identified";
    }
    public void addStudent(String studentName){
        if(this.students.size()<maxStudents)
        {
            this.students.add(studentName);
        }
        else{
            System.out.println(this.name+" is full");
            System.out.println(studentName+ " not enrolled in "+this.name);
        }
    }
    public void writeCourseInfo(){
        System.out.println("Course Name: " + this.name);
        System.out.println("Course Code: " + this.code);
        System.out.println("Course Classroom: " + this.classroom);
        System.out.println("Students enrolled:");
        for (String student : this.students) {
            System.out.println(student);
        }
        System.out.println("There are " + getNumberOfStudents() +
                " students enrolled");
        System.out.println("The max number of students for this course is "
                + this.maxStudents);
    }
    int getNumberOfStudents(){
        return this.students.size();
    }

    public int getFreeSeats(){
        int freeSeats = this.getMaxStudents()-this.getNumberOfStudents();
        return freeSeats;
    }
}
