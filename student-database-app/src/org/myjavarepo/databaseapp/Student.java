package org.myjavarepo.databaseapp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;

    //constructor to prompt name and year
    public Student() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("Enter student year: \n1) First Year Bachelor \n2) Second Year Bachelor \n3) Third year Bachelor \n4) Fourth Year Master \n5) Fifth Year Master");
        this.gradeYear = in.nextInt();

        setStudentID();

        System.out.println(firstName + " " + lastName + ", Year " + gradeYear + " Student, ID " + studentID);

    }

    //generate an id = gradeYear + id
    private void setStudentID() {
        //everytime a student is created, increment 1 to the id
        id++;
        this.studentID = gradeYear + "" + id;
    }

    //enroll in courses

    //view balance

    //pay tuition

    //show status of student

}
