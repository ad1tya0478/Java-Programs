public class searching {
    public static void main(String[] args) {
        // Linear Search 

        int[] arr = {23,34,65,23,69,34,787,6};
        int target = 69;

        int ans = linearSearch(arr, target);

        System.out.println("Element found at: " + ans);

    }

    // Search the target and return the element 
    static int linearSearch2(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        // run a for loop
        for(int i = 0; i < arr.length; i++){
            // cheack for element at every index if it is = target
            if(arr[i] == target){
                return i;
            }
        }

        return -1;

    }

    // Search in the array: return the index of item found, otherwise if item not found return -1.
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        // run a for loop
        for(int i = 0; i < arr.length; i++){
            // cheack for element at every index if it is = target
            if(arr[i] == target){
                return i;
            }
        }

        return -1;

    }

}
