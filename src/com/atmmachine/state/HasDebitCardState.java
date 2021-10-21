package com.atmmachine.state;

import java.util.Scanner;

public class HasDebitCardState implements AtmMachineState {
    Scanner sc = new Scanner(System.in);

    public void insertDebitCard(){
        System.out.println("Debit card is already inserted");
    }
    public void ejectDebitCard(){
        System.out.println("Debit card is ejected");

    }
    public void enterPin(){
        System.out.println("Pin is entered correctly");
    }
    public void withdrawMoney(){

                         
      
    }


}
