/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objectorientedprogramming;

/**
 *
 * @author Master
 */
public class Dog extends Animal {
    public void newMethod()
    {
        System.out.println("New method");
    }
    
    @Override
    public void eat()
    {
        super.eat();
    }
    
    public void eat(String food)
    {
        System.out.println("Eating "+food);
    }
    
}
