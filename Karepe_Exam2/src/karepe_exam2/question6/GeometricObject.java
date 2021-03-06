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
public abstract class GeometricObject {


    public String color;

    public boolean filled = false;

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the filled
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * @param filled the filled to set
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     *
     * @return
     */
    public abstract double getArea();

    /**
     *
     * @return
     */
    public abstract double getPerimeter();

    /**
     * @param color
     * @param filled
     */
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

}
