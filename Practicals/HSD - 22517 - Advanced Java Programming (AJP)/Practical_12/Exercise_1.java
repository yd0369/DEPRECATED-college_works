package com.yash_desai.AJP_22517.Practical_12;

import javax.swing.*;
import java.awt.*;

public class Exercise_1 extends JApplet {
    public void init() {
        setLayout(new FlowLayout());
        setSize(200,100);
        add(new JLabel("User Name :"));
        add(new JTextField(10));
        add(new JLabel("Password  :"));
        add(new JPasswordField(10));
        add(new JButton("LOGIN"));
    }
}