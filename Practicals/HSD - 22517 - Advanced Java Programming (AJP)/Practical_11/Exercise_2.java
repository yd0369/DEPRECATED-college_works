package com.yash_desai.AJP_22517.Practical_11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Exercise_2 extends Frame implements MouseListener {
    JLabel jL;
    Exercise_2() {
        setLayout(new FlowLayout());
        jL = new JLabel();
        add(jL);
        addMouseListener(this);
        setVisible(true);
        setSize(400,400);
    }
    public void mouseClicked(MouseEvent e)  { getData(e); }
    public void mousePressed(MouseEvent e)  { getData(e); }
    public void mouseReleased(MouseEvent e) { getData(e); }
    public void mouseEntered(MouseEvent e)  { getData(e); }
    public void mouseExited(MouseEvent e)   { getData(e); }
    void getData(MouseEvent ME) {
        jL.setText("Click #"+ME.getClickCount()+"  [X = "+ME.getX()+" | Y = "+ME.getY()+"]");
    }
    public static void main(String args[]) {
        new Exercise_2();
    }
}