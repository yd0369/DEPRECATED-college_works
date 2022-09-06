package com.yash_desai;
import java.util.Scanner;
class Parameter_Class {
    Parameter_Class(){
        System.out.println("Parameter_Class Constructor Executed...");
    }
    private double length, breadth,radius;
    public double getLength() { return length; }
    public double getBreadth() { return breadth; }
    public double getRadius() { return radius; }
    public void setLength(double length) { this.length = length; }
    public void setBreadth(double breadth) { this.breadth = breadth; }
    public void setRadius(double radius) { this.radius = radius; }
}
interface Area {
    double Rectangle_Area();
    double Circle_Area();
}
class Calculate_Class extends Parameter_Class implements Area {
    Calculate_Class() {
        System.out.println("Calculate_Class Constructor Executed...");
    }
    @Override
    public double Rectangle_Area() {
        return (2*(getLength()+getBreadth()));
    }
    @Override
    public double Circle_Area() {
        return (3.14*getRadius()*getRadius());
    }
}
public class Rectangle_and_Circle_Area {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        Calculate_Class C = new Calculate_Class();
        System.out.print("Enter the value of Rectangle's Length  : ");
        C.setLength(S.nextDouble());
        System.out.print("Enter the value of Rectangle's Breadth : ");
        C.setBreadth(S.nextDouble());
        System.out.print("Enter the value of Circle's Radius : ");
        C.setRadius(S.nextDouble());
        System.out.print("\nArea of Rectangle : "+C.Rectangle_Area()
                +"\nArea of Circle    : "+C.Circle_Area());
    }
}