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
public abstract class Consoles implements iConsole {
    private String consoleType;
    private String store;
    private int totalSales;
    
    public Consoles( String consoleType, String store, int totalSales){
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
        
    }
    @Override
    public String getConsoleType() {
        return consoleType;
    
   
    
    
    public String getStore(){
            return store;
        }
     
    @Override
    public int getTotalSales(){
        return totalSales;
    }
        
    
}
    

