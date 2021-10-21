package com.atmmachine.proxy;

import com.atmmachine.state.ATMState;

public interface GetATMData {
    public ATMState getATMState();

    public int getCashInMachine();
}
