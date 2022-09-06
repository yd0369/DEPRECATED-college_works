package com.yash_desai;
import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner S = new Scanner(System.in);
        System.out.print("Enter Source File Directory : ");
        String src_addr = S.next();
        System.out.print("Enter Destination File Directory : ");
        String dest_addr = S.next();
        FileInputStream input = null;
        FileOutputStream output = null;
        try {
            input = new FileInputStream(src_addr);
            output = new FileOutputStream(dest_addr);
            int DATA;
            while ((DATA = input.read()) != -1)
                output.write(DATA);
        }
        catch (Exception E) {
            System.out.println("Error in File Copying");
        }
        finally {
            if (input != null) input.close();
            if (output != null) output.close();
        }
    }
}