import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);        

// array - A container that holds multiple values of the same data type in a single variable. Fixed size, index starts from 0 to length - 1. 

// 1. Array objects are in heap | 2. Heap objects are not continous | 3. Dynamic memory allocation || Array may not be continous - depends on the JVM
// new keyword is used to create an object | we cannot assign null to an int 

        // datatype[] variable_name = new datatype[size];
        // int[] rnos = new int[5];

        // // directly 
        // int[] arr = {1,2,3,4,5};

        // String[] arr1 = new String[4];
        // System.out.println(arr1[0]);

        // 
        // int[] arr = new int[5];
        // arr[0] = 18;
        // arr[1] = 19;
        // arr[2] = 20;
        // arr[3] = 21;
        // arr[4] = 22;
        // System.out.println(arr[3]);


        // input using for loops 
        // for(int i = 0;i<arr.length;i++){
        //     arr[i] = in.nextInt();
        // }

        // for(int j : arr){
        //     System.out.print(j + " ");
        // }
      
// toString() is a method in Java that returns a string representation of an object, mainly used to describe its contents in a human-readable form.
        // System.out.println(Arrays.toString(arr));


        // array of objects 
        // String[] str = new String[4];
        // for(int i = 0; i < str.length;i++){
        //     str[i] = in.next();
        // }
        // System.out.println(Arrays.toString(str));

        // // modify 
        // str[1] = "Adi";
        // System.out.println(Arrays.toString(str));



        // int[] nums = {1,2,3,4,5,6};
        // System.out.println(Arrays.toString(nums));
        // change(nums);
        // System.out.println(Arrays.toString(nums));


// Multidimensional array // - an array of arrays
        // int[][] arr = new int[3][];

        // int[][] arr = {
        //     {1,2,3},
        //     {4,5},
        //     {6,7,8,9}
        // };

        // int[][] arr = new int[3][3];
        // // input 
        // for(int row = 0;row<arr.length;row++){ 
        //     for(int col = 0;col < arr[row].length;col++){
        //        arr[row][col] = in.nextInt(); 
        //     }
        // }
        // output 
        // 1.
        // for(int row = 0;row<arr.length;row++){ 
        //     for(int col = 0;col < arr[row].length;col++){
        //        System.out.print(arr[row][col] + " ");
        //     }
        //     System.out.println();
        // }
        // // 2. 
        // for(int row = 0;row<arr.length;row++){ 
        //     System.out.println(Arrays.toString(arr[row]));
        // }
        // // 3. 
        // for(int[] a : arr){ 
        //     System.out.println(Arrays.toString(a));
        // }


        // matrix without defined columns
        // int[][] arr1 = new int[3][];
        // for(int row = 0;row<arr1.length;row++){ 

        //     int cols = in.nextInt();

        //     arr1[row] = new int[cols]; // allocate innner array

        //     for(int col = 0;col < arr1[row].length;col++){
        //        arr1[row][col] = in.nextInt(); 
        //     }
        // }
        // for(int[] a : arr1){ 
        //     System.out.println(Arrays.toString(a));
        // }


// Array list //
// why we need it - It comes with built-in methods: add(), remove(), contains(), indexOf(), etc. Arrays are fixed-size — once you say new int[5], you’re stuck with 5 slots. ArrayList grows/shrinks automatically — no manual copying into bigger arrays.
// simply we use arraylist when we don't know how much size of the array we need 
// now what is arraylist - A resizable array implementation of the List interface (from java.util). Stores elements in a contiguous block of memory internally, but automatically handles resizing for you.

        // Syntax 
        // ArrayList<Integer> list = new ArrayList<>(10);

        // list.add(12);
        // list.add(13);
        // list.add(14);
        // list.add(15);
        // list.add(16);
        // list.add(17);
        

        // System.out.println(list);
        // System.out.println(list.contains(23));

        // list.set(0, 99);
        // System.out.println(list);

        // list.remove(2);
        // System.out.println(list);

        // input 
        // for(int i = 0; i < 5;i++){
        //     list.add(in.nextInt());
        // }

        // get any item at any index 
        // for(int i = 0; i < 5;i++){
        //     System.out.print(list.get(i)); // pass index here, list[index] sysntax will not work here
        // }

        // and arraylist for multi-deimensional 
        // ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // // initialization 
        // for (int i = 0; i < 3; i++) {
        //     list.add(new ArrayList<>());
        // }

        // // add elements 
        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         list.get(i).add(in.nextInt());
        //     }
        // }

        // System.out.println(list);

//////////////////////////////////////////////////////

// Q.1
    //     int[] arr2 = {1,2,3,4,5};
    //     swap(arr2, 0, 4);
    //     System.out.println(Arrays.toString(arr2));
 
// Q.2 - Reversing an array
        
//         int[] arr = {1,2,3,4,5};

//         reverse(arr);
//         System.out.println("Reversed Arrays: " + Arrays.toString(arr));

// Q.3 - swap two values 
        // int[] arr = {1,2,3,4,5};

        // swapTwo(arr);
        // System.out.println(Arrays.toString(arr));

// Q.4 - sorted array check 
        // int[] arr = {1,4,6,8,9,13};
        // if(isSorted(arr)){
        //         System.out.println("Array is sorted in ascending order.");
        // } else {
        //         System.out.println("Array in not sorted.");
        // }

// Q.5 - 

    }

//     static boolean isSorted(int[] arr){
//         for(int i = 0;i< arr.length - 1;i++){
//                 if(arr[i] > arr[i + 1]){
//                         return false;
//                 }
//         }
//         return true;
//     }


//     static void swapTwo(int[] arr){
//         int num1 = 1;
//         int num2 = 3;

//         int temp = arr[num1];
//         arr[num1] = arr[num2];
//         arr[num2] = temp;
//     }

//     static void reverse(int[] arr){
//         int start = 0;
//         int end = arr.length - 1;

//         while(start < end){
//                 int temp = arr[start];
//                 arr[start] = arr[end];
//                 arr[end] = temp;

//                 start++;
//                 end--;
//         }
//     }


    // static void swap(int[] arr, int index, int index2){
    //     int temp = arr[index];
    //     arr[index] = arr[index2];
    //     arr[index2] = temp;
    // }

    // static void change(int[] arr){
    //     arr[0] = 99;
    // }
}
