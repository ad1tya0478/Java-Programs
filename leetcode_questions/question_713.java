public class question_713 {
    public static void main(String[] args) {
        int[] nums = {10,5,2,6};
        System.out.println(numSubArrayProduct(nums, 100));
    }
    static int numSubArrayProduct(int[] nums, int k){

        if(k<=1) return 0;

        int n = nums.length;
        int SubArrCount = 0;
        int left = 0;
        int product = 1;
        for(int right = 0; right < n; right++){

            product *= nums[right];

            while(product >= k){
                product /= nums[left];
                left++;
            }
            SubArrCount += right - left + 1;  

        }

        return SubArrCount;
    }
}
