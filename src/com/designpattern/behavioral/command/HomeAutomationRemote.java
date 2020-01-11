/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Remote Control for Home automation where it will accept the command and
 * execute. This is the invoker in terms of command pattern terminology
 */
public class HomeAutomationRemote {
     
    //Command Holder
    List<ICommand> command = new ArrayList<>();
 
    //Set the command in runtime to trigger.
    public void setCommand(ICommand command) {
        this.command.add(command);
    }
 
    //Will call the command interface method so that particular command can be invoked.
    public void buttonPressed() {
        for(ICommand com : command) {
           com.execute();
        }
    }
}
