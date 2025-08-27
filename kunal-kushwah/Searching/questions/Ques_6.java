public class Ques_6 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
    }

    int search(int[] arr, int target){
        int peak = PeakIndex(arr);
        int firstTry = BinarySearch(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        return BinarySearch(arr, target, peak+1, arr.length-1);
    }

    static int PeakIndex(int[] arr){
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
        int mid = left + (right - left) / 2; 

            if(arr[mid] > arr[mid+1]){
                right = mid;
            } else { 
                left = mid + 1; 
            }

        }
        return left;
    }

    static int BinarySearch(int[] arr, int target, int left, int right){

        left = 0;
        right = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[left] < arr[right];

        while(left <= right){

            int mid = left + (right - left) / 2; 

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if (target < arr[mid]){
                    right = mid - 1;
                } else {
                    left = mid + 1;
                } 
            } else {
                if(target > arr[mid]){
                    right = mid - 1;
                } else {
                    left = mid + 1;
                } 
            }
        }

        return -1;
    }

}
