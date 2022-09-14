package com.yash_desai.AJP_22517.Practical_13;

import java.awt.*;
import java.awt.event.*;

public class Debug_Program {
    Frame f;
    Debug_Program() {
        f = new Frame("Window Adapter");
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[]) {
        new Debug_Program();
    }
}
