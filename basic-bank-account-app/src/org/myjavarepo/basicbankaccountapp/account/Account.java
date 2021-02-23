package org.myjavarepo.basicbankaccountapp.account;

import org.myjavarepo.basicbankaccountapp.InterestRate;

public abstract class Account implements InterestRate { //implement from somewhere else

    //common properties for savings and checking accounts
    private String name;
    private String socialSecurityNumber;
    private double balance;

    static int index = 10000;
    protected String accountNumber;
    private double rate;

    //constructor to set base properties and initialize the account
    public Account(String name, String socialSecurityNumber, double initialDeposit) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        balance = initialDeposit;
        //System.out.println("NAME: " + name + "; Social Security Number: " + socialSecurityNumber + "; Balance: €" + balance);

        //set account number
        index++;
        this.accountNumber = setAccountNumber();
    }

    //common methods

    private String setAccountNumber() {
        String lastTwoNumbers = socialSecurityNumber.substring(socialSecurityNumber.length() - 2, socialSecurityNumber.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3)); //sometimes gives >3 numbers, check it later
        return lastTwoNumbers + uniqueID + randomNumber;
    }

    public void showInfo() {
        System.out.println(
                "NAME: " + name + "\nACCOUNT NUMBER: " + accountNumber + "\nBALANCE: €" + balance
        );
    }
}
