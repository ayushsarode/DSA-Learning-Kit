package com.ayush;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
//    int[] arr = {-19,-12,4,0,2,5,7,9,12,15,17,32,53,75}; ascend
    int[] arr = {77,64,42,24,18,9,6,4,1,-1,-5,-12,-15};
    int target = 9;
    int ans = orderAgnosticBinarySearch(arr, target);

        System.out.println(ans);
    }
    static  int orderAgnosticBinarySearch(int[]arr, int target){
        int start = 0;
        int end = arr.length -1;

        //find whether the array is sorted in ascending or descending order
        boolean isAscend = arr[start] < arr[end];

        while (start<=end){
            int mid = start + (end - start/ 2);

            if (arr[mid] == target){
                return  mid;
            }

            if (isAscend) {
                if (target < arr[mid]) {
                    end = mid - 1;

                } else{
                    start = mid + 1;
                }
            }else {
                if (target > arr[mid]) {
                    end = mid - 1;

                } else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
