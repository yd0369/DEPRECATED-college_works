package com.yash_desai.AJP_22517.Practical_12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercise_2 extends JApplet implements ActionListener {
    JTextField jTF_A,jTF_B;
    JButton jB_RES;
    public void init() {
        jTF_A = new JTextField(10);
        jTF_B = new JTextField(10);
        jB_RES = new JButton("CALCULATE");
        setLayout(new FlowLayout());
        setSize(250,100);
        add(new JLabel("Enter Value of A : "));
        add(jTF_A);
        add(new JLabel("Enter Value of B : "));
        add(jTF_B);
        add(jB_RES);
        jB_RES.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if (!(jTF_A.getText().isEmpty()) && !(jTF_B.getText().isEmpty()))
            jB_RES.setText(Integer.toString(
                            Integer.parseInt(jTF_A.getText())
                                    +
                                    Integer.parseInt(jTF_B.getText())));
    }
}