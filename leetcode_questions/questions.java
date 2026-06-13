// public class questions {
//     public static void main(String[] args) {

//         System.out.println(findNthDigit(250));

//     }
//     static int findNthDigit(int n) {
        
//         long digitlength = 1;    // currently looking at one digit numbers
//         int start = 1;           // first number of current block
//         int end = 9;             // how many numbers exist in this current block 

//         while(n > digitlength*end){  // this check does the nth digit lies beyond the current block ?
//             n -= digitlength*end;
//             digitlength++;
//             start*=10;
//             end*=10;
//         }  // with this loop we find which digit block is the nth digit in. for example if n = 250 then it is not in the first two digit-blocks(1-9 and 10-180), it is in the 3-digit block that contains 2700 numbers which is our end variable here.
            
//         start += (n-1)/digitlength;  // here if we solve it with start = 100, n = 61, Digit-length = 3, then the asnwers is 120 and that is the number we need 
//         String number = String.valueOf(start); // accessing digits is easier in this 

//         int index = (int) ((n-1) % digitlength);  // now here we get the remainder and that remainder is the index we need becuase that index holds the our answer, and that is index = 0, digit = 1.
//         return number.charAt(index) - '0';

//     }
// }



//////////////// 2144. Minimum Cost of Buying Candies With Discount ///////


import java.util.Arrays;

public class questions{
    public static void main(String[] args) {

        int[] cost = {2,4,3,7,4,8};
        int a = minimumCost(cost);
        System.out.println(a);

    }
    static int minimumCost(int[] cost) {

        Arrays.sort(cost);

        int totalfee = 0;
        int count = 0;

        for(int i = cost.length - 1; i >= 0; i--){
            count++;

            if(count == 3){
                count = 0; 
                continue;
            }

            totalfee = totalfee + cost[i];

        }
        return totalfee;
    }
}




