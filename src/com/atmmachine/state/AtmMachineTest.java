package com.atmmachine.state;

//import required classes and packages   
import java.util.Scanner;

import com.atmmachine.factory.Currency;
import com.atmmachine.factory.CurrencyFactory;
import com.atmmachine.observor.*;

//create ATMExample class to implement the ATM functionality  
public class AtmMachineTest {
    public static final String balance = null;

    // main method starts
    public static void main(String args[]) {

        // declare and initialize balance, withdraw, and deposit
        int balance = 1000;
        int deposit;
        int withdraw = 0;

        // Checking the state design pattern
        AtmMachine atmMachine = new AtmMachine();
        atmMachine.ejectDebitCard();
        atmMachine.insertDebitCard();
        atmMachine.insertDebitCard();

        //Testing the factory pattern and showing which currency is going to accepted by the ATM machine.
        Currency euro = CurrencyFactory.createCurrency("EUR");
        System.out.println("Curreny accepted by the this atm is " + euro);

        Currency dollar = CurrencyFactory.createCurrency("US");
        System.out.println("Currency accepted by this ATM is " + dollar);

        // create scanner class object to get choice of user
        Scanner sc = new Scanner(System.in);
        MessagePublisher publisher = new MessagePublisher();

        while (true) {
            System.out.println("Welcome to the ATM Machine\n");
            System.out.println("This ATM accepts only " + dollar + "Currency");
            System.out.println("Select the options for the below options: ");
            System.out.println("1. To deposit the amount");
            System.out.println("2. To withdraw the amount");
            System.out.println("3. To check the balance ");
            System.out.println("4. EXIT\n");
            System.out.print("Choose the operation:");

            // get choice from user
            int choice = sc.nextInt();
            switch (choice) {
            case 1:

                System.out.print("Enter money to be deposited:");

                // get deposite amount from te user
                deposit = sc.nextInt();

                // add the deposit amount to the total balanace
                balance = balance + deposit;
                System.out.println("Your Money has been successfully deposited");
                System.out.println("");

                // getting from the observoe pattern
                MessageUserDeposit msg = new MessageUserDeposit();
                
                publisher.attach(msg);
                publisher.notifyUpdate(new Message(balance));

                break;

            case 2:
                System.out.print("Enter money to be withdrawn:");

                withdraw = sc.nextInt();

                if (balance >= withdraw) {
                    // remove the withdrawl amount from the total balance
                    balance = balance - withdraw;
                    System.out.println("Please collect your money");
                } else {
                    // show custom error message
                    System.out.println("Insufficient Balance");
                }
                System.out.println("");

                // Checking the Observer pattern
                MessageUserWithdraw withdrawMsg = new MessageUserWithdraw();
                publisher.attach(withdrawMsg);

                break;

            case 3:
                System.out.println("Balance : " + balance);
                System.out.println("");
                break;

            case 4:
                // exit from the menu
                System.exit(0);
            }
        }
    }

}
