/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karepe_exam2.question5;

/**
 *
 * @author Nithya Karepe
 */
public class Staff extends Employee {

    public String title;

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @param name
     * @param address
     * @param phoneNumber
     * @param emailAddress
     * @param office
     * @param salary
     * @param date_hired
     * @param title
     */
    public Staff(String name, String address, String phoneNumber, String emailAddress,
            String office, double salary,
            String date_hired, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, date_hired);
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Title: %s\n", getTitle());
    }

}
