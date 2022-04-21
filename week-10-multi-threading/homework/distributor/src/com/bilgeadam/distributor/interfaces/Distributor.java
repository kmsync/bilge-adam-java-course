package com.bilgeadam.distributor.interfaces;

public interface Distributor {

    boolean payShare(int shareAmount);
    int getAllRemainingShares();
    int setAllRemainingShares(int allRemainingShares);
}
