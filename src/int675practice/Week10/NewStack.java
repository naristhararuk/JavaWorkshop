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
public class NewStack<E> {
    List<E> data = null;
    public NewStack(){
        data = new LinkedList<E>();
    }
    public void push(E x){
        data.add(0,x);
    }
    
    public E pop(){
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
        NewStack<String> st = new NewStack<String>();
        st.push("ABCD");
        st.push("green");
        st.push("Alexie");
        while (!st.isEmpty()) {
            System.out.println(st.pop()); 
        }
        
    }
}
