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
public class Sender implements Runnable {
    private Data data;
  
    // standard constructors

    public Sender() {
    }

    public Sender(Data data) {
        this.data = data;
    }
    
  
    public void run() {
        String packets[] = {
          "First packet",
          "Second packet",
          "Third packet",
          "Fourth packet",
          "End"
        };
  
        for (String packet : packets) {
            data.send(packet);
 
            // Thread.sleep() to mimic heavy server-side processing
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
            } catch (InterruptedException e)  {
                Thread.currentThread().interrupt(); 
                e.printStackTrace();
            }
        }
    }
}