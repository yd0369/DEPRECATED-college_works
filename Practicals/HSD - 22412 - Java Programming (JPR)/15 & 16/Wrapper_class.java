package com.yash_desai;
import java.util.Scanner;
import java.lang.Integer;
public class String_to_Integer_Object {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Select the Radix of Input Number : " +
                "\n1. Binary Number      [02]" +
                "\n2. Octal Number       [08]" +
                "\n3. Decimal Number     [10]" +
                "\n4. Hexadecimal Number [16]" +
                "\nEnter the Option : ");
        switch (S.nextByte()) {
            case 1:
                Converter(2);
                break;
            case 2:
                Converter(8);
                break;
            case 3:
                Converter(10);
                break;
            case 4:
                Converter(16);
                break;
            default:
                System.out.println("Invalid Input...");
                break;
        }
    }
    static void Converter(int radix) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String STR = S.next();
        Integer I = null;
        I = I.parseInt(STR, radix);
        System.out.println("Integer Object value : " + I);
    }
}                                                                                                                                                                                                                                                                            System.out.println("Byte[byte] Variable Value : " + B);
            }
            case 4: {
                X=MSG();
                double D = X.doubleValue();
                System.out.println("Double[double] Variable Value : " + D);
            }
            case 5: {
                X=MSG();
                float F = X.floatValue();
                System.out.println("Float[float] Variable Value : " + F);
            }
            case 6: {
                X=MSG();
                int I = X.intValue();
                System.out.println("Integer[int] Variable Value : " + I);
            }
            case 7: {
                X=MSG();
                short B = X.shortValue();
                System.out.println("Short[short] Variable Value : " + B);
            }
            case 8: {
                X=MSG();
                long B = X.longValue();
                System.out.println("Long[long] Variable Value : " + B);
            }
            case 9: {
                X=MSG();
                System.out.print("Enter 2nd integer value to be compare with : ");
                Integer tmp = S.nextInt();
                int Comparator = X.compareTo(tmp);
                if(Comparator==0)
                    System.out.println("Both have equal values.");
                else if(Comparator<0)
                    System.out.println("First Integer < Second Integer");
                else System.out.println("First Integer > Second Integer");
            }
            case 10: {
                System.out.print("Enter the First Integer : ");
                Integer i1 = S.nextInt();
                System.out.print("Enter the Second Integer : ");
                Integer i2 = S.nextInt();
                int Comparator = X.compare(i1,i2);
                System.out.println(Comparator);
                if(Comparator==0)
                    System.out.println("Both have equal values.");
                else if(Comparator<0)
                    System.out.println("First Integer < Second Integer");
                else System.out.println("First Integer > Second Integer");
            }
            case 11: {
                X=MSG();
                System.out.print("Enter the Second Integer : ");
                Integer X2 = S.nextInt();
                if(X.equals(X2)==true)
                    System.out.println("Both have equal values.");
                else System.out.println("They have different values");
            }
        }
    }
    static Integer MSG() {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter value of Integer Object : ");
        Integer INT_NUM=S.nextInt();
        return INT_NUM;
    }
}
