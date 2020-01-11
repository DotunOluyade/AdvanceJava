/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LowLevelDataTransfer;




public class Data {
    private String packet;
     
    // True if receiver should wait
    // False if sender should wait
    private boolean transfer = true;
  
    public synchronized void send(String packet) {
        while (!transfer) {
            System.out.println("send: Receiving packets....");
            try { 
                wait();
                System.out.println("send: releasing lock...");
            } catch (InterruptedException e)  {
                Thread.currentThread().interrupt(); 
                e.printStackTrace();
            }
        }
        transfer = false;
        System.out.println("send: set transfer to false and calling notifyAll");

        this.packet = packet;
        notifyAll();
    }
  
    public synchronized String receive() {
        while (transfer) {
            System.out.println("receive: receiving packets....");
            try {
                wait();
                System.out.println("receive: releasing lock...");
            } catch (InterruptedException e)  {
                Thread.currentThread().interrupt(); 
                e.printStackTrace(); 
            }
        }
        transfer = true;
        System.out.println("receive: set transfer to true and calling notifyAll");
 
        notifyAll();
        System.out.println("receive:returning received packet");
        return packet;
    }
}
