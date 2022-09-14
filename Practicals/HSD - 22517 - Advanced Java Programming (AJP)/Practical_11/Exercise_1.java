package com.yash_desai.AJP_22517.Practical_11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class Exercise_1 extends Applet implements MouseListener {
    Random R;
    public void init() {
        R = new Random();
        addMouseListener(this);
    }
    public void mouseClicked(MouseEvent e) {
        Random_BG_Color();
    }
    public void mousePressed(MouseEvent e) { Random_BG_Color(); }
    public void mouseReleased(MouseEvent e) { Random_BG_Color(); }
    public void mouseEntered(MouseEvent e) { Random_BG_Color(); }
    public void mouseExited(MouseEvent e) { Random_BG_Color(); }

    public void Random_BG_Color() {
        setBackground(new Color(R.nextInt(255), R.nextInt(255), R.nextInt(255)));
    }
}