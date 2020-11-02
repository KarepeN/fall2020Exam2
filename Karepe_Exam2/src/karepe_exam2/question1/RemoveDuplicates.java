package karepe_exam2.question1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nithya Karepe
 */
public class RemoveDuplicates {

    /**
     *
     */
    public static ArrayList<Integer> numbers = new ArrayList<>();

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter ten integers: ");
        int i = 0;
        //Adding values to ArrayList
        while (i < 10) {
            numbers.add(scan.nextInt());
            i++;
        }
        removeDuplicate(numbers);
        System.out.print("The distinct integers are");
        for (int num : numbers) {
            System.out.print(" " + num);
        }
        scan.close();

    }

    /**
     *
     * @param list
     */
    public static void removeDuplicate(ArrayList<Integer> list) {

        // Create a new ArrayList
        ArrayList<Integer> updatedList = new ArrayList<Integer>();

        // Loop through the original list
        for (int i : list) {
            // If this element is not present in updatedList then add it
            if (!updatedList.contains(i)) {
                updatedList.add(i);
            }
        }
        numbers = updatedList;
    }
}
