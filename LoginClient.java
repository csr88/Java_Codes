package com.company;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class LoginClient extends JFrame{

    private JFrame frame;
    private JTextField clientUserName;
    private int port = 8818;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LoginClient window = new LoginClient();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public LoginClient() {
        initialize();
    }


    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 619, 342);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setTitle("Client Register");

        clientUserName = new JTextField();
        clientUserName.setBounds(207, 50, 276, 61);
        frame.getContentPane().add(clientUserName);
        clientUserName.setColumns(10);

        JButton clientLoginBtn = new JButton("Connect");
        clientLoginBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String id = clientUserName.getText();
                    Socket s = new Socket("localhost", port);
                    DataInputStream inputStream = new DataInputStream(s.getInputStream());
                    DataOutputStream outStream = new DataOutputStream(s.getOutputStream());
                    outStream.writeUTF(id);

                    String msgFromServer = new DataInputStream(s.getInputStream()).readUTF();
                    if(msgFromServer.equals("Username already taken")) {
                        JOptionPane.showMessageDialog(frame,  "Username already taken\n");
                    }else {
                        new ClientView(id, s);
                        frame.dispose();
                    }
                }catch(Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        clientLoginBtn.setFont(new Font("Tahoma", Font.PLAIN, 17));
        clientLoginBtn.setBounds(207, 139, 132, 61);
        frame.getContentPane().add(clientLoginBtn);

        JLabel lblNewLabel = new JLabel("Username");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(44, 55, 132, 47);
        frame.getContentPane().add(lblNewLabel);
    }


}