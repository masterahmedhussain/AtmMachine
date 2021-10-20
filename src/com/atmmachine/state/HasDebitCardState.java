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
    public int withdrawMoney(int withdraw , int balance){

                         
        //check whether the balance is greater than or equal to the withdrawal amount  
        if(balance >= withdraw)  
        {  
            //remove the withdrawl amount from the total balance  
            balance = balance - withdraw;  
            System.out.println("Please collect your money");  
        }  
        else  
        {  
            //show custom error message   
            System.out.println("Insufficient Balance");  
        }  
        return balance;
    }


}
