package com.atmmachine;

public interface AtmMachineState {

   public void insertDebitCard();
   public void ejectDebitCard();
   public void enterPin();
   public void withdrawMoney();
}
