package com.bilgeadam;

import com.bilgeadam.distributor.AtomicDistributor;
import com.bilgeadam.distributor.DistributorImpl;
import com.bilgeadam.distributor.SemaphoreDistributor;
import com.bilgeadam.distributor.interfaces.Distributor;
import com.bilgeadam.simulator.ShareSimulator;

public class Main {

    public static void main(String[] args) {
        ShareSimulator simulator = new ShareSimulator();

        Distributor atomicDistributor = new AtomicDistributor();
        simulator.simulate(atomicDistributor);

        Distributor semaphoreDistributor = new SemaphoreDistributor();
        simulator.simulate(semaphoreDistributor);

        Distributor distributor = new DistributorImpl();
        simulator.simulate(distributor);
    }
}
