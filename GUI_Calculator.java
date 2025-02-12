package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GUI_Calculator implements ActionListener{
    JLabel l1, l2;
    JTextField t1, t2;
    JButton add, sub, mul, div;
    JLabel result;


    void calculator() {
        JFrame jf = new JFrame("Simple Calculator");

        l1 = new JLabel("First Number:");
        l1.setBounds(10, 20, 120, 20);

        t1 = new JTextField();
        t1.setBounds(140, 20, 100, 20);

        jf.add(l1);
        jf.add(t1);

        l2 = new JLabel("Second Number:");
        l2.setBounds(10, 50, 120, 20);

        t2 = new JTextField();
        t2.setBounds(140, 50, 100, 20);

        jf.add(l2);
        jf.add(t2);

        add = new JButton("+");
        add.setBounds(10,100,50,30);
        jf.add(add);

        sub = new JButton("-");
        sub.setBounds(70,100,50,30);
        jf.add(sub);

        mul = new JButton("*");
        mul.setBounds(130,100,50,30);
        jf.add(mul);

        div = new JButton("/");
        div.setBounds(190,100,50,30);
        jf.add(div);

        result = new JLabel("Result:");
        result.setBounds(20, 120,150,20);
        jf.add(result);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);



        jf.setSize(400,400);
        jf.setVisible(true);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {

            if (e.getSource() == add) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a + b;
                result.setText("Result: " + c);
            }

            if (e.getSource() == sub) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a - b;
                result.setText("Result: " + c);
            }

            if (e.getSource() == mul) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a * b;
                result.setText("Result: " + c);
            }

            if (e.getSource() == div) {
                double a = Integer.parseInt(t1.getText());
                double b = Integer.parseInt(t2.getText());
                double c = a / b;
                int x = (int)c;

                if (x == c){
                    result.setText("Result: " + x);
                }
                else{
                    result.setText("Result: " + c);
                }

                //check if given number is int or double
                //https://www.geeksforgeeks.org/check-if-a-float-value-is-equivalent-to-an-integer-value/

            }
        }catch (NumberFormatException e1){
            result.setText("[+]Error: Input integer only!");
        }catch (ArithmeticException e2){
            result.setText("[+]Error: Cannot divide by Zero!");
        }

    }

    public static void main(String[] args) {
        GUI_Calculator sg = new GUI_Calculator();
        sg.calculator();
    }

}
