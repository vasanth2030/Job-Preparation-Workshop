/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objectorientedprogramming;

/**
 *
 * @author Master
 */
public class VolleyballCoach implements Coach {

    @Override
    public void workout() {
        System.out.println("Sprint 100m 5 times");
    }

    @Override
    public void motivation() {
        System.out.println("Failures are stepping stones to success");
    }
    
}
