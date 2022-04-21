package com.bilgeadam.distributor;

import com.bilgeadam.distributor.interfaces.Distributor;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDistributor implements Distributor {

    private final AtomicInteger allRemainingShares = new AtomicInteger(0);

    @Override
    public boolean payShare(int shareAmount) {
        this.allRemainingShares.addAndGet(-shareAmount);
        return this.allRemainingShares.get() >= 0;
    }

    @Override
    public int getAllRemainingShares() {
        return allRemainingShares.get();
    }

    @Override
    public int setAllRemainingShares(int allRemainingShares) {
        return this.allRemainingShares.addAndGet(allRemainingShares);
    }
}
