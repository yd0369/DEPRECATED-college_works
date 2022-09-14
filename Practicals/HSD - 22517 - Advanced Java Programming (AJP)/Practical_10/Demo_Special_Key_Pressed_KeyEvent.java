package com.yash_desai.AJP_22517.Practical_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Demo_Special_Key_Pressed_KeyEvent extends JApplet implements KeyListener{
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
        if(e.getKeyCode() >= 112 && e.getKeyCode() <= 123)
            jL.setText("Function Key Pressed : F"+(e.getKeyCode()-111));
        if(e.getKeyCode() >= 37 && e.getKeyCode() <= 40)
            jL.setText("Arrow Key Pressed : "+
                    (e.getKeyCode()==37 ? "LEFT" : e.getKeyCode()==38 ? "UP" : e.getKeyCode()==39 ? "RIGHT" : "DOWN"));
    }
    public void keyReleased(KeyEvent e) {
        jL.setText("Press any Key...");
    }
}