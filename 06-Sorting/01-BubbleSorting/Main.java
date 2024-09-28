import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        // int[] arr = {5,4,3,2,1};
        int[] arr = {-1,2,-6,4,5, 0};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble (int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length -i; j++) { 
                // swap if the item is smaller than the previos item
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}