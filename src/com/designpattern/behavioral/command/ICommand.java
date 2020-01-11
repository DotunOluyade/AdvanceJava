/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpattern.behavioral.command;

/**
 *
 * @author User
 */
/**
 * Command Interface which will be implemented by the exact commands.
 *
 */
@FunctionalInterface
public interface ICommand {
    public void execute();
}
