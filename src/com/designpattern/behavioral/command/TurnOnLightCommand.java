/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpattern.behavioral.command;

/**
 * Light stop Command where we are encapsulating both Object[light] and the
 * operation[turnOff] together as command. This is the essence of the command.
 *
 */
public class TurnOnLightCommand implements ICommand {
 
    Light light;
 
    public TurnOnLightCommand(Light light) {
        super();
        this.light = light;
    }
 
    public void execute() {
        System.out.println("Turning on light.");
        light.turnOn();
    }
}