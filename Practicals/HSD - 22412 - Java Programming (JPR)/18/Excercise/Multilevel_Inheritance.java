package com.yash_desai;
import java.util.Scanner;
class Circle{
    private double radius;
    public double getradius() {
        return radius;
    }
    public void setradius(double radius) {
        this.radius = radius;
    }
}
class Perimeter extends Circle{
    public double Perimeter() {
        return (2*3.14*super.getradius());
    }
}

class Area extends Perimeter{
    public double Area() {
        return (super.getradius()*super.getradius()*3.14);
    }
}
public class Multilevel_Inheritance {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        Area A = new Area();
        System.out.print("Enter the Radius of circle : ");
        A.setradius(S.nextInt());
        System.out.println("Circle Perimeter (Circumference) : "+A.Perimeter());
        System.out.println("Circle Area : "+A.Area());
    }
}	