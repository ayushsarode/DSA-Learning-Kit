public class SearchInMountain {
    public static void main(String[] args) {
        

    }

    int search(int arr[], int target) {
        int peak = peakInMountain(arr);
    int firstTry = orderAgnosticBinarySearch(arr, target, 0, peak);
    if (firstTry != -1) {
        return firstTry;
    }
    return orderAgnosticBinarySearch(arr, target, peak+1, arr.length-1);



         
    }

    public int peakInMountain(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start< end ) {
            int mid = start + (end-start) /2;
            
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
                
            } else {
                start = mid +1;
            }
        }
        return start;
    }

    static  int orderAgnosticBinarySearch(int[]arr, int target, int start, int end){


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
