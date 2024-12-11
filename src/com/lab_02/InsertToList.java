package com.lab_02;

import java.util.Arrays;
import java.util.Scanner;

public class InsertToList {
    static int[] list = {1,2,3,4,5,6};
    public static void main(String[] args) {
        System.out.println(Arrays.toString(list));
        int[] newList = insert(2, 15);
        System.out.println(Arrays.toString(newList));
    }

    public static int[] insert(int index, int x){
        int[] updatedArray = new int[list.length+1];
        for(int i=0; i<updatedArray.length; i++){
            if(i<index)
                updatedArray[i] = list[i];
            else if(i==index)
                updatedArray[i] = x;
            else
                updatedArray[i] = list[i-1];
        }
        return updatedArray;
    }
}