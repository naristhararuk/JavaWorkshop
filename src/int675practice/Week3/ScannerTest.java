/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int675practice.Week3;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

/**
 *
 * @author Student Lab
 */
public class ScannerTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        while (!sc.hasNextInt()) {
            System.out.print("Enter number Only: ");
            sc.next();
        }
        int num1 = sc.nextInt();
        System.out.println("You input : " + num1);

        System.out.print("Input day : ");
        String day = sc.next();
        String color;
        System.out.println("day is : " + day);
        while (!day.equals("exit")) {
        //while (!day.equalsIgnoreCase("exit")) {   not case sensitive 
            switch (toLowerCase(day)) {
                case "mon":
                    color = "Yellow";
                    break;
                case "tue":
                    color = "Pink";
                    break;
                case "wed":
                    color = "Green";
                    break;
                case "thu":
                    color = "Orange";
                    break;
                case "fri":
                    color = "Blue";
                    break;
                case "sat":
                    color = "Purple";
                    break;
                case "sun":
                    color = "Red";
                    break;
                default:
                    color = "invalid day";
            }

            System.out.println("day color : " + color);
            System.out.print("Input day : ");
            day = sc.next();

        }

    }

}
