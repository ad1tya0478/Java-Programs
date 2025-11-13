import java.util.Scanner;


// public class index {
// public static void main(String[] args) {

    // int[][] a = new int[3][4];
    // Scanner sc = new Scanner(System.in);
    // for(int i = 0;i < 3;i++){
    //     for(int j = 0;j<4;j++){
    //         a[i][j] = sc.nextInt();
    //     }
    // }
    // System.out.println("The matrix: ");
    // for(int i = 0;i < 3;i++){
    //     for(int j = 0;j<4;j++){
    //         System.out.print(a[i][j] + "  ");
    //     }
    //     System.out.println();
    // }


    // int num = 1;
    // while(num%2==0){
    //     System.out.println(num);
    //     num++;
    // }

    // for (int i=1;i<=5;i++){
    //             for( int j=5;j>=i;j--){
    //                     System.out.print(j + " ");
    //             }
    //             System.out.println();
    //     }
    //     System.out.println();

    //     for (int i=1;i<=5;i++){
    //             for( int j=1;j<=i;j++){
    //                     System.out.print(i + " ");
    //             }
    //             System.out.println();
    //     }
        // System.out.println();

        // for (int i=1;i<=5;i++){
        //         for( int j=1;j<=i;j++){
        //                 System.out.print(j + " ");
        //         }
        //         System.out.println();
        // }
        // System.out.println();

        // int number = 1;
        // for (int i=1;i<=5;i++){
        //         for( int j=1;j<=i;j++){
        //                 System.out.print(number + " ");
        //                 number++;
        //         }
        //         System.out.println();
        // }
        // System.out.println();


        // for (int i=5;i>=1;i--){
        //         for( int j=1;j<=i;j++){
        //                 System.out.print(j + " ");
        //         }
        //         System.out.println();
        // }
        // System.out.println();

        // for (int i=1;i<=5;i++){
        //         for( int j=i;j<=5;j++){
        //             System.out.print(" ");
        //         }
        //             for(int k = 1;k<=i;k++){
        //                 System.out.print(k + " ");
        //             }
        //         System.out.println();
        // }
        // System.out.println();

        // for (int i=1;i<=5;i++){
        //         for( int j=i;j<=5;j++){
        //             System.out.print("  ");
        //         }
        //             for(int k = 1;k<=i;k++){
        //                 System.out.print(k + " ");
        //             }
        //         System.out.println();
        // }
        // System.out.println();


        

        // int val = 2;
        // int[] nums = {3,2,2,3};
        // int k = 0;
        // for(int i = 0;i<nums.length;i++){
        //     if(nums[i] != val){
        //         nums[k] = nums[i];
        //         k++;
        //     }
        // }

        // System.out.println(closest(2, 4, 7));


        // String a = "thequickbrownfoxjumpsoverthelazydog";
        // System.out.println(sentence(a));


        // int[] nums = {2,2,1};
        // int result = 0;
        // for(int i = 0;i < nums.length;i++){
        //     result ^= nums[i];
        // }
        // System.out.println(result);

    //     int[] nums = {1,1,2};
        



    // }

    // static int closest(int x, int y, int z){
    //     int Intx = Math.abs(x-z);
    //    int Inty = Math.abs(y-z);
    //    if(Intx < Inty) return 1;
    //    if(Intx > Inty) return 2;  

    //     return 0;
    // }

    // static boolean sentence(String a){
        
    //     if(a.length() < 26) return false;
        
    //     return true;
    // }

// }


// Write a program to demonstrate the exception handling in java. Hint use try & catch block 

// public class index {
//     public static void main(String[] args) {
//         try {
//             int a = 10;
//             int b = 0;
//             int result = a / b;
//             System.out.println("Result: " + result);
//         } 
//         catch (ArithmeticException e) {
//             System.out.println("Cannot divide a number by Zero.");
//         }
//     }
// }

// Write a program to demonstrate the concepts of functions(methods) in java (function with parameter and return type)
// public class index{
//     public static void main(String[] args) {
//         System.out.println(add(90,10));
//     }
//     static int add(int a,int b){
//         int result = a + b;
//         return result;
//     }
// }


public class index{
    public static void main (String[] args){
        int N1;
        int N2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value :" );
        N1 = sc.nextInt();
        System.out.println("Enter the second value :");
        N2 = sc.nextInt();

        System.out.println("Enter the operator :");
        String operator = sc.next();

        switch (operator){
            case "+" :
                System.out.println("Add the values:" + (N1 + N2));
                break;
            case "-" :
                System.out.println("Subtract the value:" + (N1-N2) );
                break;
            case "*" :
                System.out.println("Multiply the value:" + (N1 * N2));
                break;
            case "/" :
                try{
                    System.out.println("Divide the value:" +(N1 / N2));
                } catch (ArithmeticException e){
                    System.out.println("not divisible by zero");
                }
        }

    }
}

