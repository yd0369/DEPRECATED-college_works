package com.yash_desai;
import java.util.Scanner;
public class Matrix_3D {
    public static void main(String[] args) {
        int[][][] ARRAY3D = new int[3][3][3];
        Cast_Matrix(ARRAY3D);
        Render_Matrix(ARRAY3D);
    }
    static void Cast_Matrix(int[][][] A) {
        System.out.println("Enter all the values of elements of Array :");
        Scanner S=new Scanner(System.in);
        for(int x=0;x<3;x++) {
            for(int y=0;y<3;y++) {
                for(int z=0;z<3;z++) {
                    System.out.print("X : "+x+" | Y : "+y+" | Z : "+z+" -> ");
                    A[x][y][z]=S.nextInt();
                }
            }
        }
    }
    static void Render_Matrix(int[][][] A) {
        System.out.println("Displaying all the elements of Array :");
        for(int x=0;x<3;x++) {
            for(int y=0;y<3;y++) {
                for(int z=0;z<3;z++) {
                    System.out.print("[ "+A[x][y][z]+" ]");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

}