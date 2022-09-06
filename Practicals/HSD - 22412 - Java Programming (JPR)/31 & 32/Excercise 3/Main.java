package com.yash_desai;
import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException{
        FileInputStream input = null;
        try {
            input = new FileInputStream(args[0]);
            int DATA;
            if(input.read() == -1)
                System.out.println("File is Empty");
            else {
                System.out.print("\nPrinting the Content of File : " +
                        "\n>> Beginning of File -----\n");
                while ((DATA = input.read()) != -1) {
                    System.out.print((char) DATA);
                }
                System.out.print("\n>> End of File -----");
            }
        }
        catch (Exception E) {
            System.out.println("Error in File Reading");
        }
        finally {
            input.close();
        }
    }
}