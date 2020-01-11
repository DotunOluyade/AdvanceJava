/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpattern.behavioral.command;

/**
 * Fan Start Command where we are encapsulating both Object[fan] and the
 * operation[start] together as command. This is the essence of the command.
 *
 */
public class StartFanCommand implements ICommand {
 
    Fan fan;
 
    public StartFanCommand(Fan fan) {
        super();
        this.fan = fan;
    }
 
    public void execute() {
        System.out.println("starting Fan.");
        fan.start();
    }
}