/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objectorientedprogramming;

/**
 *
 * @author Master
 */
public class Animal {
    private int limbs;
    private int weight;
    private String name;
    
    Animal(){
        
    }
    Animal(int limbs,int weight, String name)
    {
        this.limbs=limbs;
        this.weight=weight;
        this.name=name;
    }
    
    public void eat()
    {
        System.out.println("Eating food..");
    }
    
    public void sleep()
    {
        System.out.println("Sleeping");
    }
    
    public void setLimbs(int limbs)
    {
        this.limbs=limbs;
    }
    
    public int getLimbs()
    {
        return limbs;
    }
    
    public void setWeight(int weight){
        this.weight=weight;
    }
    
    public int getWeight()
    {
        return weight;
    }
    
    
    public void setName(String name)
    {
        this.name=name;
    }
    
    public String getName()
    {
        return name;
    }
    
    
}
