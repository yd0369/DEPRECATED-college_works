package com.yash_desai.AJP_22517.Practical_1;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.applet.Applet;

public class Demo_Checkbox_and_Radiobutton extends Applet {
    @Override
    public void init() {
        add("Checkbox #1",new Checkbox("Checkbox #1"));
        add("Checkbox #2",new Checkbox("Checkbox #2"));
        add("Checkbox #3",new Checkbox("Checkbox #3"));
        CheckboxGroup GROUP = new CheckboxGroup();
        add("Radio Button #1",new Checkbox("Radio Button #1",GROUP,false));
        add("Radio Button #2",new Checkbox("Radio Button #2",GROUP,false));
        add("Radio Button #3",new Checkbox("Radio Button #3",GROUP,false));
    }
}