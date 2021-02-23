package org.myjavarepo.basicbankaccountapp.account;

public class Checking extends Account {

    //properties specific to checking account
    private int debitCardNumber;
    private int debitCardPin;

    //constructor to initialize checking account properties
    public Checking(String name, String socialSecurityNumber, double initialDeposit) {
        super(name, socialSecurityNumber, initialDeposit);
        accountNumber = "2" + accountNumber;
        //System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
        //System.out.println("NEW CHECKING ACCOUNT");
        setDebitCard();
    }

    //methods specific to checking account
    private void setDebitCard() {
        debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        debitCardPin = (int) (Math.random() * Math.pow(10, 4));
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("ACCOUNT TYPE: Checking" +
                "\n Your Checking Account Features: " +
                "\n   Debit Card Number: " + debitCardNumber +
                "\n   Debit Card PIN: " + debitCardPin);
    }

}
