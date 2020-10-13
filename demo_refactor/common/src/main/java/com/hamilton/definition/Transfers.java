package com.hamilton.definition;

import com.hamilton.contracts.TransfersContract;

public abstract class Transfers implements TransfersContract {

    @Override
    public void sendMoney() {
        System.out.println("sending money in $");
    }
}
