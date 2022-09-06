package com.yash_desai;
import java.awt.*;
import java.applet.*;

public class myAPPLET extends Applet{
    public void paint(Graphics g) {
        g.drawRect(120,300,240,60); // rect
        g.drawOval(30,0,420,420); //oval 1
        g.drawOval(90,60,120,120); //oval 2
        g.drawOval(270,60,120,120); //oval 3
        int X[] = {240,195,285};
        int Y[] = {180,270,270};
        g.drawPolygon(X,Y,3); //polygon


    }
}
