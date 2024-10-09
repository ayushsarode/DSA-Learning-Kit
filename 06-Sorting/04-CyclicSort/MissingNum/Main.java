// 268. Missing Number
// https://leetcode.com/problems/missing-number/

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1}; // Fixed missing semicolon
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            // Ensure correct is within bounds and that the current element is not in the right place
            if (correct < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        // Find the first index that does not have the correct number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index; // Return the missing number
            }
        }

        return arr.length; // If all numbers are in place, the missing number is n
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
