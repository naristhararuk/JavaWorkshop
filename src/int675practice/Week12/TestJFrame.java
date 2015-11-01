/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int675practice.Week12;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Student Lab
 */
public class TestJFrame {

    public static void main(String[] args) {
        final JFrame jf = new JFrame();
        jf.setTitle("This is First GUI App");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton jb = new JButton("OK");
        jf.add(jb);
        jf.add(new JButton("Cancel"));
        jf.add(new JButton("New"));
        jf.add(new JButton("Edit"));
        jf.add(new JButton("Delete"));

        ((JButton) jf.getContentPane().getComponent(1)).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jf.setTitle("You click : " + e.getActionCommand());
            }
        });

        jf.setLayout(new FlowLayout());
        jf.setSize(600, 200);
        jf.setVisible(true);

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jf.setTitle("You click : " + e.getActionCommand());
            }
        });
    }
}
