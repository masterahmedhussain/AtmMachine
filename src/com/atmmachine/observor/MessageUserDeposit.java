package com.atmmachine.observor;

import com.atmmachine.state.AtmMachineTest;

public class MessageUserDeposit implements Observer{

    @Override
    public void update(Message m ) {
        // TODO Auto-generated method stub
        System.out.println("the amount you have deposited is "+ m.getMessageContent());
    
        
    }
    
}
