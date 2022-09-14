package com.yash_desai.AJP_22517.Practical_12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercise_3 extends JApplet implements ActionListener {
    JPasswordField jPF;
    JButton jB;
    public void init() {
        jPF = new JPasswordField(10);
        jB = new JButton("SIGN UP");
        setLayout(new FlowLayout());
        setSize(200,100);
        add(new JLabel("User Name :"));
        add(new JTextField(10));
        add(new JLabel("Password  :"));
        add(jPF);
        add(jB);
        jB.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if(jPF.getText().length() < 6)
            new MSG().Error();
    }
}

class MSG implements ActionListener{
    JFrame jF;
    JButton jB;
    void Error() {
        jF = new JFrame();
        jB = new JButton("Okay");
        jF.setVisible(true);
        jF.setLayout(new FlowLayout());
        jF.setSize(300,100);
        jF.add(new JLabel("Password length must be >6 characters"));
        jF.add(jB);
        jB.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        jF.dispose();
    }
}