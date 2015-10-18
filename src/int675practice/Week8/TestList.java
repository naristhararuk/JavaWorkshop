/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int675practice.Week8;

import int675practice.Week7.Circle;
import int675practice.Week7.Geometric;
import int675practice.Week7.Rectangle;
import int675practice.Week7.Triangle;
//import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Student Lab
 */
public class TestList {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        //List lst = new ArrayList();
        
        List lst = new LinkedList();
        for (int i = 0; i < 10; i++) {
            double r = Math.random();
            Geometric gm ;
            if(r<0.4){
                gm = new Circle((int)(Math.random() *10) +1 , r<0.2? "red":"blue");
            }
            else if(r<0.75){
                gm = new Rectangle((Math.random() *10) +1, (int)(Math.random() *10) +1 );
            }
            else{
                gm = new Triangle((Math.random() *10) +1,(int)(Math.random() *10) +1 );
            }
            lst.add(gm);
        }
        lst.add("Alex");
        lst.add(900);
        System.out.println(lst.get(0));
        System.out.println(lst.get(lst.size()-1));
        System.out.println(lst.get(lst.size()-2));
        Iterator it = lst.iterator();
        for (Object obj:lst) {
            if(obj instanceof Geometric){
                if(obj instanceof Circle){
                    System.out.println("Circle Area: " + ((Geometric)(obj)).getArea());
                }
                else if(obj instanceof Rectangle){
                    System.out.println("Rectangle Area: " + ((Geometric)(obj)).getArea());
                }
                else {
                    System.out.println("Triangle Area: " + ((Geometric)(obj)).getArea());
                }
            }
        }
        
    }
}
