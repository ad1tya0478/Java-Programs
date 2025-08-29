// Search in rotated sorted array
public class ques_7 {
    public static void main(String[] args) {

        int[] arr = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        int target = 2;
        System.out.println(ModifiedBinary(arr, target, 0, arr.length-1));
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

    static boolean search(int[] arr, int target){
        int pivot = findPivot(arr);

        // if you did not find a pivot, it means array is not rotated
        if(pivot == -1){
            // just do normal binary search
            return BinarySearch(arr, target, 0, arr.length-1) != -1;
        }
        // if pivot is found, you have found 2 asc sorted arrays 
        if(arr[pivot] == target){
            return true;
        }
        if(target > arr[0]) {
            return BinarySearch(arr, target, 0, pivot-1) != -1;
        }
        return BinarySearch(arr, target, pivot+1, arr.length-1) != -1;
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

    // modified binary search 
    static boolean ModifiedBinary(int[] arr, int target, int start, int end){

        while(start <= end){
        int mid = start + (end - start) / 2; 

            if(arr[mid] == target) return true;

            // Case: 1
            if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                start++;
                end--;
            }
            // Case: 2
            else if(arr[start] <= arr[mid]){
                if(arr[start] <= target && target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } 
            // Case: 3
            else {
                if(arr[mid] < target && target <= arr[end]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

            }
            
            return false;
        }

}
