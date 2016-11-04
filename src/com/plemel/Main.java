package com.plemel;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Add course data
        ArrayList<ITECCourse> courseMaster = new ArrayList<>();
        ITECCourse Java = new ITECCourse("Java", 2545, 24, "T3050");
        Java.addStudent("Jen");
        Java.addStudent("Ben");
        Java.addStudent("Patrick");
        Java.addStudent("Marie");
        Java.addStudent("Kara");
        Java.addStudent("Nnamdi");

        ITECCourse CSharp = new ITECCourse("C#", 2401, 24, "T3010");
        CSharp.addStudent("Jen");
        CSharp.addStudent("Ben");
        CSharp.addStudent("Andrew");
        CSharp.addStudent("Kara");
        CSharp.addStudent("Matthew");

        ITECCourse SQL = new ITECCourse("SQL Server", 1460, 4, "T3030");
        SQL.addStudent("Jen");
        SQL.addStudent("Donald");
        SQL.addStudent("Jeff");
        SQL.addStudent("Boris");
        SQL.addStudent("Momo");
        SQL.addStudent("Marie");

        ITECCourse ITConcepts = new ITECCourse("Info Tech Concepts", 1100, 30, "T3050");
        ITConcepts.addStudent("Max");
        ITConcepts.addStudent("Nancy");
        ITConcepts.addStudent("Orson");

        courseMaster.add(ITConcepts);


        //print out user friendly information
        for(ITECCourse ob:courseMaster)
        {
            System.out.println(ob.getName()+ " has "+ob.getFreeSeats()+ " free spaces");
        }

    }
}
