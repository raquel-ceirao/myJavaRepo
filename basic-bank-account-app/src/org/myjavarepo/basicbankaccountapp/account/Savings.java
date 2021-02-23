package org.myjavarepo.basicbankaccountapp.account;

public class Savings extends Account {

    //properties specific to savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    //constructor to initialize savings account properties
    public Savings(String name, String socialSecurityNumber, double initialDeposit) {
        super(name, socialSecurityNumber, initialDeposit);
        accountNumber = "1" + accountNumber;
        //System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
        //System.out.println("NEW SAVINGS ACCOUNT");
        setSafetyDepositBox();
    }

    //methods specific to savings account

    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("ACCOUNT TYPE: Savings" +
                "\n Your Savings Account Features: " +
                "\n   Safety Deposit Box ID: " + safetyDepositBoxID +
                "\n   Safety Deposit Box Key: " + safetyDepositBoxKey);
    }

}
