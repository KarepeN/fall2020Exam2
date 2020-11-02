/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karepe_exam2.question4;

import java.util.ArrayList;

/**
 *
 * @author Nithya Karepe
 */
public class GadgetDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gadget g1 = new Watch("Fossil", 225.00, "Red", "Stainless Steel");
        Gadget g2 = new AppleWatch(425.00, "Black", "Stainless Steel");
        Gadget g3 = new Laptop("Dell", 1345.00, 13, "Intel Core i5");
        ArrayList<Gadget> list = new ArrayList<>();
        list.add(g1);
        list.add(g2);
        list.add(g3);
        for (Gadget g : list) {
            System.out.println("\n" + g.toString());
        }
    }

}
