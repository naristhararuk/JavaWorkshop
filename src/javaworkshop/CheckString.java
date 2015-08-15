/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaworkshop;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author ITNNH-DELL
 */
public class CheckString {
    public static boolean isNumeric(String str) {
        try {
            double d = Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
   public static String Input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Input Number or 'stop' to exit :");
        String x = sc.next();
        return x;
   }
}
