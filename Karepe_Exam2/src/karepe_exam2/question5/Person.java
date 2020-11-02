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
public class Person {

    public String name;
    public String address;
    public String phoneNumber;
    public String emailAddress;

    /**
     * @param name
     * @param address
     * @param phoneNumber
     * @param emailAddress
     */
    public Person(String name, String address, String phoneNumber, String emailAddress) {
        super();
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * @param emailAddress the emailAddress to set
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nAddress: %s\nPhoneNumber: %s\nEmailAddress: %s\n", getName(), getAddress(),
                getPhoneNumber(), getEmailAddress());
    }

}
