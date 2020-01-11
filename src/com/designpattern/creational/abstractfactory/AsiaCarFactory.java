/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpattern.creational.abstractfactory;

/**
 *
 * @author User
 */
public class AsiaCarFactory
{
  public static Car buildCar(CarType model)
  {
    Car car = null;
    switch (model)
    {
      case SMALL:
      car = new SmallCar(Location.ASIA);
      break;
 
      case SEDAN:
      car = new SedanCar(Location.ASIA);
      break;
 
      case LUXURY:
      car = new LuxuryCar(Location.ASIA);
      break;
 
      default:
      //throw some exception
      break;
    }
    return car;
  }
}
