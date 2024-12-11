package com.lab_02;

import java.util.Arrays;

public class DeleteFromList {
    static int[] list = {1,2,3,4,5,6};
    public static void main(String[] args) {
        System.out.println(Arrays.toString(list));
        int[] newList = delete(2);
        System.out.println(Arrays.toString(newList));
    }

    public static int[] delete(int index){
        int[] updatedArray = new int[list.length-1];
        for(int i=0; i<updatedArray.length; i++){
            if(i<index)
                updatedArray[i] = list[i];
            else
                updatedArray[i] = list[i+1];
        }
        return updatedArray;
    }
}
