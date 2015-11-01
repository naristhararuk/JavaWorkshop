/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int675practice.Week12;

/**
 *
 * @author Student Lab
 */
public class InitArrayThread extends Thread {
    private String[] a;
    private int begin;
    private int size;
    private String initValue;

    public InitArrayThread(String[] a,int begin, int size, String initValue) {
        this.a = a;
        this.begin = begin;
        this.size = size;
        this.initValue = initValue;
    }

    @Override
    public void run() {
        for (int i = begin; i < (begin + size-1); i++) {
            a[i] = initValue;
        }
        System.out.println(this.getName() + "end");
        System.out.println(a[begin + size -2]);
    }
    

    
}
