package karepe_exam2.question2;

import java.util.Scanner;

/**
 *
 * @author Nithya Karepe
 */
public class Compare2DArray {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter list1: ");
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                m1[i][j] = scan.nextInt();
            }
        }

        System.out.print("Enter list2: ");
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                m2[i][j] = scan.nextInt();
            }
        }
        scan.close();
        if (equals(m1, m2)) {
            System.out.println("The two arrays are strictly identical");
        } else {
            System.out.println("The two arrays are not strictly identical");
        }

    }

    /**
     *
     * @param m1
     * @param m2
     * @return
     */
    public static boolean equals(int[][] m1, int[][] m2) {

        if (m1.length != m2.length || m1[0].length != m2[0].length) {
            return false;
        } else {
            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m1[0].length; j++) {
                    if (m1[i][j] != m2[i][j]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

}
