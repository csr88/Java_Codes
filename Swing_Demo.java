package com.company;

import javax.swing.*;

public class Swing_Demo {
    public static void main(String[] args) {
        //create a container
        JFrame jFrame =  new JFrame("Swing Example");
        //create a button
        JButton b = new JButton("Click here");
        b.setBounds(90,300,130,20);
        jFrame.add(b);

        //create a text field
        JTextField tf = new JTextField("This is a text field");
        tf.setBounds(40,100,250,30);
        jFrame.add(tf);

        //create a scrollbar
        JScrollBar jb = new JScrollBar();
        jb.setBounds(650,100,20,200);
        jFrame.add(jb);

        //create a menu
        JMenu menu = new JMenu("Menu Options");
        JMenuBar m1 = new JMenuBar();
        JMenuItem a1 = new JMenuItem("File");
        JMenuItem a2 = new JMenuItem("Edit");
//        jFrame.setBounds(50,300,20,100);
            //adding items in menu
        menu.add(a1);
        menu.add(a2);
            //adding menu in menu bar
        m1.add(menu);
        //set menu bar in jframe
        jFrame.setJMenuBar(m1);

        //adding label
        JLabel la = new JLabel("First Name: ");
        la.setBounds(45,80,90,20);
        jFrame.add(la);

        //adding a combo-box/dropdown
        String courses[] = {"Java", "PHP", "Python"};
        JComboBox jc = new JComboBox(courses);
        jc.setBounds(45,140,90,20);
        jFrame.add(jc);

        //adding a radio button
        JRadioButton jr = new JRadioButton("Male");
        JRadioButton jr2 = new JRadioButton("Female");
        jr.setBounds(45,180,90,20);
        jr2.setBounds(120,180,90,20);
            //grouping buttons
        ButtonGroup bg = new ButtonGroup();
        bg.add(jr);
        bg.add(jr2);
        jFrame.add(jr);
        jFrame.add(jr2);


        //adding list
        DefaultListModel<String>dl = new DefaultListModel<>();
        dl.addElement("First Item");
        dl.addElement("Second Item");
        JList jl = new JList<>(dl);
        jl.setBounds(300,200,150,100);
        jFrame.add(jl);



        //overall frame details
        jFrame.setSize(700,700);
        jFrame.setLayout(null);
        jFrame.setVisible(true);




    }
}
