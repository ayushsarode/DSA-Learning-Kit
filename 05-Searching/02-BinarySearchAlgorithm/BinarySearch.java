public class BinarySearch {
    public static void main(String[] args) {
        // start with the box of size 2
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(ans(arr, target));
    }

     static int ans(int[] arr, int target) {

    int start = 0;
    int end = 1;

    while (target > arr[end]) {

        int newStart = end + 1;

        //double the box value
        // end = previor end + sizeofbox*2
        end = end + (end - start + 1) * 2; 
        start = newStart;
    }
    //condition for target lie in the range 
    return  BinarySearch(arr, target, start, end);
}

    static int BinarySearch(int[] arr, int target, int start, int end){


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
