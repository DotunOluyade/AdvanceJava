/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpattern.creational.factory;

/**
 *
 * @author User
 */
public class SedanCar extends Car {
 
    SedanCar() {
        super(CarType.SEDAN);
        construct();
    }
 
    @Override
    protected void construct() {
        System.out.println("Building sedan car");
        // add accessories
    }
}