package com.ayush;

public class Basics {
    public static void main(String[] args) {
        int[] nums = {24,33,5,3,19,3,8,36,48,36,8,45};
        int target = 8;
        int ans = LinearSearch(nums, target);
        System.out.println(ans + "th index");
    }

    // search in the array: return the index if item found
    // otherwise if item not found return -1
    static int LinearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        // run a for loop
        for (int index = 0; index < arr.length; index++) {
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


