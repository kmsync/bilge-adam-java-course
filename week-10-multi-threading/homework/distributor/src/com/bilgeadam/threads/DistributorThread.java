package com.bilgeadam.threads;

import com.bilgeadam.distributor.interfaces.Distributor;
import com.bilgeadam.model.Participant;

public class DistributorThread extends Thread{

    public DistributorThread(Distributor distributor, Participant participant){
        this.distributor = distributor;
        this.participant = participant;
    }

    private final Distributor distributor;

    private final Participant participant;

    @Override
    public void run(){
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        participant.collectShare(distributor);
    }
}
