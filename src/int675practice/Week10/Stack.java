/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int675practice.Week10;

import int675practice.Week4.BankAccount;
import int675practice.Week7.Circle;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author INT675
 */
public class Stack {
    List data = null;
    public Stack(){
        data = new LinkedList();
    }
    public void push(Object x){
        data.add(0,x);
    }
    
    public Object pop(){
        if(data.isEmpty()){
            System.out.println("Out of Stack");
            return null;
        }else{
            return data.remove(0);
        }
    }
    
    public boolean isEmpty(){
        return data.isEmpty();
    }
    
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push("ABCD");
        st.push(new Circle(2.5,"green"));
        st.push(900);
        st.push(new BankAccount(9001,"Alexie"));
        while (!st.isEmpty()) {
            System.out.println(st.pop()); 
        }
        
    }
}
