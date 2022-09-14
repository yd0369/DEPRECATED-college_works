package com.yash_desai.AJP_22517.Practical_7;

import javax.swing.JApplet;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import java.io.File;
import java.util.Scanner;

public class Exercise extends JApplet {
    DefaultMutableTreeNode DMTN;
    public void init() {
        DMTN = new DefaultMutableTreeNode("ROOT");
        SET_DIRECTORY();
        add(new JTree(DMTN));
    }
    void SET_DIRECTORY() {
        System.out.print("Enter the Directory : ");
        SCAN_DIRECTORY(new File(new Scanner(System.in).next()));
    }
    void SCAN_DIRECTORY(File DIR) {
        File[] FILES = DIR.listFiles();
        for (int i = 0; i< FILES.length; i++)
            if(FILES[i].isDirectory())
                SCAN_DIRECTORY(FILES[i]);
	         else
                DMTN.add(new DefaultMutableTreeNode(FILES[i].toString()));
    }
}

