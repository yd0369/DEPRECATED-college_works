package com.yash_desai;
import java.awt.*;
import java.applet.*;

public class myAPPLET extends Applet{
    public void paint(Graphics g) {
        Dimension appletSize = this.getSize();
        g.drawString("Welcome to the World of Applet"
                ,0,(appletSize.height/2));
    }
}
