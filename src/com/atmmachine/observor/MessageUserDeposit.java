package com.atmmachine.observor;


public class MessageUserDeposit implements Observer{

    @Override
    public void update(Message m ) {
        System.out.println("this is the sms ");
        System.out.println("the amount you have deposited is "+ m.getMessageContent());
    
        
    }
    
}
