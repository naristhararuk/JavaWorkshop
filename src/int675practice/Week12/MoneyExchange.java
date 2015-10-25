/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int675practice.Week12;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Student Lab
 */
public class MoneyExchange extends JFrame implements ActionListener{

    JTextField jtfusd;
    JTextField jtfbaht;
    JTextField jtfbahttext;
    JButton jb;
    
    public MoneyExchange() throws HeadlessException {
        super("Simply Money Exchange Application");
        jtfusd = new JTextField(35);
        jtfbaht = new JTextField(35);
        jtfbahttext = new JTextField(35);
        jtfbahttext.setBorder(null);
        jb = new JButton("Calculate");
        jb.addActionListener(this);
        jtfusd.addActionListener(this);/*Action Event when enter in this text*/
        
//        GridLayout grid = new GridLayout(1,2); 
//        GridLayout grid1 = new GridLayout(5,1);
//        GridLayout grid2 = new GridLayout(5,1);
//
//
//        grid.add(grid1);
//        grid.add(grid2);
//        
        setLayout(new GridLayout(4,2,1,10));
        
        add(new JLabel("Amount in US-Dollar : ", SwingConstants.RIGHT));
        add(jtfusd);
        add(new JLabel("Amount in Baht : "));
        add(jtfbaht);
        jtfbaht.setEditable(false);
        jtfbaht.setBackground(Color.cyan);
        add(new JLabel("Amount in Text : "));
        add(jtfbahttext);
        add(new JLabel(""));
        add(jb);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new MoneyExchange();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            Double x = Double.parseDouble(this.jtfusd.getText())*37.25;
            DecimalFormat df = new DecimalFormat("#,###.00 ");
            jtfbaht.setText(""+df.format(x));
            jtfbahttext.setText("สามร้อยบาทถ้วน");
        }catch(NumberFormatException ne){
            JOptionPane.showMessageDialog(this,"Number Only","Warning",JOptionPane.WARNING_MESSAGE);
            jtfusd.setText("");
            jtfbaht.setText("");
            jtfbahttext.setText("");
            jtfusd.select(0,jtfusd.getText().length());
        }
    }
}
