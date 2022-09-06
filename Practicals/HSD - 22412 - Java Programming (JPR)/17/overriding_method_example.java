package com.yash_desai;
class A {
    void FUN() {
        System.out.println("This is class A Method.");
    }
}
class B extends A {
    void FUN() {
        super.FUN();
        System.out.println("This is class B Method.");
    }
}
class C extends B {
    void FUN() {
        super.FUN();
        System.out.println("This is class C Method.");
    }
}
public class Main {
    public static void main(String[] args) {
        A a= new A();
        B b= new B();
        C c= new C();
        System.out.println("\nCalling Class A's Fun Method :");
        a.FUN();
        System.out.println("\nCalling Class B's Fun Method :");
        b.FUN();
        System.out.println("\nCalling Class C's Fun Method :");
        c.FUN();
    }
}