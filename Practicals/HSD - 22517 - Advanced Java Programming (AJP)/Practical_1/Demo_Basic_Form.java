package com.yash_desai.AJP_22517.Practical_1;

import java.awt.Label;
import java.awt.TextField;
import java.awt.TextArea;
import java.awt.Button;
import java.applet.Applet;

public class Demo_Basic_Form extends Applet {
    @Override
    public void init() {
        add(new Label("This is Text Field ->"));
        add(new TextField());
        add(new Label("Below is Text Area "));
        add(new TextArea());
        add(new Button("This is a button"));
    }
}