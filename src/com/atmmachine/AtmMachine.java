package com.atmmachine;

public class AtmMachine {

    AtmMachineState HasDebitCard;
    AtmMachineState NoDebitCard;

    public void insertDebitCard() {
        System.out.println("Debit card is inserted");
    }

    public void ejectDebitCard() {
        System.out.println("debit card is removed");

    }

    public void enterPin() {
        // have to add functionality
        System.out.println("Enter the pin ");

    }

    public void withdrawMoney() {
        // have to add the functionality

    }

    public void checkBalance() {
        // have to a0dd the functionality
    }

}
