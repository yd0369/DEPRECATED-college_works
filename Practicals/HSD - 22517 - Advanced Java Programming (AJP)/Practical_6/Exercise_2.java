package com.yash_desai.AJP_22517.Practical_6;

import javax.swing.*;
import java.awt.*;

public class Exercise_2 extends JApplet{
    JTextArea jTA;
    JScrollPane jSP;
    public void init() {
        jTA = new JTextArea(5,10);
        jSP = new JScrollPane(jTA,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        add(jSP);
        setSize(300,300);
        setLayout(new FlowLayout());
    }
}