import java.util.Arrays;

public class Mismatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        int[] result = findErrorNums(arr);
        System.out.println(Arrays.toString(result));
    }

    static int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;

            if ( arr[correct] != arr[i]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // search for first missing number 
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return new int [] {arr[index], index + 1};
            }
        }
            return new int[] {-1, -1};

    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
