import java.util.*;

public class twod_array_revision {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Number is mandatory to give, meanwhile number of coloumns is not mandatory
        int[][] arr0 = new int[3][];
        // int[][] arr = {
        //     {1,2,3}, // 0th index 
        //     {4,5,6}, // 1st index
        //     {7,8,9,10,11}  // 2nd index
        // };

        int[][] arr = new int[3][4];

        // input 
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = in.nextInt();
            }
        }
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        in.close();

    }
}
