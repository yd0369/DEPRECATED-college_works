package com.yash_desai.AJP_22517.Practical_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Demo_Key_Pressed_KeyEvent extends JApplet implements KeyListener{
    JLabel jL;
    JTextField jTF;
    public void init() {
        setLayout(new FlowLayout());
        jTF = new JTextField(4);
        add(jTF);
        jTF.addKeyListener(this);
        jL = new JLabel("Press any Key...");
        add(jL);
    }
    public void keyTyped(KeyEvent e) { }
    public void keyPressed(KeyEvent e) {
        jL.setText("Key Pressed : "+e.getKeyCode());
    }
    public void keyReleased(KeyEvent e) {
        jL.setText("Press any Key...");
    }
}