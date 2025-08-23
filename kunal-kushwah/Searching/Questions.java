public class Questions {
    public static void main(String[] args) {
        
// Q.1 Ceiling of a Number - Given : arr = [2,3,5,9,14,16,18], target = 15, ceiling = smallest element in array greater or equal to the target element, so if ceiling(arr, target = 14) = 14, if the target is 15 then answer is 16
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = question1(arr, target);
        System.out.println(ans);

// Q.2 Find the floor of a number : floor = greatest number smaller or equal to the target number.
        int[] arr1 = {2,3,5,9,14,16,18};
        int target1 = 15;
        int ans1 = question2(arr1, target1);
        System.out.println(ans1);

// Q.3 Find first and last position of element in sorted array - 
        int[] arr2 = {5,7,7,7,7,8,8,10};
        int target2 = 7;
        System.out.println(question3(arr2, target2));

    }

    static int[] question3(int[] arr2, int target2){

        int[] ans = {-1,-1};

        // check for the first occurence of target first 
        int start = search(arr2, target2, true);
        int end = search(arr2, target2, false);
        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    // this function just returns the index value of target 
    static int search(int[] arr2, int target2, boolean findstartindex){
        int ans = -1;
         int left = 0;
        int right = arr2.length - 1;

        while(left <= right){
        int mid = left + (right - left) / 2; 

            if(target2 < arr2[mid]){
                right = mid - 1;
            } else if(target2 > arr2[mid]){
                left = mid + 1;
            } else {
                // ans found
                ans = mid;
                if(findstartindex){
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return ans;
    }

    static int question2(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
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
        return right;

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
        return left;

    }

}
