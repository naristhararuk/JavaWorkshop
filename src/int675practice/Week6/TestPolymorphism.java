/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int675practice.Week6;

import int675practice.Week6_1.Staff;

/**
 *
 * @author Student Lab
 */

public class TestPolymorphism extends Staff{
    
    @Override
    public String toString() {
        Director dr = new Director();
        return super.toString() + "\nCar = " + dr.getCar()+"poly";
    }
    public static void main(String[] args) {
        Object oj1 = new TestPolymorphism();
        Object oj2 = new Director();
        Object oj3 = new Employee();
        
        System.out.println(oj1.toString());
        System.out.println(oj2.toString());
        System.out.println(oj3.toString());
        System.out.println("=================================");
        
        
        Director dr1 = new Director();
        Manager mg1 = new Manager();
        Employee em1 = new Employee();
        
        
        dr1.setSalary(4000);
        mg1.setSalary(4000);
        em1.setSalary(4000);
        
        printEmployee(em1);
        System.out.println("=================================");
        printEmployee(mg1);
        System.out.println("=================================");
        printEmployee(dr1);
        System.out.println("=================================");
        
        System.out.println(Director.ST);
        System.out.println(Staff.ST);
        
    }
    public static void printEmployee(Employee e){
        System.out.println(e);
        System.out.println("Salary = "+e.getSalary());
    }
}
