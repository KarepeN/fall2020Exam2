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
public class Faculty extends Employee {

    public String officeHours;
    public int numberOfTeachingSubjects;

    /**
     * @return the officeHours
     */
    public String getOfficeHours() {
        return officeHours;
    }

    /**
     * @param officeHours the officeHours to set
     */
    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    /**
     * @return the numberOfTeachingSubjects
     */
    public int getNumberOfTeachingSubjects() {
        return numberOfTeachingSubjects;
    }

    /**
     * @param numberOfTeachingSubjects the numberOfTeachingSubjects to set
     */
    public void setNumberOfTeachingSubjects(int numberOfTeachingSubjects) {
        this.numberOfTeachingSubjects = numberOfTeachingSubjects;
    }

    /**
     * @param name
     * @param address
     * @param phoneNumber
     * @param emailAddress
     * @param office
     * @param salary
     * @param date_hired
     * @param officeHours
     * @param numberOfTeachingSubjects
     */
    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, double salary,
            String date_hired, String officeHours, int numberOfTeachingSubjects) {
        super(name, address, phoneNumber, emailAddress, office, salary, date_hired);
        this.officeHours = officeHours;
        this.numberOfTeachingSubjects = numberOfTeachingSubjects;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("OfficeHours: %s\nNumberOfTeachingSubjects: %d\n", getOfficeHours(),
                getNumberOfTeachingSubjects());
    }

}
