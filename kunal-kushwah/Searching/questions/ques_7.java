public class ques_7 {
    public static void main(String[] args) {

        int[] arr = {3,4,5,6,7,0,1,2};
        int target = 2;
        System.out.println(pivot(arr));

    }

    static int pivot(int[] arr){

        int pivot = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(pivot<arr[i]){
                pivot = arr[i];
            }
        }



        return pivot;
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
