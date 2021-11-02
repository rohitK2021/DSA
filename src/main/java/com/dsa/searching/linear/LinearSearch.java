package com.dsa.searching.linear;

/**
 * Best Case: O[1] - Constant
 * Worst Case: O[n] - Linear
 * Average Case: O[n] - Linear
 */
public class LinearSearch {

    public static void main(String[] args) {
      int[] array = {3, 12, 5, 27, 10, 35, 16, 36};
      System.out.println(linearSearch(array, 109));
    }

    static int linearSearch(int[] array, int target){
        int arayLength = array.length;

        if(arayLength == 0){
            return -1;
        }
        for (int i = 0; i < arayLength; i++) {
            if(array[i] == target)
                return i;
        }

        return -1;
    }
}


