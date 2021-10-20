package com.atmmachine.state;

public interface AtmMachineState {

   public void insertDebitCard();
   public void ejectDebitCard();
   public void enterPin();
   public int withdrawMoney(int withdraw, int balance);
}
