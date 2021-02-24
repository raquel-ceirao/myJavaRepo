package org.myjavarepo.basicbankaccountapp;

public interface InterestRate {

    //method that returns a base rate
    default double getBaseRate() {
        return 2.5;
    }
}
