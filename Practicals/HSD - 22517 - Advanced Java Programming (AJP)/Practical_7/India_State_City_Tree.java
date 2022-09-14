package com.yash_desai.AJP_22517.Practical_7;

import javax.swing.JApplet;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class India_State_City_Tree extends JApplet{
    DefaultMutableTreeNode Root_DMTN_India,DMTN_Maharastra,DMTN_Gujrat;
    public void init() {
        Root_DMTN_India = new DefaultMutableTreeNode("India");
        DMTN_Maharastra = new DefaultMutableTreeNode("Maharastra");
        DMTN_Gujrat = new DefaultMutableTreeNode("Gujrath");
        Root_DMTN_India.add(DMTN_Maharastra);
        String[] Maharastra = {"Mumbai","Pune","Nashik","Nagpur"};
        for(String STR : Maharastra) {
           DMTN_Maharastra.add(new DefaultMutableTreeNode(STR));
        }
        Root_DMTN_India.add(DMTN_Gujrat);
        add(new JTree(Root_DMTN_India));
    }
}