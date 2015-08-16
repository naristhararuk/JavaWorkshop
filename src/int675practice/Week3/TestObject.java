/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int675practice.Week3;

/**
 *
 * @author Student Lab
 */
public class TestObject {
    public static void main(String[] args) {
        String result = "";
        //String x,y,z ;
        String x = new String("ABCD");
        String y = new String("EFG");
        String z = new String("ABCD");
        result = x + y;
        String a,b;
        a = "ABCD";
        b = "ABCD";
        
        char ch = x.charAt(2);
        String dn = "25.3";
        double dd = Double.parseDouble(dn) ;
        double d = new Integer("25").doubleValue();
        System.out.println(ch);
        System.out.println(result + "\n"+ d + "\n" +dd);
        result = Integer.toHexString(10);   //number Heximal
        System.out.println(result);  
        System.out.println("rr ="+1+2+3);   //123
        System.out.println("rr ="+(1+2+3)); //6
        
        System.out.println(x==y);           //not true
        System.out.println(x.equals(z));    //true  object must use equals
        System.out.println(a == b);         //true
        System.out.println(x==a);           //not true
        System.out.println(x.equals(a));    //true  object must use equals
        
        x = x + "AA";
        System.out.println(x);
        System.out.println(x == "ABCDAA");
        System.out.println(x.equals("ABCDAA"));
    }
}
