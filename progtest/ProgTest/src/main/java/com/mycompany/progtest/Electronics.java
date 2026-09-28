/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.progtest;

/**
 *
 * @author Student
 */
public class Electronics {

    public static void main(String[] args) {
        
        //Array for cities
        String[] cities = { "Cape Town",
                            "Port Elizabeth",
                            "Pretoria"
        };
        
        //array for electronics
        String[] consoles = { "PS5",
                                "XBOX",
                                "SWITCH"
        
       
    };
        
       //2D array for the yearly sales
       int[][] sales = { 
           {1000,2000,3000},
           {2000,3000,4000},
           {1500,1100,1200}
       };
       
    
    System.out.println("================================");
    System.out.println("GAMING CONSOLE REPORT");
    System.out.println("===============================");
    
    
    System.out.printf("%-20s %-10s %-10s %-10s%n" ,"CITY", "PS5", "XBOX", "SWITCH");
    
    for( int i =0; i<cities.length; i++){
        System.out.printf("%-20s %-10s %-10s %-10s%n" cities[i], sales[i][0], sales[i][1], sales[i][2]);
        
    }
    }   
       
}
