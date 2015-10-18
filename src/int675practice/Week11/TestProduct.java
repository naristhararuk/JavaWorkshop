/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int675practice.Week11;

import java.util.Scanner;

/**
 *
 * @author Student Lab
 */
public class TestProduct {
    public static void findById() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Search Product ID: (0 to stop)");
        int choice = sc.nextInt();
        while (choice > 0) {
            Product p = Product.findById(choice);
            if (p == null) {
                System.out.println("Customer ID " + choice + "does not exist... Try again!!");
            } else {
                System.out.println("ID: " + p.getProductId() + ",Description: " + p.getDescription() 
                         + ",Type: " + p.getProductType() +",Price: " + p.getPrice());

            }
            System.out.println("Search Customer ID: (0 to stop)");
            choice = sc.nextInt();
        }
    }
    public static void main(String[] args) {
        findById();
    }
}
