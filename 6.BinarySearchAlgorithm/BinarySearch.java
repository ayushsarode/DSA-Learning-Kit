package com.ayush;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-12,-1,4,6,9,25,83,101,150,200};
        int target = 150;
        int ans = BinarySearch(arr, target);
        System.out.println(ans);
    }
    static int BinarySearch(int[] arr, int target){
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
        return -1;
    }
}
