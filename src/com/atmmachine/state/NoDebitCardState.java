package com.atmmachine.state;

public class NoDebitCardState implements AtmMachineState{

    @Override
    public void insertDebitCard() {
        System.out.println("Debit card inserted");
        
    }

    @Override
    public void ejectDebitCard() {
        System.out.println("There is no card in the card slot");
        
    }

    @Override
    public void enterPin() {
        System.out.println("There is no card into the card slot so you cannot enter the pin");
        
    }

    @Override
    public void withdrawMoney() {
    }
    
}
