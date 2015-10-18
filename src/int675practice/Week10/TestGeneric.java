/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int675practice.Week10;

import int675practice.Week7.Circle;
import int675practice.Week7.Rectangle;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author INT675
 */
public class TestGeneric {

    public static void main(String[] args) {
        List lst = new ArrayList();
        lst.add(new Circle(1.2, "green"));
        lst.add(new Circle(2.2, "green"));
        lst.add(new Circle(1.4, "green"));
        lst.add(new Circle(2.1, "green"));
        lst.add(new Circle(1.7, "green"));
        //lst.add(new Rectangle(2, 3)); /*ถ้าใส่จะ error ตอน runtime*/

        for (Object obj:lst) {
            Circle c = (Circle)obj; /*ต้อง cast object เป็น circle ก่อน*/
            System.out.println("Area : " +c.getArea());
        }
        
        List<Circle> lst2 = new ArrayList<>();
        lst2.add(new Circle(1.2, "green"));
        lst2.add(new Circle(2.2, "green"));
        lst2.add(new Circle(1.4, "green"));
        lst2.add(new Circle(2.1, "green"));
        lst2.add(new Circle(1.7, "green"));
        //lst.add(new Rectangle(2, 3)); /*ถ้าใส่จะ error ตอน runtime*/

        for (Circle c:lst2) {
            System.out.println("Area : " +c.getArea());
        }
        
        
    }
}
