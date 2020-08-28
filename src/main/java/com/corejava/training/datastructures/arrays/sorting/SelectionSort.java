package com.corejava.training.datastructures.arrays.sorting;

public class SelectionSort extends BaseSort{

    public static void main(String[] args) {
        int[] unSortedArray = {20,35,-15,7,55,1,-22};
        printArray(unSortedArray);
        unSortedArray =sortArray(unSortedArray);
        printArray(unSortedArray);
    }

    public static int[] sortArray(int[] array){
        for(int j=array.length-1;j>0;j--){
            int largestIndex=0;
            for(int i=0;i<=j;i++){
                if(array[i]>array[largestIndex]){
                    largestIndex=i;
                }
            }
            swap(array,largestIndex,j);
        }

        return array;
    }




}
