package com.company;

import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Ask user to input two numbers
        Scanner scanner = new Scanner(System.in);  // Reading from System.in
        System.out.println("Please enter two numbers: ");

        // Get the numbers as Strings using Scanner
        double operand1 = scanner.nextDouble();
        double operand2 = scanner.nextDouble();


        // add the operands in a sum variable
        Double sum = operand1 + operand2;



        // Subtract the operands and save in a difference variable
        Double difference = operand1 - operand2;




        // Divide the operands and save in a division variable
        Double division = operand1 / operand2;




        // Multiple the operands and save in a multiplication variable
        Double multiplication = operand1 * operand2;



        // Find the remainder when one operand is divided by the other and save in a remainder variable.
        Double remainder = operand1 % operand2;




        showResults(sum, multiplication, division, difference, remainder);





    }

   public static void  showResults(Double sum, Double multiplication, Double division, Double difference, Double remainder) {
        System.out.println("The sum of operand1 and operand2 is  " + sum);
        System.out.println("The multiple of operand1 and operand2 is  " + multiplication);
        System.out.println("The dividen of operand1 and operand2 is  " + division);
        System.out.println("The difference of operand1 and operand2 is  " + difference);
        System.out.println("The remainder of operand1 and operand2 is  " + remainder);
   }
}

