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
        System.out.println("Copy using :-" +
                "\n1. Byte Stream Class\n2. Character Stream Class");
        System.out.print("\nEnter Option : ");
        switch(S.nextByte()){
            case 1:
                ByteStreamCopy(src_addr,dest_addr);
                break;
            case 2:
                CharStreamCopy(src_addr,dest_addr);
                break;
            default:
                System.out.println("Invalid Input ");
        }
    }
    private static void ByteStreamCopy(String SRC,String DEST) throws IOException{
        FileInputStream input = null;
        FileOutputStream output = null;
        try {
            input = new FileInputStream(SRC);
            output = new FileOutputStream(DEST);
            int DATA;
            while ((DATA = input.read()) != -1)
                output.write(DATA);
            System.out.println("File Copied.");
        }
        catch (Exception E) {
            System.out.println("Error in File Copying");
        }
        finally {
            if (input != null) input.close();
            if (output != null) output.close();
        }
    }
    private static void CharStreamCopy(String SRC,String DEST) throws IOException{
        FileReader input = null;
        FileWriter output = null;
        try {
            input = new FileReader(SRC);
            output = new FileWriter(DEST);
            int DATA;
            while ((DATA = input.read()) != -1)
                output.write(DATA);
            System.out.println("File Copied.");
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