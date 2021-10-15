package com.atmmachine;

public class HasDebitCard implements AtmMachineState {
    public void insertDebitCard(){
        System.out.println("Debit card is already inserted");
    }
    public void ejectDebitCard(){
        System.out.println("Debit card is ejected");

    }
    public void enterPin(){
        System.out.println("Enter the pin");
    }
    public void withdrawMoney(){
        System.out.println("Enter the pin first");
    }


}
