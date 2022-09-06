package com.yash_desai;
import java.util.Scanner;
class Parent_Class {
    Parent_Class() {
        System.out.println("Parent_Class Contructor Executed...");
    }
    private double X,Y;
    public double getX() { return X; }
    public double getY() { return Y; }
    public void setX(double X) { this.X = X; }
    public void setY(double Y) { this.Y = Y; }
}
interface Parent_Interface {
    double Addition();
    double Subtraction();
    double Multiplication();
    double Division();
    double Modulus();
}
class Child_Class extends Parent_Class implements Parent_Interface {
    Child_Class() {
        System.out.println("Child_Class Contructor Executed...");
    }
    @Override
    public double Addition() { return (super.getX()+super.getY()); }
    @Override
    public double Subtraction() { return (super.getX()-super.getY()); }
    @Override
    public double Multiplication() { return (super.getX()*super.getY()); }
    @Override
    public double Division() { return (super.getX()/super.getY()); }
    @Override
    public double Modulus() { return (super.getX()%super.getY()); }
}
public class Multiple_Inheritance {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        Child_Class C = new Child_Class();
        System.out.print("Enter the value of A : ");
        C.setX(S.nextDouble());
        System.out.print("Enter the value of B : ");
        C.setY(S.nextDouble());
        System.out.print("\nAddition       : "+C.Addition()
                        +"\nSubtraction    : "+C.Subtraction()
                        +"\nMultiplication : "+C.Multiplication()
                        +"\nDivision       : "+C.Division()
                        +"\nModulus        : "+C.Modulus());
    }
}