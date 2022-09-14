package com.yash_desai.AJP_22517.Practical_11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Debug_Problem extends Applet implements MouseListener {

    Label l;
    public void init() {
        setLayout(null);
        l=new Label("Hello Mouse");
        l.setBounds(50,50,300,100);
        addMouseListener(this);
        setSize(300,200);
        add(l);
    }
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked; # of clicks: " + e.getClickCount());
    }
    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed no. of clicks: " + e.getClickCount() +
                "at position" + e.getX()+","+e.getY());
    }
    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released; # of clicks: " + e.getClickCount());
    }
    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
    }
    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
    }
}