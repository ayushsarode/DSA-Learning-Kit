package com.ayush;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr= {12,12,36,3,-7,37,46};
        int target = 3;
        System.out.println(LinearSearch(arr, target, 1, 4));
    }
    static int LinearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        // run a for loop
        for (int index = start; index <= end; index++) {
            //check for elemnet at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }
}
