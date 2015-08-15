/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import javaworkshop.CheckString;

/**
 *
 * @author ITNNH-DELL
 */
public class Assignment1WordCount {
    public static void main(String[] args) {
        String x = CheckString.Input();
        while (!x.toLowerCase().equals("stop")) {
            x = CheckString.Input();
        }
    }
    
}
