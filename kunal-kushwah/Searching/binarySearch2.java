public class binarySearch2 {
    public static int binSearch(int target, int[] arr){
        int result = 0;
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) return mid;
    
            if(isAsc) {
                if(target < arr[mid]) end = mid - 1;
                else if(target > arr[mid]) start = mid + 1; 
            } else {
                if(target > arr[mid]) end = mid - 1;
                else if(target < arr[mid]) start = mid + 1; 
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {12,11,10,9,8,7,6,5,4,3,2,1};
        // int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
        System.out.println(binSearch(2, arr));
    }
}
