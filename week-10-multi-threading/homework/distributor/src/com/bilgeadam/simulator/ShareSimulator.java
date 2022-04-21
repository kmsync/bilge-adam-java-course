package com.bilgeadam.simulator;

import com.bilgeadam.distributor.interfaces.Distributor;
import com.bilgeadam.model.Participant;
import com.bilgeadam.threads.DistributorThread;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ShareSimulator {

    public void simulate(Distributor distributor) {
        int allShares = 100_000;
        int numberOfParticipant = 1000;
        int sharePerParticipant = allShares / numberOfParticipant;
        distributor.setAllRemainingShares(allShares);

        List<DistributorThread> distributorThreads = this.prepareDistributorThread(sharePerParticipant
                , numberOfParticipant
                , distributor);

        this.distributorAction(distributorThreads, Thread::start);
        this.distributorAction(distributorThreads, (a) -> {
            try {
                a.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println(distributor.getClass().getSimpleName() + " bitirdi. Elinde kalan miktar: " + distributor.getAllRemainingShares());

        if (distributor.getAllRemainingShares() != 0) {
            System.out.println(distributor.getClass().getSimpleName() + " BAŞARISIZ !!!!");
        } else {
            System.out.println(distributor.getClass().getSimpleName() + " başarılı bir şekilde payları dağıttı.");
        }

    }

    public List<DistributorThread> prepareDistributorThread(int sharePerParticipant,
                                                            int numberOfParticipant,
                                                            Distributor distributor) {
        List<DistributorThread> distributorThreads = new ArrayList<>();
        for (int i = 0; i < numberOfParticipant; i++) {
            Participant participant = new Participant(sharePerParticipant);
            DistributorThread distributorThread = new DistributorThread(distributor, participant);
            distributorThreads.add(distributorThread);
        }
        return distributorThreads;
    }

    public void distributorAction(List<DistributorThread> distributorThreads,
                                  Consumer<DistributorThread> distributorThreadConsumer) {
        for (int i = 0; i < distributorThreads.size(); i++) {
            distributorThreadConsumer.accept(distributorThreads.get(i));
        }
    }
}
