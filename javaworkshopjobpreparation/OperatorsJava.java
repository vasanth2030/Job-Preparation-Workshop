/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaworkshopjobpreparation;

import java.util.Scanner;

/**
 *
 * @author Master
 */
public class OperatorsJava {
    
    public static void main(String[] args) {
        
        int a=20;
        int b =7;   
        // a+=b ==> a=a+b
        
        a+=10;   //a=a+10
        System.out.println(a);
        a-=10;   // a= a-10
        System.out.println(a);
        a*=10;  //a=a*10
        System.out.println(a);
        a++; // a+=1  ==> a=a+1
        System.out.println(a);
        a--;  //a-=1 --> a=a-1 
        System.out.println(a);
        b=++a;
        System.out.println("b: "+b);
        System.out.println("a: "+a);
        b=a++;
        System.out.println("b: "+b);
        System.out.println("a: "+a);
        
        String fname="Vasanth";
        String lname=" S";
        String fullName=fname+lname;
        System.out.println(fullName);
        
    }
    
}
