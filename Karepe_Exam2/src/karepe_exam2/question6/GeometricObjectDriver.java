/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karepe_exam2.question6;

import java.util.Scanner;

/**
 *
 * @author Nithya Karepe
 */
public class GeometricObjectDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter the Values here: ");
        System.out.print("Side1 : ");
        Scanner scan = new Scanner(System.in);
        double side1 = scan.nextDouble();
        System.out.print("Side2 : ");
        double side2 = scan.nextDouble();
        System.out.print("Side3 : ");

        double side3 = scan.nextDouble();
        System.out.print("Color : ");

        String color = scan.next();
        System.out.print("Filled : ");

        boolean filled = scan.nextBoolean();
        scan.close();
        GeometricObject triangle = new Triangle(color, filled, side1, side2, side3);
        System.out.println(triangle.toString());

    }

}
