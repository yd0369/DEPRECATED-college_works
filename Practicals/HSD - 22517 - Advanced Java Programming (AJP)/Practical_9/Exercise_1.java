package com.yash_desai.AJP_22517.Practical_9;

import javax.swing.*;
import java.awt.*;

public class Exercise_1 {
    Exercise_1() throws InterruptedException{
        Frame F = new Frame();
        F.setSize(300,150);
        F.setLayout(new FlowLayout());
        JProgressBar jPB = new JProgressBar(0,100);
        jPB.setVisible(true);
        jPB.setStringPainted(true);
        F.add(jPB);
        F.setVisible(true);
        for(int i=0;i<101;i++) {
            Thread.sleep(50);
            F.repaint();
            jPB.setValue(i);
            F.add(jPB);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        new Exercise_1();
    }
}
