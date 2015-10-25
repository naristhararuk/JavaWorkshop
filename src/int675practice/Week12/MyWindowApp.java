/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int675practice.Week12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.LayoutManager;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Student Lab
 */
public class MyWindowApp extends JFrame{

    JTextField jtf1;
    public MyWindowApp() throws HeadlessException {
        this("No Title");
    }

    public MyWindowApp(String title) throws HeadlessException {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //JButton jb = new JButton("OK");
        //add(jb,BorderLayout.EAST);
        jtf1 = new JTextField(20);
        jtf1.setForeground(Color.white);
        jtf1.setBackground(Color.GRAY);
        jtf1.setBorder(null);
        //add(new JButton("OK"));
        //add(new JButton("Cancel"),BorderLayout.NORTH);
        //add(new JButton("New"),BorderLayout.WEST);
        //add(new JButton("Edit"));
        //add(new JButton("Delete"),BorderLayout.SOUTH);
        //add(new JButton("View"));
        //add(new JButton("Search"));
        //add(jtf1,BorderLayout.CENTER);
        
        //LayoutManager lm = new FlowLayout(FlowLayout.LEFT,5,10);  /*space 5 = horizontal 10 = vertical*/
        //LayoutManager lm = new GridLayout(2,3,5,10);
        //setLayout(lm);
        
        /*panel layout*/
        JPanel jpHor = new JPanel();
        JPanel jpVer = new JPanel();
        jpHor.setLayout(new BoxLayout(jpHor,BoxLayout.X_AXIS));
        jpVer.setLayout(new BoxLayout(jpVer,BoxLayout.Y_AXIS));
        jpVer.add(new JButton("Edit"));
        jpVer.add(new JButton("View"));
        jpHor.add(new JButton("Search"));
        jpHor.add(jtf1);
        add(jpVer,BorderLayout.CENTER);
        add(jpHor,BorderLayout.SOUTH);
        
        
        
        setSize(600, 500);
        setVisible(true);
    }
    public static void main(String[] args) {
        new MyWindowApp("My Window Application");
    }
}
