package org.myjavarepo.emailapp;

public class Main {

    public static void main(String[] args) {

        Email email = new Email("Raquel", "Ceirao");

        email.setAlternateEmail("raquel.ceirao@unicorndust.com");
        System.out.println("ALTERNATE EMAIL: " + email.getAlternateEmail());

        //System.out.println("\nOriginal Mailbox Capacity: " + email.getMailboxCapacity());
        email.setMailboxCapacity(600);

        email.setPassword("UNICORNDUST@42!");
        System.out.println("NEW PASSWORD: " + email.getPassword());

        System.out.println(email.showInfo());
    }
}
