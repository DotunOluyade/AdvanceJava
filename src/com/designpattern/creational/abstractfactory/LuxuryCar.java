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
public class LuxuryCar extends Car {
 
    LuxuryCar(Location location) {
        super(CarType.LUXURY,location);
        construct();
    }
 
    @Override
    protected void construct() {
        System.out.println("Building luxury car");
        // add accessories
    }
}
