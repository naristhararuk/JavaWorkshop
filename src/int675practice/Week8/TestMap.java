/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int675practice.Week8;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author Student Lab
 */
public class TestMap {
    public static void main(String[] args) {
    
        Map m = new HashMap();
        System.out.println("Size: " + m.size() + ",isEmpty?= " + m.isEmpty());
        m.put("one", new Integer(1));
        m.put("two", new Integer(2));
        m.put("three", new Integer(3));
        m.put("four", new Integer(4));
        m.put("five", new Integer(5));
        m.put("six", "Somchai");
        System.out.println("Size: " + m.size() + ",isEmpty?= " + m.isEmpty());

        System.out.println(m.get("six"));
        System.out.println(m.get("two"));
        System.out.println(m);

        Set keySet = m.keySet();
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            System.out.println("Key: " + key + ",Value: " + m.get(key));
        }

        Collection c = m.values();
        it = keySet.iterator();
        while (it.hasNext()) {
            System.out.println("Value: " + it.next());
        }
        
        
        Set es =m.entrySet();
        it = es.iterator();
        while (it.hasNext()) {
            
            Entry e =(Entry)it.next();
            System.out.println("Key: " + e.getKey() + ",Value: " + e.getValue());
    

        }

    }
}
