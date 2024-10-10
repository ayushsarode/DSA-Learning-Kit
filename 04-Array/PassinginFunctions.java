import java.lang.reflect.Array;
import java.util.Arrays;

public class PassinginFunctions {

    public static void main(String[] args) {
        // Create an integer array 'num' with four elements.
        int[] num = {3, 4, 5, 12};

        // Print the original array 'num'.
        System.out.println(Arrays.toString(num));

        // Call the 'change' method, passing the 'num' array as an argument.
        change(num);

        // Print the modified 'num' array after calling the 'change' method.
        System.out.println(Arrays.toString(num));
    }

    // Define a static method 'change' that takes an integer array 'arr' as a parameter.
    static void change(int[] arr) {
        // Change the first element of the 'arr' to 88.
        arr[0] = 88;
    }

}
