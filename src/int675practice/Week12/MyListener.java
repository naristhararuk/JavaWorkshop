/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int675practice.Week12;

import java.awt.Color;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

/**
 *
 * @author Student Lab
 */
public class MyListener implements MouseListener,MouseMotionListener,AdjustmentListener{
    JFrame jf;
    JScrollBar jsblue ;
    JScrollBar jsgreen ;
    JScrollBar jsred ;
    JLabel jlb ;
    

    public MyListener(JFrame jf, JScrollBar jsred, JScrollBar jsblue, JScrollBar jsgreen, JLabel jlb) {
        this.jsred = jsred;
        this.jsblue = jsblue;
        this.jsgreen = jsgreen;
        this.jlb = jlb;
        this.jf = jf;
    }
    
    
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
    public void mouseDragged(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        jf.setTitle("X = " + e.getX()+ " ,Y = "+ e.getY());
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
            jf.getContentPane().setBackground(new Color(jsred.getValue(),jsgreen.getValue(),jsblue.getValue()));
            jlb.setText("RGB("+jsred.getValue()+","+jsgreen.getValue()+","+jsblue.getValue()+")");
    }
    
}
