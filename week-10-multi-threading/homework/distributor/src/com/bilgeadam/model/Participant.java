package com.bilgeadam.model;

import com.bilgeadam.distributor.interfaces.Distributor;

public class Participant {

    public Participant(int shareAmount){
        this.shareAmount = shareAmount;
    }

    private int shareAmount = 0;
    private boolean isShareCollect = false;

    public void collectShare(Distributor distributor){
        this.isShareCollect = distributor.payShare(shareAmount);
    }

    public boolean isShareCollect() {
        return isShareCollect;
    }

    public int getShareAmount() {
        return shareAmount;
    }
}
