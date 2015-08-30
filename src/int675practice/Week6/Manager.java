/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int675practice.Week6;

import java.text.DecimalFormat;

/**
 *
 * @author Student Lab
 */
public class Manager extends Employee {

    private final static double BONUS_RATE = 0.09;

    public double getBonus() {
        return super.getSalary() * BONUS_RATE;
    }

    public double getSalary() {
        return super.getSalary() + getBonus();
    }

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###,###.00");
        Manager mg = new Manager();
        mg.setId(19001);
        mg.setName("Eva");
        mg.setSalary(10_0000);
        String x = df.format(mg.getBonus());
        System.out.printf("%s,bonus:%s baht \n", mg.getName(), x);

        
    }

}
