/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int675practice.Week6;

/**
 *
 * @author Student Lab
 */
public class Employee extends Object {
    int id;
    String name;
    double salary;
    protected static String ST = "Static String na ja";
    protected int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Employee{:" + "id=" + id + ",\nname=" + name + ",\nsalary=" + salary + '}';
    }

    

   
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Employee e4 = new Manager();
       
        e1.id = 100;
        e1.name = "Alex";
        e1.salary = 53000;
        
        e2.id = 100;
        e2.name = "Dakota";
        e2.salary = 45000;
        
        e3.id = 100;
        e3.name = "Alex";
        e3.salary = 53000;
        
        System.out.println(e1.id);
        System.out.println(e1.name);
        System.out.println(e1.salary);
        
        
        System.out.println(e1.equals(e3));
        System.out.println(e1.name.equals(e2.name));
        System.out.println(e1);
        
        System.out.println(e4);
    }
}
