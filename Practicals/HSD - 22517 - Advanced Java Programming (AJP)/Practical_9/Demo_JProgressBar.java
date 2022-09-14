package com.yash_desai.AJP_22517.Practical_9;

import javax.swing.*;
import java.awt.*;

public class Demo_JProgressBar extends JApplet {
    public void init() {
        JProgressBar jPB = new JProgressBar(0,1);
        jPB.setValue(1);
        jPB.setStringPainted(true);
        add(jPB);
        setSize(300,50);
        setLayout(new FlowLayout());
    }
}
