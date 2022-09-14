package com.yash_desai.AJP_22517.Practical_3;

import java.awt.Frame;
import java.awt.Button;
import java.awt.Label;
import java.awt.GridLayout;

public class Demo_0to9_Buttons_Grid {
    Frame F;
    void Demo_0to9_Buttons_Grid_FUN() {
        F = new Frame();
        F.setLayout(new GridLayout(4,3));
        for(int X=0;X<10;X++) {
            F.add(new Button(Integer.toString(X)));
            if (X == 0) {
                F.add(new Label(""));
                F.add(new Label(""));
            }
        }
        F.setSize(400,300);
        F.setVisible(true);
    }
    public static void main(String[] args) {
        new Demo_0to9_Buttons_Grid().Demo_0to9_Buttons_Grid_FUN();
    }
}
