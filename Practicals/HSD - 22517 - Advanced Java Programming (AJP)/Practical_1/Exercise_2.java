package com.yash_desai.AJP_22517.Practical_1;

import java.awt.Checkbox;
import java.applet.Applet;

public class Exercise_2 extends Applet {
    @Override
    public void init() {
        add(new Checkbox("Marathi"));
        add(new Checkbox("Hindi"));
        add(new Checkbox("English"));
        add(new Checkbox("Sanskrit"));
    }
}