package org.myjavarepo.databaseapp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    //constructor to prompt name and year
    public Student() {
        Scanner in = new Scanner(System.in);

        System.out.print("\nEnter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("Enter student year: \n1) First Year Bachelor \n2) Second Year Bachelor \n3) Third year Bachelor \n4) Fourth Year Master \n5) Fifth Year Master");
        this.gradeYear = in.nextInt();

        setStudentID();

        //System.out.println(firstName + " " + lastName + ", Year " + gradeYear + " Student, ID " + studentID);

    }

    //generate an id = gradeYear + id
    private void setStudentID() {
        //everytime a student is created, increment 1 to the id
        id++;
        this.studentID = gradeYear + "" + id;
    }

    //enroll in courses
    public void enroll() {
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();

            if (!course.equals("Q")) {
                courses = courses + "\n   " + course;
                tuitionBalance = tuitionBalance + costOfCourse;

            } else { //if Q then break out of the loop
                break;
            }

        } while (1 != 0);

        //System.out.println("Enrolled in: " + courses);

    }

    //view balance
    public void viewBalance() {
        System.out.println("Your balance is: €" + tuitionBalance);
    }

    //pay tuition
    public void payTuition() {
        viewBalance();
        System.out.print("Enter your payment: €");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of €" + payment);
        viewBalance();
    }

    //show status of student
    @Override
    public String toString() {
        return "\nName: " + firstName + " " + lastName +
                "\nGrade Year: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses enrolled: " + courses +
                "\nBalance: €" + tuitionBalance;
    }

}
