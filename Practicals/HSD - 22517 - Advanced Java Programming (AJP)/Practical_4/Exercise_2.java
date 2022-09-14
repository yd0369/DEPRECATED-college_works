package com.yash_desai.AJP_22517.Practical_4;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Component;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Button;
import java.applet.Applet;

public class Exercise_2 extends Applet {
    GridBagLayout GB_LAYOUT;
    GridBagConstraints GBC;
    void ADD(Component COMP) {
        GB_LAYOUT.setConstraints(COMP, GBC);
        add(COMP);
    }
    public void init() {
        GB_LAYOUT = new GridBagLayout();
        GBC = new GridBagConstraints();
        setLayout(GB_LAYOUT);
        ADD(new Label("Name"));
        GBC.gridwidth = GridBagConstraints.REMAINDER;
        ADD(new TextField(10));
        GBC.gridwidth = GridBagConstraints.RELATIVE;
        ADD(new Label("Comments"));
        GBC.gridwidth = GridBagConstraints.REMAINDER;
        ADD(new TextArea("",5,15,2));
        ADD(new Button("Submit"));
        setSize(300, 300);
    }
}