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
public class ConditionalStatements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();

//        if(a>20){
//            System.out.println("Number is greater than 20");
//            System.out.println("Another line");
//        }
//        else if(a<20)
//            System.out.println("The number is less than 20");
//           
//        else{
//            System.out.println("The number is 20");
//            
//        }
        switch (a) {
            
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;       
            case 4:
                System.out.println("Wedday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Enter value from 1-7");

        }

    }

}
