package com.yash_desai.AJP_22517.Practical_11;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Exercise_3 extends Applet implements MouseMotionListener {
    JLabel jL;
    public void init() {
        setLayout(new FlowLayout());
        jL = new JLabel();
        add(jL);
        addMouseMotionListener(this);
    }
    public void mouseDragged(MouseEvent e) {
        jL.setText("Mouse Dragged");
    }
    public void mouseMoved(MouseEvent e) {
        jL.setText("Mouse Moved");
    }
}