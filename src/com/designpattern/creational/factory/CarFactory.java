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
public class CarFactory {
    public static Car buildCar(CarType model) {
        Car car = null;
        switch (model) {
        case SMALL:
            car = new SmallCar();
            break;
 
        case SEDAN:
            car = new SedanCar();
            break;
 
        case LUXURY:
            car = new LuxuryCar();
            break;
         case BENTLEY:
            car = new BentleyCar();
            break;    
        default:
            // throw some exception
            break;
        }
        return car;
    }
}
