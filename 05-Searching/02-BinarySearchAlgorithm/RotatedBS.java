public class RotatedBS {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
    }

    static void binarySearch(int[] nums, int target) {
        int pivot = findPivot(nums);

        //didnt find a pivot, it means the array is not rotated 
        if (pivot == -1) {
            
        }
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length -1;

        while (start <= end ) {
            //4 cases here
            int mid = start + (end - start)/2;
            
            if (mid< end && arr[mid] > arr[mid+1]) {
                 return mid;
            }
            if (mid>start && mid < arr[mid-1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid-1;
            } else {
                start = mid + 1; 
            }
        }
        return -1;
    }
}
