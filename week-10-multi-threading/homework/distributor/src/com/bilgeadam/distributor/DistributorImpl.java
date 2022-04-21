package com.bilgeadam.distributor;

import com.bilgeadam.distributor.interfaces.Distributor;

public class DistributorImpl implements Distributor {

    int allRemainingShares = 0;

    @Override
    public boolean payShare(int shareAmount) {
        this.allRemainingShares = allRemainingShares - shareAmount;
        return this.allRemainingShares >= 0;
    }

    @Override
    public int getAllRemainingShares() {
        return this.allRemainingShares;
    }

    @Override
    public int setAllRemainingShares(int allRemainingShares) {
        this.allRemainingShares = allRemainingShares;
        return this.allRemainingShares;
    }
}
