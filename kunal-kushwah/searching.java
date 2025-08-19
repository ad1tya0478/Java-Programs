public class searching {
    public static void main(String[] args) {
        // Linear Search 

        // int[] arr = {23,34,65,23,69,34,787,6};
        // int target = 69;

        // int ans = linearSearch(arr, target);
        // int ans2 = linearSearch2(arr, target);

        // System.out.println("Element found: " + ans2);
        // System.out.println("Element found at index: " + ans);

        // linear search in string
        String name = "aditya";
        char target = 'y';
        System.out.println(linearSearch3(name, target));
    }

    // Search the target and return the element 
    // static int linearSearch2(int[] arr, int target){
    //     if(arr.length == 0){
    //         return -1;
    //     }

    //     // run a for loop
    //     for(int i = 0; i < arr.length; i++){
    //         // cheack for element at every index if it is = target
    //         int element = arr[i];
    //         if(element == target){
    //             return element;
    //         }
    //     }

    //     return -1;

    // }

    // Search in the array: return the index of item found, otherwise if item not found return -1.
    // static int linearSearch(int[] arr, int target){
    //     if(arr.length == 0){
    //         return -1;
    //     }

    //     // run a for loop
    //     for(int i = 0; i < arr.length; i++){
    //         // cheack for element at every index if it is = target
    //         if(arr[i] == target){
    //             return i;
    //         }
    //     }

    //     return -1;

    // }

    // Searching in String 
    static boolean linearSearch3(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(int i = 0; i < str.length(); i++ ){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

}
