/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int675practice.Week8;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

/**
 *
 * @author Student Lab
 */
public class WordFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map m = new TreeMap();
        System.out.print("Enter Text : ");
        String str = sc.nextLine();
        StringTokenizer stk = new StringTokenizer(str, " ;,.'\"*(){}");
        while (stk.hasMoreTokens()) {
            String x = stk.nextToken().toLowerCase();
            if (m.get(x) == null) {
                m.put(x, new Integer(1));
            } else {
                Integer tmp = (Integer) m.get(x);
                m.put(x, new Integer(tmp.intValue() + 1));
            }
        }
        Set entry = m.entrySet();
        Iterator it = entry.iterator();
        while (it.hasNext()) {
            Entry e = (Entry)it.next();
            System.out.println("Result :"+e.getKey() + ":" +e.getValue());
        }
    }
}
