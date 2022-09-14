package com.yash_desai.AJP_22517.Practical_5;

import java.awt.Frame;
import java.awt.MenuBar;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.event.KeyEvent;

public class Exercise extends Frame{
    MenuBar mb;
    MenuItem m1,m2,m3,m4;
    Menu mn;
    MenuShortcut ms;
    Exercise() {
        setTitle("Menu Bar Demo");
        setSize(500,500);
        setLayout(null);
        ms=new MenuShortcut(KeyEvent.VK_X);
        mn=new Menu("File");
        mb=new MenuBar();
        m1=new MenuItem("New...");
        m2=new MenuItem("Open...");
        m3=new MenuItem("Save As...");
        m4=new MenuItem("Exit",ms);
        mn.add(m1);
        mn.add(m2);
        mn.add(m3);
        mn.addSeparator();
        mn.add(m4);
        mb.add(mn);
        setMenuBar(mb);
    }
    public static void main(String[] args) {
        new Exercise().setVisible(true);
    }
}