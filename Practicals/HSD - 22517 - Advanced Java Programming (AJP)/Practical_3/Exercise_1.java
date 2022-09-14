package com.yash_desai.AJP_22517.Practical_3;

import java.awt.Frame;
import java.awt.Button;
import java.awt.GridLayout;

public class Exercise_1 {
    Frame F;
    Exercise_1() {
        F = new Frame();
        F.setLayout(new GridLayout(3,2,4,4));
        for(int X=1;X<6;X++)
                F.add(new Button("Button "+Integer.toString(X)));
        F.setSize(260,130);
        F.setVisible(true);
    }
    public static void main(String[] args) {
        new Exercise_1();
    }
}
