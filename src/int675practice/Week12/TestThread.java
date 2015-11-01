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
public class TestThread {
    public static void main(String[] args) {
        MyThread mtx = new MyThread("X");
        MyThread mty = new MyThread("Y");
        MyThread mta = new MyThread("A");
        MyThread mtb = new MyThread("B");
        
        mta.setPriority(1);
        mtx.setPriority(2);
        
        mtx.start();
        mty.start();
        mta.start();
        mtb.start();
    
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        System.out.println("*------------------------------------*\n");
    }
}
    class MyThread extends Thread{
        String param;
        public MyThread(String param) {
            this.param = param;
        }
        
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.print(param);
            }
            
        }
       
   }

