package com.corejava.training.datastructures.arrays.sorting;

public class InsertionSort  extends BaseSort{
    public static void main(String[] args) {
        int[] array = {20,35,-25,7,55,15,-30};
        printArray(array);
        sort(array);
        printArray(array);
    }
    public static int[] sort(int[] array){
        for(int startIndex=1;startIndex<array.length;startIndex++){
            int eleForCompare = array[startIndex];

            int i;

            for(i=startIndex;i>0 && array[i-1]>eleForCompare;i--){
                array[i]=array[i-1];
            }

            array[i] = eleForCompare;
        }

        return array;
    }
}
