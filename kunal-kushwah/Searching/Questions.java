public class Questions {
    public static void main(String[] args) {
        
// Q.1 Ceiling of a Number - Given : arr = [2,3,5,9,14,16,18], target = 15, ceiling = smallest element in array greater or equal to the target element, so if ceiling(arr, target = 14) = 14, if the target is 15 then answer is 16
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = question1(arr, target);
        System.out.println(ans);

    }

    static int question1(int[] arr, int target){
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
        return arr[left];

    }

}
