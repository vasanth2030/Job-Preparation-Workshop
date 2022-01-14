/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objectorientedprogramming;

/**
 *
 * @author Master
 */
public class TennisCoach implements Coach {

    @Override
    public void workout() {
        System.out.println("Shuttle run for 30 minutes");
        
    }

    @Override
    public void motivation() {
        System.out.println("Never give up");
    }
    
}
