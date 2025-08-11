import java.util.Scanner;
public class index {
public static void main(String[] args) {

    int[][] a = new int[3][4];
    Scanner sc = new Scanner(System.in);
    for(int i = 0;i < 3;i++){
        for(int j = 0;j<4;j++){
            a[i][j] = sc.nextInt();
        }
    }
    System.out.println("The matrix: ");
    for(int i = 0;i < 3;i++){
        for(int j = 0;j<4;j++){
            System.out.print(a[i][j] + "  ");
        }
        System.out.println();
    }


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


        



    }
}






