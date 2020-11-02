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
public class Laptop extends Gadget {

    /**
     *
     */
    public int screenSize;

    /**
     *
     */
    public String processor;

    /**
     * @return the screenSize
     */
    public int getScreenSize() {
        return screenSize;
    }

    /**
     * @param screenSize the screenSize to set
     */
    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    /**
     * @return the processor
     */
    public String getProcessor() {
        return processor;
    }

    /**
     * @param processor the processor to set
     */
    public void setProcessor(String processor) {
        this.processor = processor;
    }

    /**
     * @param brand
     * @param price
     * @param screenSize
     * @param processor
     */
    public Laptop(String brand, double price, int screenSize, String processor) {
        super(brand, price);
        this.screenSize = screenSize;
        this.processor = processor;
    }

    /**
     *
     * @return
     */
    @Override
    public String getCategory() {
        return "Laptop";
    }

    @Override
    public String toString() {
        return super.toString() + "\nScreenSize: " + getScreenSize() + " inches\n" + "Processor: " + getProcessor();
    }

}
