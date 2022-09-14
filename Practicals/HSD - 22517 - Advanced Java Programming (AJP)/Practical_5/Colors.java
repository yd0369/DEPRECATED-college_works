package com.yash_desai.AJP_22517.Practical_5;

import java.awt.Frame;
import java.awt.MenuBar;
import java.awt.Menu;
import java.awt.MenuItem;

public class Colors {
    MenuBar MB;
    Menu M;
    Colors() {
        Frame F = new Frame();
        MB = new MenuBar();
        String[] COLORS = {"Red","Green","Blue"};
        for (String C: COLORS) {
            M = new Menu(C);
            M.add(new MenuItem("Light "+C));
            M.add(new MenuItem("Dark "+C));
            MB.add(M);
        }
        M = new Menu("Black");
        M.setEnabled(false);
        MB.add(M);
        F.setMenuBar(MB);
        F.setSize(300,300);
        F.setVisible(true);
    }
    public static void main(String args[]) {
        new Colors();
    }
}