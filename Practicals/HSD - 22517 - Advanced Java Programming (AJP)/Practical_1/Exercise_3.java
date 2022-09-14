package com.yash_desai.AJP_22517.Practical_1;

import java.awt.Button;
import java.applet.Applet;

public class Exercise_3 extends Applet {
    @Override
    public void init() {
        add(new Button("OK"));
        add(new Button("RESET"));
        add(new Button("CANCEL"));
    }
}