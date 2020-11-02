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
public class TestDriverQ05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person person = new Person("Wilmes", "Quail Forest Drive 123G NC-28412", "657-876-9087",
                "wilmes56@nwmissori.edu");
        System.out.println(person.toString());
        Student student = new Student("Nithya Karepe", "1115N College Drive Maryville Mo-64468", "132-456-6767",
                "s540109@nwmissouri.edu", 4.0);
        System.out.println(student.toString());
        Employee employee = new Employee("CsDpt-1109", 8790.00, "11/01/2012", person);
        System.out.println(employee.toString());
        Faculty faculty = new Faculty("Wilmes", "Quail Forest Drive 123G NC-28412", "657-876-9087",
                "wilmes56@nwmissori.edu", "CsDpt-1109", 8790.00, "11/01/2012", "TR- 1:00pm-3:00pm", 2);
        System.out.println(faculty.toString());
        Staff staff = new Staff("Joann", "7350 McArdle rd Apt153 MO-64468", "637-076-9000", "joann@nwmissori.edu",
                "Admin-1009", 8790.00, "11/01/2012", "Clerk");
        System.out.println(staff.toString());
    }

}
