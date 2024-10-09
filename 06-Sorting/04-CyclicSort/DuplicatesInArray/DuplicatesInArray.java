// 442. Find All Duplicates in an Array
// https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicatesInArray {
    public static void main(String[] args) {
        int[] arr = {3,5,4,2,2,1,4,5};
        List<Integer> duplicateArr = findDuplicatesArray(arr);
        System.out.println(duplicateArr);
    }
    static List<Integer> findDuplicatesArray(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] -1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            } 
        }


        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1) {
                ans.add(arr[index]);
            }
        }
        return ans;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

}
