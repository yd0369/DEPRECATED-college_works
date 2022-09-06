package com.yash_desai;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;
public class Vector_class {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("How much Element(s) you want to add-in : ");
        int capacity = S.nextInt();
        Vector V = new Vector(capacity);
        Cast_Vector(V);
        System.out.print("Refer the Vector class Methods Table");
        System.out.print("Enter the Option : ");
        switch(S.nextByte()) {
            case 1:
                Add_Element(V);
                break;
            case 2:
                Capacity(V);
                break;
            case 3:
                Contains(V);
                break;
            case 4:
                Clear(V);
                break;
            case 5:
                Element_At(V);
                break;
            case 6:
                Elements(V);
                break;
            case 7:
                First_Element(V);
                break;
            case 8:
                Last_Element(V);
                break;
            case 9:
                Index_Of(V);
                break;
            case 10:
                Insert_Element_At(V);
                break;
            case 11:
                Remove_Element_At(V);
                break;
            case 12:
                Remove_Element(V);
                break;
            case 13:
                Size(V);
                break;
            case 14:
                Copy_Into(V);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        System.out.println("\n\n\n");
        Render_Vector(V);
    }
    static void Cast_Vector(Vector X) {
        Scanner S = new Scanner(System.in);
        System.out.println("\nEnter the values of Element(s) : ");
        for(int loop=0,MAX=(X.capacity());loop<MAX;loop++) {
            System.out.print("Element #"+loop+" : ");
            X.add(loop,(S.nextInt()));
        }
    }
    static void Render_Vector(Vector X) {
        System.out.println("\nDisplaying the values of Element(s) : ");
        for(int loop=0,MAX=(X.capacity());loop<MAX;loop++) {
            System.out.println("Element #"+loop+" : "+X.elementAt(loop));
        }
    }
    static void Add_Element(Vector X) {
        System.out.print("Enter the value of element you want to insert : ");
        Scanner S =new Scanner(System.in);
        X.addElement(S.nextInt());
    }
    static void Capacity(Vector X) {
        System.out.print("Vector Capacity : "+X.capacity());
    }
    static void Contains(Vector X) {
        Scanner S =new Scanner(System.in);
        System.out.print("Enter the value you want to verify with : ");
        if(X.contains(S.nextInt()))
            System.out.println("Vector contain Element with that value.");
        else System.out.println("Vector doesn't contain Element with that value.");
    }
    static void Clear(Vector X) {
        X.clear();
        System.out.print("All the Element's value of Vector Cleared.");
    }
    static void Element_At(Vector X) {
        Scanner S =new Scanner(System.in);
        System.out.print("Enter the index position "+
                "[0~"+(X.capacity()-1)+"] : ");
        System.out.println("Value : "+X.elementAt(S.nextInt()));
    }
    static void Elements(Vector X) {
        Enumeration E = X.elements();
        System.out.println("Enumeration : "+E+" : ");
        while (E.hasMoreElements()){
            System.out.println(E.nextElement());
        }
    }
    static void First_Element(Vector X) {
        System.out.println("First Element of Vector : "
                    +X.firstElement());
    }
    static void Last_Element(Vector X) {
        System.out.println("Last Element of Vector : "
                +X.lastElement());
    }
    static void Index_Of(Vector X) {
        Scanner S =new Scanner(System.in);
        System.out.print("Enter the value : ");
        System.out.println("Index Position : "+X.indexOf(S.nextInt()));
    }
    static void Insert_Element_At(Vector X){
        Scanner S =new Scanner(System.in);
        System.out.print("Enter the value : ");
        int tmp = S.nextInt();
        System.out.print("Enter the Index Position [0~"+(X.capacity()-1)+"] : ");
        X.insertElementAt(tmp,S.nextInt());
        System.out.print("Element Inserted in Vector...");
    }
    static void Remove_Element_At(Vector X){
        Scanner S =new Scanner(System.in);
        System.out.print("Enter the Index Position [0~"+(X.capacity()-1)+"] : ");
        X.removeElementAt(S.nextInt());
        System.out.print("Element Removed from Vector...");
    }
    static void Remove_Element(Vector X){
        Scanner S=new Scanner(System.in);
    }
    static void Size(Vector X) {
        System.out.print("Vector Size : " + X.size());
    }
    static void Copy_Into(Vector X) {
        System.out.println("Array with size "+X.capacity()+" Created...");
        Integer[] ARRAY= new Integer[X.capacity()];
        X.copyInto(ARRAY);
        System.out.println("Copied Successfully...");
        System.out.print(" \tIndex -\tArray Data -\tVector Data");
        for(int i=0,MAX=(X.capacity());i<MAX;i++) {
            System.out.print("\n \t"+i+
                             " -\t"+ARRAY[i]+
                             " -\t"+X.elementAt(i));
        }
    }
}