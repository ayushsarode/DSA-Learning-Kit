package com.ayush;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
//        int target = 1; ans = -1
        int target = 12;
        int ans = Binary_Search(arr, target);
        System.out.println(ans);
    }

    //returnn the index of smallest no >= target
    static int Binary_Search(int[] arr, int target){


        //but what if the target is greater than the greatest number in the array
        if(target > arr[arr.length-1]){
            return -1;
        }

        int start = 0;
        int end = arr.length -1;

        while(start<=end){

            //find the middle element
//            int mid = start + end / 2; //might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start)/2;

            if (target < arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid +1;
            }else {
                return mid;
            }
        }
        return end;
    }
}
