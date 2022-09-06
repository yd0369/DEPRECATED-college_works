package com.yash_desai;
import java.util.Scanner;
public class Custom_3D_Matrix {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        byte x,y,z;
        System.out.print("Enter the max value of X : ");
        x=S.nextByte();
        System.out.print("Enter the max value of Y : ");
        y=S.nextByte();
        System.out.print("Enter the max value of Z : ");
        z=S.nextByte();
        int[][][] ARRAY3D = new int[x][y][z];
        System.out.println("\n\n"+x+" X "+y+" X "+z+"   Array Created...");
        Cast_Matrix(ARRAY3D,x,y,z);
        Render_Matrix(ARRAY3D,x,y,z);
    }
    static void Cast_Matrix(int[][][] A,int _X,int _Y,int _Z) {
        System.out.println("\n" +
                "Enter all the values of elements of Array :");
        Scanner S=new Scanner(System.in);
        for(int X=0;X<_X;X++) {
            for(int Y=0;Y<_Y;Y++) {
                for(int Z=0;Z<_Z;Z++) {
                    System.out.print("X : "+X
                            +" | Y : "+Y
                            +" | Z : "+Z+" -> ");
                    A[X][Y][Z]=S.nextInt();
                }
            }
        }
    }
    static void Render_Matrix(int[][][] A,int _X,int _Y,int _Z) {
        System.out.println("\n\n\n"
                +"Displaying all the elements of Array :");
        for(int X=0;X<_X;X++) {
            for(int Y=0;Y<_Y;Y++) {
                for(int Z=0;Z<_Z;Z++) {
                    System.out.print("[ "+A[X][Y][Z]+" ]");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}