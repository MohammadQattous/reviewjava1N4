/*
 * Program 4
 * Conversion: Feet to Meters (M)
 */

package com.mycompany.reveiwjava1n4;

import java.util.Scanner;
public class Reveiwjava1N4 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter feet: ");
        double feet = input.nextDouble();

        double meter = feet / 3.28084;

        System.out.println("Meter = " + meter);
    }    
  }  