/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpattern.creational.abstractfactory;

import com.designpattern.creational.factory.*;

/**
 *
 * @author User
 */
public abstract class Car {
 
    public Car(CarType model, Location location) {
        this.model = model;
        this.location = location;
        arrangeParts();
    }
 
    private void arrangeParts() {
        // Do one time processing here
    }
 
    // Do subclass level processing in this method
    protected abstract void construct();
 
    private CarType model = null;
    private Location location = null;

 
    public CarType getModel() {
        return model;
    }
 
    public void setModel(CarType model) {
        this.model = model;
    }
    
    public String toString() {
        return "Model- "+model+" built in " + location;
    }
}