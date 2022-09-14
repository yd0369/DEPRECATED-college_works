package com.yash_desai.AJP_22517.Practical_3;

import java.awt.Frame;
import java.awt.Label;
import java.awt.GridLayout;

public class Demo_5by5_Grid {
    Frame F;
    Demo_5by5_Grid() {
        int X,Y;
        F = new Frame();
        F.setLayout(new GridLayout(5,5));
        F.setSize(300,300);
        F.setVisible(true);
        for(X=0;X<5;X++)
            for(Y=0;Y<5;Y++)
                F.add(new Label(
                        "[X : "+Integer.toString(X) +"] [Y : "+Integer.toString(Y)+"]"));
    }
    public static void main(String[] args) {
        new Demo_5by5_Grid();
    }
}
