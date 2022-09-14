package com.yash_desai.AJP_22517.Practical_8;

import javax.swing.*;

public class JTable_Employee extends JApplet {
    public void init() {
        Object Data[][] = {{101,"Amit",670000},
                {102,"Jai",760000},
                {103,"Sachin",700000}};
        Object ColHead[] = {"ID","NAME","SALARY"};
        add(new JScrollPane(new JTable(Data,ColHead)));
    }
}
