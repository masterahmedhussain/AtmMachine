package com.atmmachine;

public class NoDebitCardState implements AtmMachineState{

    @Override
    public void insertDebitCard() {
        // TODO Auto-generated method stub
        System.out.println("Debit card inserted");
        
    }

    @Override
    public void ejectDebitCard() {
        // TODO Auto-generated method stub
        System.out.println("There is no card in the card slot");
        
    }

    @Override
    public void enterPin() {
        // TODO Auto-generated method stub
        System.out.println("There is no card into the card slot so you cannot enter the pin");
        
    }

    @Override
    public void withdrawMoney() {
        // TODO Auto-generated method stub
        System.out.println("Insert the card first to withdraw the money");
        
    }

    
}
