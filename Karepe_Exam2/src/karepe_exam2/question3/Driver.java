package karepe_exam2.question3;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Nithya Karepe
 */
public class Driver {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        ArrayList<Object> list = new ArrayList<>();

        Loan loan = new Loan(100, 6, 5);
        list.add(loan);

        Date date = Calendar.getInstance().getTime();
        list.add(date);

        String name = "Nithya Karepe";
        list.add(name);

        Circle circle = new Circle(5);
        list.add(circle);

        for (Object o : list) {
            System.out.println(o.toString());
        }

    }

}
