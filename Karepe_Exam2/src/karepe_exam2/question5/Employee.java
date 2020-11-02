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
public class Employee extends Person {

    public String office;
    public double salary;
    public String date_hired;

    /**
     * @return the office
     */
    public String getOffice() {
        return office;
    }

    /**
     * @param office the office to set
     */
    public void setOffice(String office) {
        this.office = office;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the date_hired
     */
    public String getDate_hired() {
        return date_hired;
    }

    /**
     * @param date_hired the date_hired to set
     */
    public void setDate_hired(String date_hired) {
        this.date_hired = date_hired;
    }

    /**
     * @param name
     * @param address
     * @param phoneNumber
     * @param emailAddress
     * @param office
     * @param salary
     * @param date_hired
     */
    public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary,
            String date_hired) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.date_hired = date_hired;
    }

    /**
     * @param office
     * @param salary
     * @param date_hired
     * @param person
     */
    public Employee(String office, double salary, String date_hired, Person person) {
        super(person.getName(), person.getAddress(), person.getPhoneNumber(), person.getEmailAddress());
        this.office = office;
        this.salary = salary;
        this.date_hired = date_hired;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Office: %s\nSalary: %.2f\nDate_hired: %s\n", getOffice(), getSalary(),
                getDate_hired());
    }

}
