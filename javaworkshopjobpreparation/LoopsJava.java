/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaworkshopjobpreparation;

/**
 *
 * @author Master
 */
public class LoopsJava {
    public static void main(String[] args) {
        String name="Vasanth";
        int i=0;
        while(i<10)
        {
            System.out.println(name+" "+(i+1));
            i++;
        }
        
        i=0;
        System.out.println();
        
        do{
            System.out.println("Inside do while");
        }while(i!=0);
        
        System.out.println();
   
        
        for(i=0;i<10;i++)
        {
            System.out.println(name+" "+(i+1));
        }
        
        System.out.println("Outside Loop");
    }
}
