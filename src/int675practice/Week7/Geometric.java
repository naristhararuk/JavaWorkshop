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
public abstract class Geometric {
    private String color;
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
public abstract double getArea();
public abstract double getPerimeter();
}
