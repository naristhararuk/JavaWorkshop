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
public class Triangle extends Geometric {
    private double height;
    private double base;
        public Triangle(){
        this(4,5);
    }
    public Triangle(double height,double baser){
        this.height = height;
        this.base = baser;
    }
//    public Triangle(){
//        this(4,5,"Orange");
//    }
//    public Triangle(double height,double base,String color){
//        super(color);
//        this.height = height;
//        this.base = base;
//    }
    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        final Triangle other = (Triangle)obj;
        return Double.doubleToLongBits(this.height) == Double.doubleToLongBits(other.height);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.height) ^ (Double.doubleToLongBits(this.height) >>> 32));
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.base) ^ (Double.doubleToLongBits(this.base) >>> 32));
        return hash;
    }
    @Override
    public double getArea() {
        return height * base;
    }

    @Override
    public double getPerimeter() {
        return height*base;
    }

    @Override
    public String toString() {
        return "Triangle{" + "height=" + height + ", base=" + base + '}';
    }
    
}
