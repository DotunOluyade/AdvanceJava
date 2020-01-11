/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LowLevelDataTransfer;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author pearlsoft
 */
public class Receiver implements Runnable {

    private Data load;

    // standard constructors
    public Receiver() {
    }

    public Receiver(Data load) {
        this.load = load;
    }

    public void run() {
            for (String receivedMessage = load.receive();
                    !"End".equals(receivedMessage);
                    receivedMessage = load.receive()) {

                System.out.println(receivedMessage);

                // ...
                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    e.printStackTrace();
                }
            }
    }
}
