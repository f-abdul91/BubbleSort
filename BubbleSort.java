package com.sparta;

import java.util.Arrays;

public class BubbleSort {
    public static int[] bubbleSort(int array[]) {
        int length = array.length;
        boolean swap;

        for (int i = 0; i < length-1; i++) {
            swap = false;
            for (int j = 0; j < length-i-1; j++) {

                if (array[j] > array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swap = true;
                }
            }
            if(!swap){ return array;}
        }

        return bubbleSort(array);

    }
}
