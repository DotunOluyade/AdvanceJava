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
import javax.activation.DataSource;
 
public class ReportGeneratorFacadeImpl implements ReportGeneratorFacade
{
    public void generateReport(ReportType type, DataSource dataSource, String location) 
    {
        if(type == null || dataSource == null) 
        {
            //throw some exception
        }
        //Create report
        Report report = new Report();
         
        report.setHeader(new ReportHeader());
        report.setFooter(new ReportFooter());
         
        //Get data from dataSource and set to ReportData object
         
        report.setData(new ReportData());
         
        //Write report
        ReportWriter writer = new ReportWriter();
        switch(type) 
        {
            case HTML:
                writer.writeHtmlReport(report, location);
                break;
                 
            case PDF:
                writer.writePdfReport(report, location);
                break;
        }
    }
}