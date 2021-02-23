package org.myjavarepo.basicbankaccountapp;

import org.myjavarepo.basicbankaccountapp.account.Checking;
import org.myjavarepo.basicbankaccountapp.account.Savings;

public class BankAccountApp {

    public static void main(String[] args) {

        //read a csv file and create new accounts based on that data

        Checking checkingAccount1 = new Checking("Joseph Joestar", "123456789", 1500);
        Savings savingsAccount1 = new Savings("Jotaro Kujo", "987654321", 2500);

        savingsAccount1.showInfo();
        System.out.println("*****");
        checkingAccount1.showInfo();
    }

}
