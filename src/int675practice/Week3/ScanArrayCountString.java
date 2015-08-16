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
public class ScanArrayCountString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Word count: ");
        String word = sc.next();
        
        while (!word.equals("exit")) {
        //while (!day.equalsIgnoreCase("exit")) {   not case sensitive 
           
            System.out.println("day color : " + word);
            System.out.print("Enter Word count : ");
            word = sc.next();

        }
    }
}
