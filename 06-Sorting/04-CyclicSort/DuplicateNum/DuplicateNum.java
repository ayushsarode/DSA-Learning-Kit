
import java.util.Arrays;

public class DuplicateNum {
    public static void main(String[] args) {
        int[] arr = {2,1,4,3,5,3};
        int duplicate = findDuplicate(arr);
        System.out.println(duplicate);
    }

    static int findDuplicate(int[] arr) {
        int i = 0;
        while(i < arr.length) {
//here if there duplicate array it should not be arr[i]== i + 1
            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                return arr[i];
                }
            } else {
                i++;
            }
            
        }
        return -1;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
