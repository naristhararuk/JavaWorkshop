/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int675practice.Week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author INT675
 */
public class TestException {

    /**
     *
     * @param args
     */
//    public static void main(String[] args) {
//        System.out.println("Main Active");
//        methodA();
//        System.out.println("Main Done");
//    }

    

    private static void methodB() {
        System.out.println("Method B Acitive");
        int a[] = {1,3,5,7,9};
        try {
            int x = 5;
            int y = 0;
            int z = x / y;
            //int z = 0;
            System.out.println("Array = "+a[9]);
            System.out.println("Z = " + z);
        }catch (ArrayIndexOutOfBoundsException aie) {
            //e.printStackTrace();
            System.out.println("Error :"+aie.getClass() +","+aie.getMessage());
        }catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Error :"+e.getClass() +","+e.getMessage());
        }finally{
            System.out.println("Alway Done");
        }
        System.out.println("Method B Done");
    }
    private static void methodA() {
        System.out.println("Method A Active");
        methodB();
        System.out.println("Method A Done");
        
    }
    public static void main(String[] args) throws FileNotFoundException {
//        System.out.println("Main Active");
//        methodA();
//        System.out.println("Main Done");
        File f = new File("tmp.txt");
        Scanner sc = new Scanner(f);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            StringTokenizer stk = new StringTokenizer(line," ,.()'");
            int count = 1;
            while (stk.hasMoreElements()) {
                System.out.printf("%-20s%s",stk.nextElement(),(count++%8==0?"\n":"\t"));
            }
        }
    }
}
