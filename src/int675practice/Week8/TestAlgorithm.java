/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int675practice.Week8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author INT675
 */
public class TestAlgorithm {

    public static void main(String[] args) {
        List<Integer> lst;
        lst = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            if(i == 5){
                lst.add(5555);
            }else{
                lst.add((int) (Math.random() * 10000));
            }
        }
        int count = 1;
        Collections.sort(lst);
        for (int x : lst) {
            System.out.println(x + (count++ % 10 == 0 ? "\n" : "\t"));
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Search for Number : ");
        int x = sc.nextInt();
        while (x>0) {
            int position = Collections.binarySearch(lst, x);
            if(x>=0){
                System.out.println("Found '"+x+"' AT "+position);
            }else{
                System.out.println(position +" Does not Exist.. try again");
            }
            System.out.print("Search for Number (0 to exit) :");
            x= sc.nextInt();
        }
    }
}
