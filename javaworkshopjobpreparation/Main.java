/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaworkshopjobpreparation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Master
 */
public class Main {

    public static void main(String[] args) throws IOException {
       
        String name;
        int age;
        double height;  // type casting
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name: ");
        name=br.readLine();
        
        System.out.println("Enter age: ");
        age=Integer.parseInt(br.readLine());
        
        System.out.println("Enter height: ");
        height=Double.parseDouble(br.readLine());
        
        
        System.out.println("Hello");
        System.out.println("Name: "+name);
        System.out.println("Age: "+ age);
        System.out.println("Height: "+height);
        
        
    }    
    
}