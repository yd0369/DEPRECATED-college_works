package com.yash_desai.AJP_22517.Practical_6;

import javax.swing.JComboBox;
import javax.swing.JApplet;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Demo_JComboBox extends JApplet implements ActionListener {
    JComboBox<String> jCB;
    JLabel jL;
    public void init() {
        String[] CITIES = {"Solapur","Pune","Banglore","Mumbai"};
        jCB = new JComboBox(CITIES);
        jL = new JLabel();
        add(jCB);
        jCB.addActionListener(this);
        setLayout(new FlowLayout());
        setSize(400,200);
    }
    public void actionPerformed(ActionEvent ae) {
        jL.setText("You are in "+ jCB.getItemAt(jCB.getSelectedIndex()));
        add(jL);
    }
}