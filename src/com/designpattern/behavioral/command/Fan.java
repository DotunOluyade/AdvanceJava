/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpattern.behavioral.command;

/**
 * Fan class is a Receiver component in command pattern terminology.
 *
 */
public class Fan {
    void start() {
        System.out.println("Fan Started..");
 
    }
 
     void stop() {
        System.out.println("Fan stopped..");
 
    }
}