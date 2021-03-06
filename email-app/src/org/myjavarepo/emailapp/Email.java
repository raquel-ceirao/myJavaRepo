package org.myjavarepo.emailapp;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "mycompany.com";

    //constructor for first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        //System.out.println("Email created for user: " + this.firstName + " " + this.lastName + "\n");

        //call a method asking for the department and return the department
        this.department = setDepartment();
        //System.out.println("Department: " + this.department);

        //call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("\nRANDOM PASSWORD: " + this.password);

        //generate an email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix.toLowerCase();
        //System.out.println("Your email is: " + email);
    }

    //ask for the department, don't print the line but prompt the user
    private String setDepartment() {

        System.out.print("Welcome New User: " + firstName + "\nSelect a Department: \n 1) Sales; \n 2) Development; \n 3) Accounting; \n 0) None; \n\nEnter your Department: ");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();

        if(departmentChoice == 1) {
            return "Sales";
        } else if(departmentChoice == 2) {
            return "Development";
        } else if(departmentChoice == 3) {
            return "Accounting";
        } else {
            return "Guest";
        }
    }

    //generate a random password
    private String randomPassword(int length) {
        String passwordOptions = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        //array of characters with the determined length
        char[] passwordArray = new char[length];

        for(int i = 0; i < length; i++) {
            //cast as int and randomize
            int randomCharacters = (int) (Math.random() * passwordOptions.length());
            //add one random character at a time
            passwordArray[i] =  passwordOptions.charAt(randomCharacters);

        }

        String password = new String(passwordArray);
        return password;
    }

    //set the mailbox capacity
    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    //set the alternate email
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    //change the password
    public void setPassword(String password) {
        this.password = password;
    }

    //getters
    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String showInfo() {
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + " mb";
    }
}
