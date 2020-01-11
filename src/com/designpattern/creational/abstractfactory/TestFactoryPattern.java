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
public class TestFactoryPattern
{
  public static void main(String[] args)
  {
    System.out.println(CarFactory.buildCar(CarType.SMALL));
    System.out.println(CarFactory.buildCar(CarType.SEDAN));
    System.out.println(CarFactory.buildCar(CarType.LUXURY));
  }
}