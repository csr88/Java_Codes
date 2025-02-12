package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_Temperature implements ActionListener {
    JLabel l1, l2;
    JTextField t1, t2;
    JButton b1,b2;
    JLabel l3;

    void converter(){
        JFrame jf = new JFrame("Temperature Converter.");
        jf.setLayout(new FlowLayout());


        l1 = new JLabel("Celsius:");
        t1 = new JTextField(10);

        l2 = new JLabel("Fahrenheit:");
        t2 = new JTextField(10);

        b1 = new JButton("Celsius to Fahrenheit");
        b2 = new JButton("Fahrenheit to Celsius");

        l3 = new JLabel("Result: ");


        jf.add(l1);
        jf.add(t1);
        jf.add(l2);
        jf.add(t2);
        jf.add(b1);
        jf.add(b2);
        jf.add(l3);

        b1.addActionListener(this);
        b2.addActionListener(this);


        jf.setSize(400,130);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    //(C × 9/5) + 32 = °F
    //C = 5/9 x (F - 32)
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1){
            float n1 = Integer.parseInt(t1.getText());
            float c = ((n1 * (9/5))+32);
            String result = Float.toString(c);
//            t2.setText(result.substring(5));
            l3.setText("Result: " + result + "°F");
        }
        if (e.getSource() == b2){
            float n1 = Integer.parseInt(t2.getText());
            float c1 = (n1-32);
            float c2 = (5f/9);
            float c = c1*c2;
            String result = Float.toString(c);
//            t2.setText(result.substring(5));
            l3.setText("Result: " + result + "C");

        }

    }

    public static void main(String[] args) {
        GUI_Temperature gt = new GUI_Temperature();
        gt.converter();
    }
}
