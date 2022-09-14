package com.yash_desai.AJP_22517.Practical_4;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Button;
import java.applet.Applet;

public class Exercise_1 extends Applet {
    GridBagLayout GB_LAYOUT;
    GridBagConstraints GBC;
    Button B;
    void BUTTON_MAKER(String CAPTION) {
        B = new Button(CAPTION);
        GB_LAYOUT.setConstraints(B, GBC);
        add(B);
    }
    public void init() {
        GB_LAYOUT = new GridBagLayout();
        GBC = new GridBagConstraints();
        setLayout(GB_LAYOUT);
        GBC.fill = GridBagConstraints.BOTH;
        BUTTON_MAKER("Button One");
        GBC.gridwidth = GridBagConstraints.REMAINDER;
        BUTTON_MAKER("Button Two");
        GBC.ipady = 20;
        GBC.gridwidth = GridBagConstraints.RELATIVE;
        BUTTON_MAKER("Button Three");
        GBC.gridwidth = GridBagConstraints.REMAINDER;
        BUTTON_MAKER("Button Four");
        BUTTON_MAKER("Button Five");
        setSize(300, 300);
    }
}