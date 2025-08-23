public class binarySearch {
    public static void main(String[] args) {
        
      // Binary search - Binary search is all about divide and conquer. the arrar must be sorted(ascending/descending). If it's unsorted binary search is useless. First we put two pointers in the array, LEFT - start of the array, RIGHT - end of the array. Then we find the middle - mid = (LEFT + RIGHT) / 2, and then we compare the arr[mid] with the target.
      
      // 3 possible outcomes - 1. if arr[mid] == target -> found, return index. 2. if arr[mid] < target -> target is grater, so ignore the left half, search in the right half. 3. if arr[mid] > target -> target is smaller, so ignore the right half, search in the left half

      int[] arr = {-18,-12,-3,2,3,4,13,23,42,53,71,79,87};
      int target = -18;
      int ans = binarySearch(arr, target);
      System.out.println("Target found: " + ans + " Index");


      // Order-Agnostic Binary Search 
        int[] arr2 = {99,89,75,64,52,40,12,3};
        int target2 = 12;
        int ans2 = orderAgnosticBinarySearch(arr2, target2);
        System.out.println("Target found: " + ans2 + " Index");

    }

    static int orderAgnosticBinarySearch(int[] arr2, int target2){
        int left = 0;
        int right = arr2.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr2[left] < arr2[right];

        while(left <= right){
            // find the middle element
            // int mid = (left + right) / 2;  // might be possible that (left + right) exceeds the range of int in java

            int mid = left + (right - left) / 2; 

            if(arr2[mid] == target2){
                return mid;
            }

            if(isAsc){
                if (target2 < arr2[mid]){
                    right = mid - 1;
                } else {
                    left = mid + 1;
                } 
            } else {
                if(target2 > arr2[mid]){
                    right = mid - 1;
                } else {
                    left = mid + 1;
                } 
            }
        }

        return -1;

    }

    // return the index 
    static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            // find the middle element
            // int mid = (left + right) / 2;  // might be possible that (left + right) exceeds the range of int in java

            int mid = left + (right - left) / 2; 

            if(target < arr[mid]){
                right = mid - 1;
            } else if(target > arr[mid]){
                left = mid + 1;
            } else {
                // ans found
                return mid;
            }

        }

        return -1;

    }

}
