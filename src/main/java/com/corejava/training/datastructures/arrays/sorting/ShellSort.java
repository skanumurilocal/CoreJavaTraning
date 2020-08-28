package com.corejava.training.datastructures.arrays.sorting;

public class ShellSort extends  BaseSort {

    public static void main(String[] args) {
        int[] array = {20,35,-25,7,55,15,-30};
        printArray(array);
        sort(array);
        printArray(array);

    }

    public static int[] sort(int[] array){
        for(int gapIndex=array.length/2; gapIndex>0;gapIndex=gapIndex/2){
            for(int i=gapIndex;i<array.length;i++){
                int newElement=array[i];
                int j=i;
                while(j>=gapIndex && array[j-gapIndex]>newElement){
                    array[j] = array[j-gapIndex];
                    j-=gapIndex;
                }
                array[j] = newElement;
            }
        }
        return array;
    }
}
