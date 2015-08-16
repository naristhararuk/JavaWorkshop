/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import java.util.HashMap;
import javaworkshop.CheckString;

/**
 *
 * @author ITNNH-DELL
 */
public class Assignment1WordCount {

    public static void main(String[] args) {
        String x = CheckString.Input("Please Input Number or 'stop' to exit : ");
        while (!x.toLowerCase().equals("stop")) {
            HashMap<Character, Integer> map = new HashMap<>();
            
            for (int i = 0; i < x.length(); i++) {
                //char c = x.toUpperCase().charAt(i); if not use case sensitive
                char c = x.charAt(i);
                Integer val = map.get(new Character(c));
                if (val != null) {
                    map.put(c, val + 1);
                } else {
                    map.put(c, 1);
                }
            }
            System.out.println(map);
            x = CheckString.Input("Please Input New Number or 'stop' to exit : ");
            
        }
        
    }

}
