/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpattern.structural.facade;

import javax.activation.DataSource;

/**
 *
 * @author User
 */
interface ReportGeneratorFacade {
     public abstract void generateReport(ReportType type, DataSource dataSource, String location);
}
