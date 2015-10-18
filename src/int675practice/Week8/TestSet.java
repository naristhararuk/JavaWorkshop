/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int675practice.Week8;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Student Lab
 */
public class TestSet {
    public static void main(String[] args) {
        Set s = new HashSet();
        
        s.add("Michigan");
        s.add("Dakota");
        s.add("Carolina");
        s.add("Carolina");
        s.add("Arizona");
        System.out.println("HashSet : " + s);
        
        Set ts = new TreeSet();
        
        ts.add("Missouri");
        ts.add("Colorado");
        ts.add("Dakota");
        ts.add("Alabama");
        ts.add("Missouri");
        
        System.out.println("TreeSet : " +ts);
        s.addAll(ts);
        System.out.println("AddAll : " + s);
    }
}
