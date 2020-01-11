/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpattern.behavioral.command;

/**
 * Light is a Receiver component in command pattern terminology.
 *
 */
public class Light {
    public  void turnOn() {
        System.out.println("Light is on");
    }
 
    public void turnOff() {
        System.out.println("Light is off");
    }
}