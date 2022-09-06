package com.yash_desai;
interface NewShape {
    void draw();
}
interface Circle extends NewShape {
    void getRadius();
    int radius =10;
}
class NewCircle implements Circle {
    public void getRadius() {
        System.out.println(radius);
    }
    @Override
    public void draw() {    }
}
public class ExtendInterface extends NewCircle{
    public static void main(String[] args) {
     	Circle nc = new NewCircle();
    	nc.getRadius();
    }
}	