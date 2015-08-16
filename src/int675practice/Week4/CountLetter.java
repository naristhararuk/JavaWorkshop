/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int675practice.Week4;

import javaworkshop.CheckString;

/**
 *
 * @author Student Lab
 */
public class CountLetter {

    private String sentence;
    private int count[] = new int[26];

    public int[] getCount() {
        return count;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
        
    }

    public void count() {
        count = new int[26];
        for (int i = 0; i < sentence.length(); i++) {
            char x = sentence.charAt(i);
            if (x >= 65 && x <= 65 + 25) {
                count[x - 65]++;
            }
        }

    }

    public String getResult(int itemPerLine) {
        StringBuilder tmp = new StringBuilder();
        int x = 1;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                tmp.append((char)(i + 65)).append(":").append(count[i]);
                tmp.append(x % itemPerLine == 0 ? "\n" : ",    ");
                x = x + 1;
            }
        }
        if((x-1)%itemPerLine != 0){
            tmp.delete(tmp.length() - 5, tmp.length() - 1);
        }
        return tmp.toString();
    }

    public static void main(String[] args) {
        CountLetter cl = new CountLetter();
        String str = CheckString.Input("Please Input Sentence or 'stop' to exit : ");
         
        while (!str.toLowerCase().equals("stop")) {
        
            cl.setSentence(str.toUpperCase());
            cl.count();
            System.out.println(cl.getResult(2));
            
            str = CheckString.Input("Please Input New Sentence or 'stop' to exit : ");
        }

    }
}
