/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaworkshop;

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
   public static String Input(String txt){
        Scanner sc = new Scanner(System.in);
        System.out.print(txt);
        String x = sc.next();
        if(x.toLowerCase().equals("stop")){
            System.out.println("Exit Program !!");
        }
        return x;
   }
}
