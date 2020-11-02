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
public class Gadget {

    public String brand;
    public double price;

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return null;
    }

    /**
     * @param brand
     * @param price
     */
    public Gadget(String brand, double price) {
        super();
        this.brand = brand;
        this.price = price;
    }

    /**
     *
     */
    public Gadget() {
    }

    @Override
    public String toString() {
        return "Brand= " + brand + "\nPrice= " + price + "\nCategory: " + getCategory();
    }

}
