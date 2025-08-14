import java.lang.reflect.Array;
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

        int[][] arr = new int[3][2];
        // input 
        for(int row = 0;row<arr.length;row++){ 
            for(int col = 0;col < arr[row].length;col++){
               arr[row][col] = in.nextInt(); 
            }
        }


    }
    // static void change(int[] arr){
    //     arr[0] = 99;
    // }
}
