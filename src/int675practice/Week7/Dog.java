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
public class Dog extends AnimalBehavior {
     public void run(){
        System.out.println("Running at 100kmp/h");
      }

    @Override
    public String dog() {
       return "bark box";
    }

    @Override
    public String bird() {
        return "jib jib";
    }
}
