package com.yash_desai.AJP_22517.Practical_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Exercise_3 extends JApplet implements KeyListener {
    JTextField jTF_A,jTF_B,jTF_RES;
    public void init() {
        jTF_A = new JTextField(10);
        jTF_B = new JTextField(10);
        jTF_RES = new JTextField("[Press X]",15);
        setLayout(new FlowLayout());
        setSize(250,100);
        add(new JLabel("Enter Value of A : "));
        add(jTF_A);
        add(new JLabel("Enter Value of B : "));
        add(jTF_B);
        add(new JLabel("Result : "));
        add(jTF_RES);
        jTF_RES.addKeyListener(this);
    }
    public void keyTyped(KeyEvent e) { }
    public void keyPressed(KeyEvent e) { }
    public void keyReleased(KeyEvent e) {
        if ((e.getKeyCode() == 88)
                && !(jTF_A.getText().isEmpty())
                && !(jTF_B.getText().isEmpty()))
            jTF_RES.setText(
                    Integer.toString(
                            Integer.parseInt(jTF_A.getText())
                                    *
                                    Integer.parseInt(jTF_B.getText()
                                    )
                    )
            );
    }
}