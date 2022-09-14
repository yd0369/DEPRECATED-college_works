package com.yash_desai.AJP_22517.Practical_12;

import java.applet.Applet;
import java.awt.FlowLayout;
import javax.swing.JApplet;
import javax.swing.JPasswordField;

public class Demo_JPasswordField extends JApplet {
    JPasswordField jPF_DEFAULT,jPF_HASH,jPF_ASTRERICK;
    public void init() {
        setLayout(new FlowLayout());
        setSize(100,100);
        jPF_DEFAULT = new JPasswordField(10);
        jPF_HASH    = new JPasswordField(10);
        jPF_ASTRERICK = new JPasswordField(10);
        jPF_HASH.setEchoChar('#');
        jPF_ASTRERICK.setEchoChar('*');
        add(jPF_DEFAULT);
        add(jPF_HASH);
        add(jPF_ASTRERICK);
    }
}