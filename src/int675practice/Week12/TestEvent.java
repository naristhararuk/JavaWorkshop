/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int675practice.Week12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

/**
 *
 * @author Student Lab
 */
public class TestEvent extends JFrame{

    JScrollBar jsred = new JScrollBar(JScrollBar.HORIZONTAL);
    JScrollBar jsblue = new JScrollBar(JScrollBar.HORIZONTAL);
    JScrollBar jsgreen = new JScrollBar(JScrollBar.HORIZONTAL);
    JLabel jlb = new JLabel();
    JFrame jf;
    public TestEvent() throws HeadlessException {
        super("Test Event");
        JPanel jp1 = new JPanel();
        jp1.setLayout(new BoxLayout(jp1,BoxLayout.Y_AXIS));
        jp1.add(jsred);
        jp1.add(jsgreen);
        jp1.add(jsblue);
        
        
        jsred.setMinimum(0);
        jsred.setMaximum(255);
        jsgreen.setMinimum(0);
        jsgreen.setMaximum(255);
        jsblue.setMinimum(0);
        jsblue.setMaximum(255);
        this.add(jp1,BorderLayout.NORTH);
        this.add(jlb,BorderLayout.SOUTH);
        jf = this;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(600,400));
        setVisible(true);
        
        MyListener x = new MyListener();
        this.addMouseListener(x);
        this.addMouseMotionListener(x);
        
        jsred.addAdjustmentListener(x);
        jsgreen.addAdjustmentListener(x);
        jsblue.addAdjustmentListener(x);
    }
    private class MyListener implements MouseListener, MouseMotionListener,AdjustmentListener{

        /*MouseMotionListener event*/
        @Override
        public void mouseDragged(MouseEvent e) {
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            jf.setTitle("X = " + e.getX()+ " ,Y = "+ e.getY());
            
        }

        /*MouseListener event*/

        @Override
        public void mouseClicked(MouseEvent e) {
            String ctrlMask;
            if(e.getModifiers() == 16){
                jf.setTitle("Left Click : at x = " + e.getX() + ",y = "+ e.getY());
            }else if(e.getModifiers() == 4){
                jf.setTitle("Right Click : at x = " + e.getX() + ",y = "+ e.getY());
            }
            System.out.println("MODIFIER: "+e.getModifiers());
        }

        @Override
        public void mousePressed(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseExited(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void adjustmentValueChanged(AdjustmentEvent e) {
            jf.getContentPane().setBackground(new Color(jsred.getValue(),jsgreen.getValue(),jsblue.getValue()));
            jlb.setText("RGB("+jsred.getValue()+","+jsgreen.getValue()+","+jsblue.getValue()+")");
        }

        
    }
    public static void main(String[] args) {
        new TestEvent();
    }
}
