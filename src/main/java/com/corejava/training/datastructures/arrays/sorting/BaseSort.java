package com.corejava.training.datastructures.arrays.sorting;

public class BaseSort {

    public static void printArray (int[] values){
        System.out.println();
        System.out.print("Values:  ");
        for (int i:values
        ) {
            System.out.print(i+"  ");
        }
        System.out.println();
    }

    public static void swap(int[] array, int i, int j){

        int temp = array[j];
        array[j]= array[i];
        array[i] = temp;
    }

}
