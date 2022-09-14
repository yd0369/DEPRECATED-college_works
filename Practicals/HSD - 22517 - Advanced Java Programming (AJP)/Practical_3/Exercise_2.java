package com.yash_desai.AJP_22517.Practical_3;

import java.awt.Frame;
import java.awt.Button;
import java.awt.BorderLayout;

public class Exercise_2 {
    Frame F;
    Exercise_2() {
        F = new Frame();
        F.setLayout(new BorderLayout());
        F.add(new Button("North"), BorderLayout.NORTH);
        F.add(new Button("South"), BorderLayout.SOUTH);
        F.add(new Button("East"), BorderLayout.EAST);
        F.add(new Button("West"), BorderLayout.WEST);
        F.add(new Button("Center"), BorderLayout.CENTER);
        F.setSize(200,200);
        F.setVisible(true);

    }
    public static void main(String[] args) {
        new Exercise_2();
    }
}
