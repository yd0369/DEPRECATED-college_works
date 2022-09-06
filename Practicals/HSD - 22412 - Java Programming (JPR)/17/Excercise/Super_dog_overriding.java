package com.yash_desai;
class animal {
    void move(){
        System.out.println("Executing animal.move() method");
    }
}
class dog extends animal{
    @Override
    void move(){
        super.move();
        System.out.println("Executing dog.move() method");
    }
}
public class Super_dog_overriding {
    public static void main(String[] args) {
        dog D = new dog();
        D.move();
    }
}