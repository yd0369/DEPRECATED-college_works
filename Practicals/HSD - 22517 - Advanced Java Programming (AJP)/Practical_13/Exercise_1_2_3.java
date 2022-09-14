package com.yash_desai.AJP_22517.Practical_13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exercise_1_2_3 {
    JFrame jF;
    JLabel jL_WL,jL_WSL,jL_WFL,jL_AL,jL_MML;
    JButton jB;
    GridBagLayout GB_LAYOUT;
    GridBagConstraints GBC;
    Exercise_1_2_3() {
        GB_LAYOUT = new GridBagLayout();
        GBC = new GridBagConstraints();
        jF = new JFrame();
        jL_WL = new JLabel("WindowListener");
        jL_WSL = new JLabel("WindowStateListener");
        jL_WFL = new JLabel("WindowFocusListener");
        jL_AL = new JLabel("ActionListener");
        jL_MML = new JLabel("MouseMotionListener");
        jB = new JButton("Dispose Frame Window");
        jF.setLayout(GB_LAYOUT);
        jF.setSize(500,300);
        jF.setVisible(true);
        GBC.gridwidth = GridBagConstraints.REMAINDER;
        ADD(jL_WL);
        ADD(jL_WSL);
        ADD(jL_WFL);
        ADD(jL_AL);
        ADD(jL_MML);
        ADD(jB);
        jB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jF.dispose();
                PRINT("ActionListener : Action Performed - Frame Disposed",jL_AL);
            }
        });
        jF.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                PRINT("MouseMotionListener : Mouse Dragged",jL_MML);
            }
        });
        jF.addWindowListener(new WindowAdapter() {
            public void windowOpened(WindowEvent e) {
                PRINT("WindowListener : Frame Opened",jL_WL);
            }
            public void windowClosing(WindowEvent e) {
                PRINT("WindowListener : Frame Closing",jL_WL);
            }
            public void windowClosed(WindowEvent e) {
                PRINT("WindowListener : Frame Closed",jL_WL);
            }
            public void windowIconified(WindowEvent e) {
                PRINT("WindowListener : Frame Iconified",jL_WL);
            }
            public void windowDeiconified(WindowEvent e) {
                PRINT("WindowListener : Frame Deiconified",jL_WL);
            }
            public void windowActivated(WindowEvent e) {
                PRINT("WindowListener : Frame Activated",jL_WL);
            }
            public void windowDeactivated(WindowEvent e) {
                PRINT("WindowListener : Frame Deactivated",jL_WL);
            }
        });

        jF.addWindowStateListener(new WindowAdapter() {
            public void windowStateChanged(WindowEvent e) {
                PRINT("WindowStateListener : Frame State Changed",jL_WSL);
            }
        });

        jF.addWindowFocusListener(new WindowAdapter() {
            public void windowGainedFocus(WindowEvent e) {
                PRINT("WindowFocusListener : Frame Gained Focus",jL_WFL);
            }
            public void windowLostFocus(WindowEvent e) {
                PRINT("WindowFocusListener : Frame Lost Focus",jL_WFL);
            }
        });
    }
    void ADD(Component COMP) {
        GB_LAYOUT.setConstraints(COMP, GBC);
        jF.add(COMP);
    }
    public void PRINT(String S,JLabel jL) {
        jL.setText(S);
        System.out.println(S);
    }
    public static void main(String args[]) {
        new Exercise_1_2_3();
    }
}