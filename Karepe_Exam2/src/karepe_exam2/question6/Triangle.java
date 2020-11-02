/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karepe_exam2.question6;

/**
 *
 * @author Nithya Karepe
 */
public class Triangle extends GeometricObject {
    public double side1;
    public double side2;
    public double side3;

    /**
     * @return the side1
     */
    public double getSide1() {
        return side1;
    }

    /**
     * @param side1 the side1 to set
     */
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    /**
     * @return the side2
     */
    public double getSide2() {
        return side2;
    }

    /**
     * @param side2 the side2 to set
     */
    public void setSide2(double side2) {
        this.side2 = side2;
    }

    /**
     * @return the side3
     */
    public double getSide3() {
        return side3;
    }

    /**
     * @param side3 the side3 to set
     */
    public void setSide3(double side3) {
        this.side3 = side3;
    }

    /**
     * @param color
     * @param filled
     * @param side1
     * @param side2
     * @param side3
     */
    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /**
     *
     * @return
     */
    @Override
    public double getArea() {

        double s = getPerimeter() / 2;// semi perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)); // using heron's formula
    }

    /**
     *
     * @return
     */
    @Override
    public double getPerimeter() {
        return getSide1() + getSide2() + getSide3();
    }

    @Override
    public String toString() {
        return "Triangle: " + "\n         Side1 = " + side1 + "\n         Side2 = " + side2 + "\n         Side3 = "
                + side3 + "\n         Color = " + color + "\n        Filled = " + filled + "\n          Area = "
                + getArea() + "\n     Perimeter = " + getPerimeter();
    }

}
