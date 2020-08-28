package com.corejava.training.datastructures.arrays.sorting;

import java.util.Scanner;

public class Factorial extends  BaseSort{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Please Enter any Positive number To Calculate Factorial, To Exit Enter -1");
            int value =scanner.nextInt();
            if(value<0){
                scanner.close();
                break;
            }
            System.out.println("The actual value is :  "+value+" and factorial of :  "+factorial(value));
        }
        int factNum = 5;

    }

    public static long factorial(int number){
        if(number==0){
            return 1;
        }else{
           return number*factorial(number-1);
        }
    }
}
