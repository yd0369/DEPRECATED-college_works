package com.yash_desai.AJP_22517.Practical_7;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class Demo_JTree extends JApplet{
    DefaultMutableTreeNode Root_DMTN;
    public void init() {
        Root_DMTN = new DefaultMutableTreeNode("ABC");
        char[] ABC = {'A','B','C'};
        for(char CH : ABC)
            Root_DMTN.add(new DefaultMutableTreeNode(CH));
        add(new JTree(Root_DMTN));
    }
}