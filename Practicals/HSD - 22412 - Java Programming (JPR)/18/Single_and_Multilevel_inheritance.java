package com.yash_desai;
import java.util.Scanner;
class A{
    A(){
        System.out.println("Class A Constructor Executed...");
    }
    private int A;
    public int getA() {
        return A;
    }
    public void setA(int A) {
        this.A = A;
    }
}
class B extends  A{
    B(){
        System.out.println("Class B Constructor Executed...");
    }
    private int B;
    public int getB() {
        return B;
    }
    public void setB(int B) {
        this.B = B;
    }
}
class C extends B{
    C(){
        System.out.println("Class C Constructor Executed...");
    }
    private int C;
    public int getC() {
        return C;
    }
    public void setC(int C) {
        this.C = C;
    }
}
public class Single_and_Multilevel_inheritance {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Creating Class C Object...");
        C c = new C();
        System.out.println("\nEnter the following values :\n");
        System.out.print("Enter the value of variable A of class A (inherited) : ");
        c.setA(S.nextInt());
        System.out.print("Enter the value of variable B of class B (inherited) : ");
        c.setB(S.nextInt());
        System.out.print("Enter the value of variable C of class C : ");
        c.setC(S.nextInt());
        System.out.println("\nDisplaying Stored Values :\n"+
                "\nThe value of variable A inherited by class B which inherits by class A : "+c.getA()+
                "\nThe value of variable B inherited by class B : "+c.getB()+
                "\nThe value of variable C of class C : "+c.getC());
    }
}