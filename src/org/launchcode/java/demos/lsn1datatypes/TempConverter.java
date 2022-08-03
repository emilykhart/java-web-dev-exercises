package org.launchcode.java.demos.lsn1datatypes; //declares the package in which the file resides. Always declare the package of your Java Class
//packages help to encapsulate your code. No outside influences! Can lead to naming conflicts and bugs

import java.util.Scanner; //allows us to access the class, methods, and data stored in a different file. Tells the compiler that we are going to use a shortened version
//of the class name

public class TempConverter {
    public static void main(String[] args) {
        double fahrenheit;
        double celsius;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        fahrenheit = input.nextDouble();
        input.close(); //if you don't close Scanner, you can have unintended access to your program and it ties up resources.

        celsius = (fahrenheit - 32) * 5/9;
        System.out.println("The temperature in Celsius is: " + celsius + "°C");
    }
}
