/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int675practice.Week3;

import java.util.Scanner;

/**
 *
 * @author Student Lab
 */
public class ConditionStatement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter number :");
        int check = sc.nextInt();

        if (check % 2 == 0) {
            System.out.println(" is even number :");
        } else {
            System.out.println(" is odd number :");
        }
        for (int i = 0; i < 3; i++) {
            System.out.print("Please enter Score :");
            float grade = sc.nextFloat();

            if (grade < 50) {
                System.out.println("Score : " + grade + " grade F");
            } else if (grade < 60) {
                System.out.println("Score : " + grade + " grade D");
            } else if (grade < 70) {
                System.out.println("Score : " + grade + " grade C");
            } else if (grade < 70) {
                System.out.println("Score : " + grade + " grade B");
            } else {
                System.out.println("Score : " + grade + " grade A");
            }
        }
    }
}
