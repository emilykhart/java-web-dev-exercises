package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double areaOfCircle = 0;
        System.out.println("Enter a radius: ");
        String radiusInput = input.nextLine();

        if (radiusInput.equals("")){
            System.out.println("Radius Cannot be Empty");
        }
        try {
            double radiusNum = Double.parseDouble(radiusInput);
            if (radiusNum > 0) {
                areaOfCircle = Circle.getArea(radiusNum);
            } else {
                System.out.println("Something is wrong.");
            }
        } catch (Exception e) {
            System.out.println("successful error");
        }

        System.out.println("The area of a circle of radius " + radiusInput + " is " + areaOfCircle);

        input.close();
    }
}
