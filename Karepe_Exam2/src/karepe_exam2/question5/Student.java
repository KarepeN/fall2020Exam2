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
public class Student extends Person {

    public double grade;
    public static final String STATUS = "Graduate";

    /**
     * @param name
     * @param address
     * @param phoneNumber
     * @param emailAddress
     * @param grade
     */
    public Student(String name, String address, String phoneNumber, String emailAddress, double grade) {
        super(name, address, phoneNumber, emailAddress);
        this.grade = grade;
    }

    /**
     * @return the grade
     */
    public double getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Grade: %s\nStatus: %s\n", getGrade(), STATUS);
    }

}
