/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progtest;

/**
 *
 * @author Student
 */
//question 2
public class ConsoleSales extends Consoles {
    
    public ConsoleSales(String consoleType, String store, int totalSales){
        
        //calling the consoles constructor
        super(consoleType, store, totalSales);
    }
    public void printReport(){
        System.out.println("Console type:" + getConsoleType() );
        System.out.println("Store name:" + getStore() );
        System.out.println("Total number of sales:" + getTotalSales() );
        
    }

    
}
