package com.corejava.training.datastructures.arrays.sorting;

public class BubbleSort extends BaseSort{

    public static void main(String[] args) {
        int[] unSortedArray = {20,35,-15,7,55,1,-22};
        printArray(unSortedArray);
        unSortedArray =sortArray(unSortedArray);
        printArray(unSortedArray);

    }

    public static int[] sortArray(int[] unSortedArray) {
        int temp=0;
        for(int i=unSortedArray.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(unSortedArray[j]>unSortedArray[j+1]){
                    swap(unSortedArray,j,j+1);
                }
            }
        }

        return unSortedArray;

    }

}
