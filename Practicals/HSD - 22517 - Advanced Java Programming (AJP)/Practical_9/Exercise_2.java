package com.yash_desai.AJP_22517.Practical_9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercise_2 extends JApplet implements ActionListener {
    JProgressBar jPB;
    JButton B;
    public void init(){
        setSize(300,150);
        setLayout(new FlowLayout());
        jPB = new JProgressBar(0,100);
        B = new JButton("Increment by 10 %");
        jPB.setVisible(true);
        jPB.setStringPainted(true);
        add(jPB);
        add(B);
        setVisible(true);
        B.addActionListener(this);
        setLayout(new FlowLayout());
        setSize(400,200);
    }
    public void actionPerformed(ActionEvent ae) {
        jPB.setValue(jPB.getValue()+10);
        add(jPB);
    }
}
