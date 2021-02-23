# Basic Bank Account App

A simple bank account app that allows me to create an application to handle new customer bank account requests.

Specifications:
* Read a .csv file of names, social security numbers, account type and initial deposit 
* Use a data structure to hold all these accounts
* Both Savings and Checking accounts have the following properties: deposit(); withdrawal(); transfer(); showInfo(); 11-digit account number generated with the following process: 1 or 2 depending on savings of checking, last 2 digits of sun, unique 5-digit number and random 3-digit number
* Savings account holders are given a safety deposit box, identified by a 3-digit number and accessed with a 4-digit code
* Checking account holders are assigned a debit card with a 12-digit number and 4-digit pin
* Both accounts will use an interface that determines the base interest rate: Savings accounts will use .25 points less than the base rate; Checking accounts will use 15% of the base rate
* The showInfo method should reveal relevant account information as well as information specific to the checking account or savings account 

Updates: 
* General outline of the app defined
* To do: Properties, constructors and methods
