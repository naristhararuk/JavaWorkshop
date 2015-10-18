/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int675practice.Week8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

/**
 *
 * @author INT675
 */
public class WordFequencyCompareByCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map m = new TreeMap();
        System.out.print("Enter Text : ");
        String str = sc.nextLine();
        StringTokenizer stk = new StringTokenizer(str, " ;,.'\"*(){}");
        while (stk.hasMoreTokens()) {
            String x = stk.nextToken().toLowerCase();
            if (m.get(x) == null) {
                m.put(x, new WordElement(x,1));
            } else {
                WordElement tmp = (WordElement) m.get(x);
                tmp.increment();
            }
        }
        Collection c = m.values();
        List lst = new ArrayList(c);
        Collections.sort(lst,new WordElementCompareByCount());      /* sort ASC*/
        //Collections.reverse(lst);   /* sort DESC*/
        
        Iterator it = lst.iterator();
        while (it.hasNext()) {
            WordElement we = (WordElement)it.next();
            System.out.println("Result :"+ we.getWord() + ":" + we.getCount());
        }
    }
}
