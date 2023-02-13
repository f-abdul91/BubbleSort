package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {



    @Test
    public void sortTheseNumbers() throws Throwable{
        int[] conInts = Numbers.firstArray;
        int[] expected = {67, 79, 172, 203, 254, 286, 297, 345, 381, 431};
        int[] result = BubbleSort.bubbleSort(conInts);
        Assertions.assertArrayEquals(expected, result);
    }


    @Test
    public void sortTheseNumbers2(){
        int[] conInts = Numbers.secondArray;
        int[] expected = {-1, 113, 175, 185, 252, 263, 312, 400, 407, 479};
        int[] result = BubbleSort.bubbleSort(conInts);
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void sortTheseNumbers3(){
        int[] conInts = Numbers.thirdArray;
        int[] expected = {65, 73, 79, 100, 275, 324, 337, 340, 436, 484};
        int[] result = BubbleSort.bubbleSort(conInts);
        Assertions.assertArrayEquals(expected, result);
    }

}