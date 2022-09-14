package com.yash_desai.AJP_22517.Practical_8;

import javax.swing.JApplet;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.util.Scanner;

public class Exercise extends JApplet {
    Object Data[][] = new Object[10][3];
    public void init() {
        Object ColHead[] = {"Name","Percentage","Grade"};
        DATA_ENTRY();
        add(new JScrollPane(new JTable(Data,ColHead)));
    }
    public void DATA_ENTRY() {
        Scanner S = new Scanner(System.in);
        for(int i=0;i<10;i++) {
            System.out.print("\n\n====================" +
                    "\nStudent #"+(i+1)+
            "\n\nName : ");
            Data[i][0]=S.next();
            System.out.print("Percentage : ");
            Data[i][1]=S.next();
            System.out.print("Grade : ");
            Data[i][2]=S.next();
        }
    }
}