package com.company;
import java.io.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Program_05 {
    public static void main(String[] args) throws IOException {
        InputStreamReader irs =  new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(irs);

        System.out.println("Enter Values for a and b : ");
        int a,b;
        a = 5;
        b = 4;

        System.out.println("Sum of a and b is : "+ (a+b));

    }
}
