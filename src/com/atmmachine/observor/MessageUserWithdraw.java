package com.atmmachine.observor;

public class  MessageUserWithdraw implements Observer{

    @Override
    public void update(Message m ) {
        System.out.println("This is the sms");
        System.out.println("the amount you have deposited is "+ m.getMessageContent());
    
        
    }
    
}
