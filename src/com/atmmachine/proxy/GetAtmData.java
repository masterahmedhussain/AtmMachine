package com.atmmachine.proxy;

import com.atmmachine.state.AtmMachineState;

public interface GetAtmData {

    public AtmMachineState  getAtmData();
    public int getCashInMachine();
    
}
