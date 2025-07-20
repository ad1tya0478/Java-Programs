// public class array {
//     public static void main(String a[]){
        // int num[] = {1,2,3,4,5};
        
        // for(int i = 0;i<num.length;i++){
        //     System.out.println(num[i]);
        // }


        // Q.1 
        // int num[] = {1,2,3,56,6};
        // int max = num[0];
        // for(int i = 1;i<num.length;i++){
        //     if(num[i] > max){
        //         max = num[i];
        //     }
        // }
        // System.out.println("Max element: " + max);


        // Q.2 
        // int num[] = {2,4,6,8};
        // int counteven = 0;
        // int countodd = 0;
        // for(int i = 0; i<num.length;i++){
        //     if(num[i]%2 == 0){
        //         counteven++;
        //     } else 
        //      countodd++;
        // } 
        // System.out.println("Even count: " + counteven);
        // System.out.println("Odd count: " + countodd);


        // Q.3 
        // int num[] = {2,3,4,5,6,7};
        // boolean sort = true;

        // for(int i = 0;i<num.length - 1;i++){
        //     if(num[i] > num[i + 1]){
        //         sort = false;
        //         break;
        //     }
        // }
        // if(sort)
        //     System.out.println("Array sorted");
        // else 
        //     System.out.println("Array is not sorted");

        // Q.4
        // int num[] = {2,4,5,6,77,8};
        // int max = Integer.MIN_VALUE;
        // int secmax = Integer.MIN_VALUE;

        // for(int i = 0;i<num.length;i++){
        //     if(num[i] > max){
        //         secmax = max;
        //         max = num[i];
        //     } else if (num[i] > secmax && num[i] != max ){
        //         secmax = num[i];
        //     }
        // }
        // System.out.println("Second largest: " + secmax);


        ////// Multidimensional Array /////
        
        // int num[][] = {{1,2,3,4,5}, {6,7,8,9,0}};
        // System.out.println(num[0][4]);

        // int num[][] = {{1,2,3,4}, {5,6,7,8,9}};

        // for(int i = 0; i < num.length;i++){
        //     for(int j = 0; j< num[i].length;j++){
        //         System.out.print(num[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        //// Giving random values in the array /////
        // int nums[][] = new int[3][4];
        

        // for(int i = 0; i < 3;i++){
        //     for(int j = 0; j < 4; j++){
        //         nums[i][j] = (int)(Math.random() * 10);
        //     }
        // }


        // for(int i = 0; i < 3;i++){
        //     for(int j = 0; j < 4; j++){
        //         System.out.print(nums[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // // Enhanced For loop
        // for(int n[]: nums){
        //     for(int m: n){
        //         System.out.print(m + " ");
        //     }
        //     System.out.println();
        // }


        // Q.1 
        // int num[][] = {{1,2,3,4}, {5,6,7,8}};
        // int num1[][] = {{2,4,6,8},{1,3,5,7}};

        // System.out.println("Matrix 1: ");
        // for(int i = 0; i < num.length;i++){
        //     for(int j = 0; j< num[i].length;j++){
        //         System.out.print(num[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // System.out.println("Matrix 2: ");
        // for(int i = 0; i < num1.length;i++){
        //     for(int j = 0; j< num1[i].length;j++){
        //         System.out.print(num1[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        

        // int result[][] = new int[num.length][num1[0].length];

        // for(int i = 0; i < num.length;i++){
        //     for(int j = 0; j< num1[0].length;j++){
        //             result[i][j] += num[i][j] * num1[i][j];
        //     }
        // }

        // System.out.println("Multiplication Result: ");

        // for(int i = 0; i < result.length;i++){
        //     for(int j = 0; j< result[0].length;j++){
        //         System.out.print(result[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // Q.2
        // int num[][] = {{1,2,3,4}, {5,6,7,8}};

        // System.out.println("Original Matrix: ");
        // for(int i = 0; i < num.length;i++){
        //     for(int j = 0; j< num[i].length;j++){
        //         System.out.print(num[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // System.out.println("Transpose Matrix: ");
        // for(int i = 0; i < num[0].length;i++){
        //     for(int j = 0; j< num.length ;j++){
        //         System.out.print(num[j][i] + " ");
        //     }
        //     System.out.println();
        // }
        


        /////// Jagged Array and 3d Array in Java //////
        
        // int nums[][] = new int[3][];    // Jagged array 
        // int nums[][][] = new int[3][4][5];    // 3d dimensional array  

        // // nums[0] = new int[3];
        // // nums[1] = new int[4];
        // // nums[2] = new int[2];
        

        // for(int i = 0; i < nums.length;i++){
        //     for(int j = 0; j < nums[i].length; j++){
        //         nums[i][j] = (int)(Math.random() * 10);
        //     }
        // }

        // for(int n[]: nums){
        //     for(int m: n){
        //         System.out.print(m + " ");
        //     }
        //     System.out.println();
        // }

//     }
// }



/////////// Array Of objects ////////
        

// class Student {
//         int rollno;
//         String name;
//         int marks;
//             }
public class array {
    public static void main(String a[]){
                    
        // Student s1 = new Student();
        // s1.rollno = 1;
        // s1.name = "navin";
        // s1.marks = 67;
        
        // Student s2 = new Student();
        // s2.rollno = 3;
        // s2.name = "harsh";
        // s2.marks = 70;
        
        // Student s3 = new Student();
        // s3.rollno = 3;
        // s3.name = "aditya";
        // s3.marks = 87;
        
        // Student students[] = new Student[3];
        // students[0] = s1;
        // students[1] = s2;
        // students[2] = s3;
        
        // for(int i = 0;i<students.length;i++){
        //     System.out.println(students[i].name + " : " + students[i].marks);
        // }

        // for(Student s : students ){
        //     System.out.println(s.name + " : " + s.marks);
        // }


        /// Enhanced For Loop ///


        // int nums[] = new int[4];
        // nums[0] = 4;
        // nums[1] = 8;
        // nums[2] = 3;
        // nums[3] = 9;
        
        // for(int n : nums){
        //     System.out.println(n);
        // }


///////// Strings ////////

        // String name = new String("Aditya");
        // String name = "Aditya";

        // System.out.println(name);
        // System.out.println("Hello " + name);
        // System.out.println(name.hashCode());
        // System.out.println(name.charAt(1));
        // System.out.println(name.concat(" Sharma"));

        // name = name + " Sharma";
        // System.out.println("Hello " + name);

        StringBuffer sb = new StringBuffer("Aditya");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" Sharma");
        System.out.println(sb);
        System.out.println(sb.length());


    }
}


