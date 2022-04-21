package com.bilgeadam.distributor;

import com.bilgeadam.distributor.interfaces.Distributor;

import java.util.concurrent.Semaphore;

public class SemaphoreDistributor implements Distributor {

    private int allRemainingShares = 0;
    private final Semaphore mutex = new Semaphore(1);

    @Override
    public boolean payShare(int shareAmount) {
        try {
            this.mutex.acquire();
            this.allRemainingShares = this.allRemainingShares - shareAmount;
            this.mutex.release();
        }catch (InterruptedException interruptedException){
            System.err.println(interruptedException.getMessage());
        }

        return allRemainingShares >= 0;

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
