package com.akarin_corp;
class Mathematical_Operations {
    Mathematical_Operations() {
        System.out.println("From \"akarin_corp\" Package,"+
                "\"Mathematical_Operations\" class Constructor Executed...");
    }
    private double First_Operand,Second_Operand;
    public double getFirst_Operand() { return First_Operand; }
    public double getSecond_Operand() { return Second_Operand; }
    public void setFirst_Operand(double First_Operand) {
        this.First_Operand = First_Operand;
    }
    public void setSecond_Operand(double Second_Operand) {
        this.Second_Operand = Second_Operand;
    }
}
interface Function {
    double Addition();
    double Subtraction();
    double Multiplication();
    double Division();
    double Modulus();
}
public class Akari extends Mathematical_Operations implements Function{
    public Akari() {
        System.out.println("From \"akarin_corp\" Package,"+
                "\"Akari\" class Constructor Executed...");
    }
    @Override
    public double Addition() { return (getFirst_Operand()+getSecond_Operand()); }
    @Override
    public double Subtraction() { return (getFirst_Operand()-getSecond_Operand()); }
    @Override
    public double Multiplication() { return (getFirst_Operand()*getSecond_Operand()); }
    @Override
    public double Division() { return (getFirst_Operand()/getSecond_Operand()); }
    @Override
    public double Modulus() { return (getFirst_Operand()%getSecond_Operand()); }
}