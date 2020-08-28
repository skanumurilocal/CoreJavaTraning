package com.corejava.training.datastructures.arrays.sorting;

public class MergeSort extends  BaseSort {

    public static void main(String[] args) {
        int[] array = {20,35,-25,7,55,15,-30};
        printArray(array);
        mergeSort(array,0,array.length);

    }

    public static void mergeSort(int[] array, int start, int end){
        if(end-start<2){
            return;
        }
       int mid = (start+end)/2;

        mergeSort(array,start,mid);
        mergeSort(array,mid,end);
        merge(array,start,mid,end);

    }

    private static void merge(int[] array, int start, int mid, int end) {
        System.out.println("StartIndex: "+start+"   midIndex: "+mid+"    endIndex:  "+end);
    }
}
