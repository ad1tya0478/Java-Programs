public class question_2302 {
    public static void main(String[] args) {
        
        int[] nums = {2,1,4,3,5};
        System.out.println(countSubArrays(nums, 10));

    }
    static long countSubArrays(int[] nums, long k){

        int n = nums.length;
        int left = 0;
        long numberOfSubarr = 0;
        long sum = 0;
        for(int right = 0; right < n; right++){
            sum += nums[right];
            while(sum * (right - left + 1) >= k){
                sum -= nums[left++];
            }
            numberOfSubarr += (right - left + 1);
        } 

        return numberOfSubarr;
    }
}
