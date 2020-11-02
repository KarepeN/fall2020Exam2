/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karepe_exam2.question4;

/**
 *
 * @author Nithya Karepe
 */
public class Watch extends Gadget {

    boolean isSmartWatch = false;

  
    public String color;
    public String material;
    public boolean isSmartWatch() {
        if (super.getBrand().equalsIgnoreCase("apple")) {
            setSmartWatch(true);
            return true;
        }
        return isSmartWatch;
    }

    /**
     * @param isSmartWatch the isSmartWatch to set
     */
    public void setSmartWatch(boolean isSmartWatch) {
        this.isSmartWatch = isSmartWatch;
    }

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
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * @param brand
     * @param price
     * @param color
     * @param material
     */
    public Watch(String brand, double price, String color, String material) {
        super(brand, price);
        this.color = color;
        this.material = material;
    }

    /**
     * @param price
     * @param color
     * @param material
     */
    public Watch(String color, String material, double price) {
        super.price = price;
        this.color = color;
        this.material = material;
    }

    /**
     *
     * @return
     */
    @Override
    public String getCategory() {
        return "Watch";
    }

    @Override
    public String toString() {
        return super.toString() + "\nMaterial: " + getMaterial() + "\nisSmartWatch: " + isSmartWatch() + "\nColor: "
                + getColor();
    }

}
