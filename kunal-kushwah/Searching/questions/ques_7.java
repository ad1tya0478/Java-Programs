// Search in rotated sorted array
public class ques_7 {
    public static void main(String[] args) {

        int[] arr = {4,5,6,7,0,1,2};
        int target = 2;
        System.out.println(findPivot(arr));

    }

    
    // static int pivot(int[] arr){
    //     int pivot = arr[0];
    //     for(int i = 1; i < arr.length; i++){
    //         if(pivot<arr[i]){
    //             pivot = arr[i];
    //         }
    //     }
    //     return pivot;
    // }

    static int search(int[] arr, int target){
        int pivot = findPivot(arr);

        // if you did not find a pivot, it means array is not rotated
        if(pivot == -1){
            // just do normal binary search
            return BinarySearch(arr, target, 0, arr.length-1);
        }
        // if pivot is found, you have found 2 asc sorted arrays 
        if(arr[pivot] == target){
            return pivot;
        }
        if(target > arr[0]) {
            return BinarySearch(arr, target, 0, pivot-1);
        }
        return BinarySearch(arr, target, pivot+1, arr.length-1);
    }

    static int BinarySearch(int[] arr, int target, int start, int end){

        while(start <= end){
        int mid = start + (end - start) / 2; 

            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }

        }
        return -1;

    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start) / 2; 
            // 4 cases over here
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1; 
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    } 

}
