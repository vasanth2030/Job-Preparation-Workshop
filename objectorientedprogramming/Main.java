/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objectorientedprogramming;

/**
 *
 * @author Master
 */
public class Main {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.eat();
        dog.eat("Chicken");
        
        Coach coach=new TennisCoach();
        coach.motivation();
        coach.workout();
       
    }
    
}