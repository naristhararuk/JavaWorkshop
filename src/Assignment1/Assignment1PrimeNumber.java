/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import static java.lang.Integer.parseInt;
import java.util.Scanner;
import javaworkshop.CheckString;

/**
 *
 * @author ITNNH-DELL
 */
public class Assignment1PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "";
        System.out.print("Please Input Number or 'exit' to exit :");
        String x = sc.next();
        int chknum;

        while (!x.toLowerCase().equals("exit")) {
            if (CheckString.isNumeric(x)) {
                chknum = parseInt(x);
                if(chknum % 2 == 0){
                    result = "This is Prime Number";
                }else{
                    result = "This is not Prime Number";
                }
            }
            else{
                result = "This is not Number";
            }
            System.out.println(result);
            System.out.print("Please Input New Number or 'exit' to exit : ");
            x = sc.next();
        }
        if(x.toLowerCase().equals("exit")){
            result = "exit program";
        }else{
            result =  x + " : " +result;
        }
        System.out.println(result);
    }

        
    

}
