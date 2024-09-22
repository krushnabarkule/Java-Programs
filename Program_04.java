package com.company;
import java.util.Scanner;

public class Program_04 {
    static  int addInt(int x1,int y1){
        int z1;
        z1 = x1 + y1 ;

        return z1;
    }

     static  float addfloat(float x2,float y2){
        float z2;
        z2 = x2 + y2 ;

        return z2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b,sum1;
        System.out.println("Addition of two integer number :");
        System.out.print("Enter value for a : ");
        a = sc.nextInt();

        System.out.print("Enter value for b : ");
        b = sc.nextInt();

        sum1 = addInt(a,b);
        System.out.println("Sum of 2 integer number is : " + sum1);

        float x,y,sum2;
        System.out.println("Addition of two float number :");
        System.out.print("Enter value for x : ");
        x = sc.nextFloat();

        System.out.print("Enter value for y : ");
        y = sc.nextFloat();

        sum2 = addfloat(x,y);
        System.out.print("Sum of 2 integer number is : " + sum2);


    }
}
