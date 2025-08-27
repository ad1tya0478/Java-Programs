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

// Q.4 - Find position of an element in a sorted array of infinite numbers 
        int[] arr3 = {2,3,5,6,7,8,10,11,12,15,20,23,30,33,39,45};
        int target3 = 15;
        System.out.println(findingAns4(arr3, target3));

// Q.5 - Peak index in a mountain array
        int[] arr4 = {1,2,3,5,7,6,3,2};
        System.out.println(question5(arr4));
 
    }

    static int question5(int[] arr4){
        int left = 0;
        int right = arr4.length - 1;

        while(left < right){
        int mid = left + (right - left) / 2; 

            if(arr4[mid] > arr4[mid+1]){
                // you are in the desc part of the array 
                // this may be the ans, but look at left
                // this is why end != mid - 1;
                right = mid;
            } else {
                // you are in the asc part of the array 
                left = mid + 1; // beacuse we know that mid + 1 element > mid element
            }

        }
        // in the end, start == and and pointing to the largest number because of the 2 checks above
        // left and right are always trying to find max element in the above 2 checks 
        // hence when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for left and right, they have the best possible answeer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return left; // or return and as both are equal 
    }

    static int findingAns4(int[] arr3, int target3){
        // first find the range 
        // first start with a box of size 2.
        int left = 0;
        int right = 1;

        // condition for the target to lie in the range 
        while(target3 > arr3[right]){
            int temp = right + 1; // this is my new left
            // double the box value
            // right = previous right + sizeofbox+2
            right = right + (right - left + 1) * 2;
            left = temp;
        }

        // make sure right doesn’t go beyond array length
        if (right >= arr3.length) {
            right = arr3.length - 1;
        }

        return questions4(arr3, target3, left, right);
    }

    static int questions4(int[] arr3, int target3, int left, int right){

        while(left <= right){
        int mid = left + (right - left) / 2; 

            if(target3 < arr3[mid]){
                right = mid - 1;
            } else if(target3 > arr3[mid]){
                left = mid + 1;
            } else {
                // ans found
                return mid;
            }

        }

        return -1;
    }

    static int[] question3(int[] arr2, int target2){

        int[] ans = {-1,-1};

        // check for the first occurence of target first 
        int start = search3(arr2, target2, true);
        int end = search3(arr2, target2, false);
        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    // this function just returns the index value of target 
    static int search3(int[] arr2, int target2, boolean findstartindex){
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
