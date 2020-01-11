/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpattern.structural.facade;

/**
 *
 * @author User
 */

public class Main 
{ 
    public static void main(String[] args) throws Exception
    {
        ReportGeneratorFacade reportGeneratorFacade = new ReportGeneratorFacadeImpl();
         
        reportGeneratorFacade.generateReport(ReportType.HTML, null, null);
         
        reportGeneratorFacade.generateReport(ReportType.PDF, null, null);
    }
}