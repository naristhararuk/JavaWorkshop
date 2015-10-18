/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int675practice.Week7;
/**
 *
 * @author Student Lab
 */
public class TestGeometric {
    
    public static void main(String[] args) {
       Geometric gm[] = new Geometric[10];
        for (int i = 0; i < gm.length; i++) {
            
            double r = Math.random();
            if(r<0.4){
                gm[i] = new Circle((int)(Math.random()*10),"Red");
                gm[i].setColor("Red");
            }else if(r<0.75){
                gm[i] = new Rectangle((int)(Math.random()*10),(int)(Math.random()*10));
                gm[i].setColor("Green");
            }else{
                gm[i] = new Triangle((int)(Math.random()*10),(int)(Math.random()*10)+1);
                gm[i].setColor("Blue");
            }
            
        }
        for (int i = 0; i < gm.length; i++) {
            System.out.println(gm[i].toString() + "Area: " + gm[i].getArea() + ",Perimeter: "+ gm[i].getPerimeter() + ",Color: "+gm[i].getColor());
        }
        Geometric gx = new Circle();
        Circle c = (Circle)gx;
        Rectangle r = new Rectangle();
        //System.out.println("name " + c.name);
        
    }

   
}
